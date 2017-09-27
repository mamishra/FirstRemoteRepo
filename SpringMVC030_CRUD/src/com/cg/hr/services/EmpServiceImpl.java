package com.cg.hr.services;

import java.util.List;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.cg.hr.daos.EmpDao;
import com.cg.hr.dtos.Employee;
import com.cg.hr.exceptions.EmpException;


@Service
@Transactional
public class EmpServiceImpl implements EmpService {

	@Resource
	private EmpDao dao;
	
	@Override
	public List<Employee> getEmpList() throws EmpException {
		
		
		return dao.getEmpList();
	}

	@Override
	public Employee getEmpOnId(int empNo) throws EmpException {
		
		
		return dao.getEmpOnId(empNo);
	}

	@Override
	public void insertNewEmployee(Employee emp) throws EmpException {
		// TODO Auto-generated method stub
		dao.insertNewEmployee(emp);
	}

	@Override
	public void updateEmpName(int empNo, String empNm) throws EmpException {
		// TODO Auto-generated method stub
		
		dao.updateEmpName(empNo, empNm);
		
	}

	@Override
	public List<Integer> getEmpNoList() throws EmpException {
		// TODO Auto-generated method stub
		return dao.getEmpNoList();
	}

}
