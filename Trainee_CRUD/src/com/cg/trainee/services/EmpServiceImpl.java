package com.cg.trainee.services;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.cg.trainee.daos.EmpDao;
import com.cg.trainee.dtos.Trainee;
import com.cg.trainee.exceptions.EmpException;


@Service
@Transactional
public class EmpServiceImpl implements EmpService {

	@Resource
	private EmpDao dao;
	


	@Override
	public List<Trainee> getTraineeList() throws EmpException {
		// TODO Auto-generated method stub
		return dao.getTraineeList();
	}

	@Override
	public Trainee getTraineeOnId(int tId) throws EmpException {
		// TODO Auto-generated method stub
		return dao.getTraineeOnId(tId);
	}

	@Override
	public void insertNewTrainee(Trainee trainee) throws EmpException {
		// TODO Auto-generated method stub
		dao.insertNewTrainee(trainee);
	}

	@Override
	public void delete(int tId) throws EmpException {
		// TODO Auto-generated method stub
		dao.delete(tId);
	}

	@Override
	public boolean update(int tId, String tName, String tLocation, String tDomain) throws EmpException {
		// TODO Auto-generated method stub
		
		
		return dao.update(tId, tName, tLocation, tDomain);
	}

}
