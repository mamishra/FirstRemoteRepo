package com.cg.trainee.services;

import java.util.List;

import com.cg.trainee.dtos.Trainee;
import com.cg.trainee.exceptions.EmpException;

public interface EmpService {

	

	
	
	List<Trainee> getTraineeList() throws EmpException;
	Trainee getTraineeOnId(int tId) throws EmpException;
	void insertNewTrainee(Trainee trainee) throws EmpException;
	void delete(int tId) throws EmpException;
	boolean update(int tId, String tName, String tLocation, String tDomain) throws EmpException;
}
