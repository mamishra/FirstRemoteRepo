package com.capgemini.hotelbooking.daos;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

import com.capgemini.hotelbooking.beans.BookingBean;
import com.capgemini.hotelbooking.beans.HotelBean;
import com.capgemini.hotelbooking.beans.RoomBean;
import com.capgemini.hotelbooking.exceptions.BookingException;

@Repository
public class CustomerDao implements ICustomerDao {
	static Logger myLogger = Logger.getLogger("myLogger");

	@PersistenceContext
	private EntityManager entityManager;
	
	private void updateAvailabililtyOnCheckIn(int roomID){
		myLogger.info("Execution in updateAvailability()");
		RoomBean roomBean = entityManager.find(RoomBean.class, roomID);
		roomBean.setAvailable('F');
		myLogger.info("Room Table Updated."
				+ "\nRoom ID : " + roomID
				+ "availability : " + 'F');
	}

	@Override
	public void bookRoom(BookingBean bookingBean) throws BookingException {
		myLogger.info("Execution in bookRoom()");
		entityManager.persist(bookingBean);
		myLogger.info("New Entry -> Booking ID : "+ bookingBean.getBookingID()
					+ "\nRoom ID : " + bookingBean.getRoomID()
					+ "\nUser ID : " + bookingBean.getUserID()
					+ "\nBooked From Date : " + bookingBean.getBookedFrom()
					+ "\nBooked To Date : " + bookingBean.getBookedTo()
					+ "\nNumber of adults : " + bookingBean.getNumAdults()
					+ "\nNumber of children : " + bookingBean.getNumChildren()
					+ "\nAmount : " + bookingBean.getAmount());
		updateAvailabililtyOnCheckIn(bookingBean.getRoomID());
	}

	@Override  
	public List<List<Object>> viewBookingStatus(int userId) throws BookingException {
		List<BookingBean> bookingList = new ArrayList<BookingBean>();
		myLogger.info("Execution in viewBookingStatus()");
		updateAvailabilityAfterCheckout();
		String query = "SELECT b FROM BookingBean b WHERE b.userID = :userId AND b.status='active'";
		TypedQuery<BookingBean> qry = entityManager.createQuery(query, BookingBean.class);
		qry.setParameter("userId", userId);
		bookingList = qry.getResultList();
		
		List<List<Object>> statusList = new ArrayList<List<Object>>();
		for(BookingBean bookingBean : bookingList){
			List<Object> status = new ArrayList<Object>();
			int roomID = bookingBean.getRoomID();
			RoomBean roomBean = entityManager.find(RoomBean.class, roomID);
			int hotelID = roomBean.getHotelID();
			HotelBean hotelBean = entityManager.find(HotelBean.class, hotelID);
			status.add(bookingBean);
			status.add(roomBean);
			status.add(hotelBean);
			statusList.add(status);
		}
		return statusList;
	}

	@Override
	public List<RoomBean> searchAvailableRooms(String city) throws BookingException {
		List<RoomBean> roomList = new ArrayList<RoomBean>();
		updateAvailabilityAfterCheckout();
		myLogger.info("Execution in searchAvailableRooms()");
		String query = "SELECT r FROM RoomBean r where r.available='T' AND r.status='active' AND r.hotelID in (select h.hotelID from HotelBean h where LOWER(city) = :city AND h.status='active') ";
		TypedQuery<RoomBean> qry = entityManager.createQuery(query, RoomBean.class);
		qry.setParameter("city", city);
		roomList = qry.getResultList();
		return roomList;
	}

	@Override
	public List<Integer> getBookingIDs(int userId) throws BookingException {
		List<Integer> bookingIdList = new ArrayList<Integer>();
		updateAvailabilityAfterCheckout();
		String query = "SELECT b.BookingID FROM BookingBean b where userID=:userId and b.status='active'";
		TypedQuery<Integer> qry = entityManager.createQuery(query, Integer.class);
		qry.setParameter("userId", userId);
		bookingIdList = qry.getResultList();
		return bookingIdList;
	}
	
	private void updateAvailabilityAfterCheckout() throws BookingException {
		myLogger.info("Execution in updateAvailabilityAfterCheckout()");
		Date currentDate = new Date();
		String query = "SELECT b FROM BookingBean b";
		TypedQuery<BookingBean> qry = entityManager.createQuery(query, BookingBean.class);
		List<BookingBean> bookingList = qry.getResultList();
		for(BookingBean bookingBean : bookingList){
			if(bookingBean.getBookedTo().compareTo(currentDate) < 0){
				int roomID = bookingBean.getRoomID();
				bookingBean.setStatus("inactive");
				RoomBean roomBean = entityManager.find(RoomBean.class, roomID);
				roomBean.setAvailable('T');
			}
		}
		myLogger.info("BookingDetails and RoomDetails Table Updated.");
	}
}
