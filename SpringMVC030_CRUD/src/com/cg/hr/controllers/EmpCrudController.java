package com.cg.hr.controllers;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.hr.dtos.Employee;
import com.cg.hr.exceptions.EmpException;
import com.cg.hr.services.EmpService;


@Controller
public class EmpCrudController {

	@Resource
	private EmpService service;
	
	@RequestMapping("/getEmpList.do")
	public ModelAndView getEmpList() throws EmpException{
		
		List<Employee> empList = service.getEmpList();
		ModelAndView mAndV = new ModelAndView();
		mAndV.addObject("empList", empList);
		mAndV.addObject("pageHead", "Employee List");
		
		//controller returns alias name of jsp
		//view resolver will fabricate the complete name
		mAndV.setViewName("EmpList");
		return mAndV;
	}
	
	@RequestMapping("/getEmpDetails.do")//requestparam acts as request .getparameter
	public ModelAndView getEmpDetails(@RequestParam("empNo") int empNo) throws EmpException{
		
		Employee emp = service.getEmpOnId(empNo);
		
		ModelAndView mAndV = new ModelAndView();
		mAndV.addObject("emp", emp);
		mAndV.addObject("pageHead", "Employee Details");
		
		mAndV.setViewName("EmpDetails");
		return mAndV;

	}
	
	@RequestMapping(value="/submitEmpDetails.do", method=RequestMethod.POST)//requestparam acts as request .getparameter
	public String submitEmpDetails(@ModelAttribute("employee") Employee emp, Model mAndV) throws EmpException{
		
		System.out.println(emp);
		service.insertNewEmployee(emp);
		
		mAndV.addAttribute("emp", emp);
		mAndV.addAttribute("pageHead", "Successful Joining of Employee");
		
		return "SuccEmpJoining";

	}
	
	@RequestMapping(value="/submitNewEmpName.do", method=RequestMethod.GET)//requestparam acts as request .getparameter
	public String submitNewEmpName(@RequestParam("empNo") int empNo, @RequestParam("newName") String newName, Model mAndV) throws EmpException{
		
		System.out.println(empNo+" "+newName);
		service.updateEmpName(empNo, newName);
		Employee emp = service.getEmpOnId(empNo);
		mAndV.addAttribute("emp", emp);
		mAndV.addAttribute("pageHead", "Successful Updation of Employee name");
		
		return "SuccEmpUpdate";

	}
	
	@RequestMapping("/getEntryPage.do")
	public ModelAndView getEntryPage(){
		
		ModelAndView mAndV = new ModelAndView("EntryPage");
		Employee emp = new Employee();//command object
		mAndV.addObject("employee", emp);
		return mAndV;
	}
	
	@RequestMapping("/getHomePage.do")
	public ModelAndView getHomePage(){
		
		ModelAndView mAndV = new ModelAndView("HomePage");
		return mAndV;
	}
	
	@RequestMapping("/getUpdateNamePage.do")
	public ModelAndView getUpdateNamePage() throws EmpException{
		
		ModelAndView mAndV = new ModelAndView("UpdateNamePage");
		List<Integer> idList = service.getEmpNoList();
		mAndV.addObject("idList", idList);
		mAndV.addObject("pageHead", "Update name of an employee.");

		return mAndV;
	}
}
