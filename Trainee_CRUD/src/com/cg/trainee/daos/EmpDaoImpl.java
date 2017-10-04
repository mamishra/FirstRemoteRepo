package com.cg.trainee.daos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.trainee.dtos.Trainee;
import com.cg.trainee.exceptions.EmpException;

@Repository
public class EmpDaoImpl implements EmpDao {

	
	@PersistenceContext
	private EntityManager manager;



	@Override
	public List<Trainee> getTraineeList() throws EmpException {
		// TODO Auto-generated method stub
		String strQry = "SELECT t FROM Trainee t";
		TypedQuery<Trainee> qry = manager.createQuery(strQry, Trainee.class);
		List<Trainee> traineeList = qry.getResultList();
		return traineeList;
	}

	@Override
	public Trainee getTraineeOnId(int tId) throws EmpException {
		// TODO Auto-generated method stub
		return manager.find(Trainee.class, tId);
	}

	@Override
	public void insertNewTrainee(Trainee trainee) throws EmpException {
		// TODO Auto-generated method stub
		manager.persist(trainee);
	}

	@Override
	public void delete(int tId) throws EmpException {
		// TODO Auto-generated method stub
		
		Trainee train = manager.find(Trainee.class, tId);
		manager.remove(train);
	}

	@Override
	public boolean update(int tId, String tName, String tLocation, String tDomain) throws EmpException {
		// TODO Auto-generated method stub
		
		Trainee trainee = manager.find(Trainee.class, tId);
		
		//trainee.settId(tId);
		trainee.settName(tName);
		trainee.settLocation(tLocation);
		trainee.settDomain(tDomain);
		
		return true;
	}

	

}
