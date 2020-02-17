package com.cg.payroll.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.exceptions.AssociateDetailsNotFoundException;
import com.cg.payroll.services.PayrollServices;

@Controller
public class PayrollServiceController {
	
@Autowired
	PayrollServices payrollServices;
@RequestMapping("/registerAssociate")
	public ModelAndView registerAssociate(@Valid@ModelAttribute Associate associate,BindingResult result ) {
	if(result.hasErrors()) return new ModelAndView("registrationPage");
		associate=payrollServices.acceptAssociateDetails(associate);
		return new ModelAndView("registrationSuccess", "associate", associate);
	
}

@RequestMapping("/associateDetails")
public ModelAndView showAssociate(@RequestParam   int associateId ) throws AssociateDetailsNotFoundException {
	Associate   associate=payrollServices.getAssociateDetails(associateId);
	return new ModelAndView("findAssociateDetails", "associate", associate);
}
@RequestMapping("/FindAllAssociate")
public ModelAndView getAllAssociateDetails( ) throws AssociateDetailsNotFoundException {
	List<Associate> associate=payrollServices.getAllAssociateDetails();
	
	return new ModelAndView("FindAllAssociate", "associate", associate);
}
   @RequestMapping("/calculate")
    public ModelAndView calculateNetSalary(@RequestParam  int associateId) throws AssociateDetailsNotFoundException {
	
	  Associate  associate=payrollServices.calculateNetSalary(  associateId);
	
	return new ModelAndView("NetSalary", "associate", associate);
   }
}







