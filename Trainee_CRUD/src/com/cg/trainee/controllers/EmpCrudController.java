package com.cg.trainee.controllers;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.trainee.dtos.Trainee;
import com.cg.trainee.exceptions.EmpException;
import com.cg.trainee.services.EmpService;


@Controller
public class EmpCrudController {

	@Resource
	private EmpService service;
	
	@RequestMapping("/getEntryPage.do")
	public ModelAndView getEntryPage(){
		
		ModelAndView mAndV = new ModelAndView("EntryPage");
		Trainee emp = new Trainee();//command object
		mAndV.addObject("employee", emp);
		return mAndV;
	}
	
	
	@RequestMapping("/getTraineeList.do")
	public ModelAndView getEmpList() throws EmpException{
		
		List<Trainee> traineeList = service.getTraineeList();
		ModelAndView mAndV = new ModelAndView();
		mAndV.addObject("traineeList", traineeList);
		mAndV.addObject("pageHead", "Trainee List");
		
		//controller returns alias name of jsp
		//view resolver will fabricate the complete name
		mAndV.setViewName("EmpList");
		return mAndV;
	}
	
	@RequestMapping("/getTraineeDetails.do")//requestparam acts as request .getparameter
	public ModelAndView getTraineeDetails(@RequestParam("tId") int tId) throws EmpException{
		
		Trainee trainee = service.getTraineeOnId(tId);
		
		ModelAndView mAndV = new ModelAndView();
		mAndV.addObject("trainee", trainee);
		mAndV.addObject("pageHead", "Trainee Details");
		
		mAndV.setViewName("EmpDetails");
		return mAndV;

	}
	

	
	@RequestMapping("/getHomePage.do")
	public ModelAndView getHomePage(){
		
		ModelAndView mAndV = new ModelAndView("HomePage");
		return mAndV;
	}
	
	
	
	@RequestMapping("/getIDPage.do")
	public ModelAndView getIDPage(){
		
		ModelAndView mAndV = new ModelAndView("IDPage");
		return mAndV;
	}
	
	@RequestMapping(value="/submitTraineeDetails.do", method=RequestMethod.POST)//requestparam acts as request .getparameter
	public String submitEmpDetails(@ModelAttribute("trainee") Trainee trainee, Model mAndV) throws EmpException{
		
		System.out.println(trainee);
		service.insertNewTrainee(trainee);
		
		mAndV.addAttribute("trainee", trainee);
		mAndV.addAttribute("pageHead", "Successful Joining of Trainee");
		
		return "SuccEmpJoining";

	}
	
	@RequestMapping("/getaddPage.do")
	public ModelAndView getaddPage(){
		
		ModelAndView mAndV = new ModelAndView("addPage");
		Trainee trainee = new Trainee();//command object
		mAndV.addObject("trainee", trainee);
		return mAndV;
	}
	
	@RequestMapping("/deleteTrainee.do")
	public ModelAndView deleteTrainee(){
		
		ModelAndView mAndV = new ModelAndView("DeletePage");
		return mAndV;
	}
	
	@RequestMapping("/delete.do")
	public ModelAndView delete(@RequestParam("tId") int tId) throws EmpException{
		
		//Trainee trainee = service.getTraineeOnId(tId);
		service.delete(tId);
		ModelAndView mAndV = new ModelAndView();
		
		mAndV.addObject("pageHead", "Trainee Deleted");
		
		mAndV.setViewName("DeleteSucc");
		return mAndV;
	}
	
	@RequestMapping("/modify.do")
	public ModelAndView modify(){
		
		ModelAndView mAndV = new ModelAndView("Modify");
		return mAndV;
	}
	
	@RequestMapping("/modifyTrainee.do")
	public ModelAndView modifyTrainee(@RequestParam("tId") int tId) throws EmpException{
		
		Trainee trainee = service.getTraineeOnId(tId);
		
		ModelAndView mAndV = new ModelAndView();
		mAndV.addObject("trainee", trainee);
		mAndV.addObject("pageHead", "Trainee Details");
		
		mAndV.setViewName("ModifyTrainee");
		return mAndV;
		
	}
	
	@RequestMapping("/updateTrainee.do")
	public ModelAndView updateTrainee(@RequestParam("tId") int tId,
			@RequestParam("tName") String tName, @RequestParam("tLocation") String tLocation, @RequestParam("tDomain") String tDomain) throws EmpException{
		
		boolean flag = service.update(tId, tName, tLocation, tDomain);
		
		
		
		
		ModelAndView mAndV = new ModelAndView();
		
		mAndV.addObject("pageHead", "Trainee Updated");
		
		mAndV.setViewName("SuccessUpdate");
		return mAndV;
		
	}
	
	
	
}
