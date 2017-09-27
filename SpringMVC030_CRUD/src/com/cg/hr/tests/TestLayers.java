package com.cg.hr.tests;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.hr.dtos.Employee;
import com.cg.hr.exceptions.EmpException;
import com.cg.hr.services.EmpService;

public class TestLayers {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:EmpManagement.xml");
		
		try {
			EmpService service = ctx.getBean(EmpService.class);//it will find out the class implementing the interface and make bean
			List<Employee> empList = service.getEmpList();
			
			System.out.println(empList);
			ctx.close();
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EmpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
