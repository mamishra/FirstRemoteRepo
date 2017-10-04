package com.cg.trainee.dtos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="TRAINEE")
public class Trainee implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int tId;
	private String tName;
	private String tLocation;
	private String tDomain;
	
	
	public Trainee() {
		super();
	}


	@Id
	public int gettId() {
		return tId;
	}


	public void settId(int tId) {
		this.tId = tId;
	}


	@Column(name="TNAME")
	public String gettName() {
		return tName;
	}


	public void settName(String tName) {
		this.tName = tName;
	}


	public String gettLocation() {
		return tLocation;
	}


	public void settLocation(String tLocation) {
		this.tLocation = tLocation;
	}


	public String gettDomain() {
		return tDomain;
	}


	public void settDomain(String tDomain) {
		this.tDomain = tDomain;
	}



	@Override
	public String toString() {
		return "Trainee [tId=" + tId + ", tName=" + tName + ", tLocation="
				+ tLocation + ", tDomain=" + tDomain + "]";
	}
	
	
	

	
	
	
}
