package com.cg.hr.daos;

import java.util.List;

import com.cg.hr.dtos.Employee;
import com.cg.hr.exceptions.EmpException;

public interface EmpDao {

	List<Employee> getEmpList() throws EmpException;
	Employee getEmpOnId(int empNo) throws EmpException;
	void insertNewEmployee(Employee emp) throws EmpException;
	void updateEmpName(int empNo, String empNm) throws EmpException;
	List<Integer> getEmpNoList() throws EmpException;
}
