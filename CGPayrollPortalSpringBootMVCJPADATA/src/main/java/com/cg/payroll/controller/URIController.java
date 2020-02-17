package com.cg.payroll.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.payroll.beans.Associate;

@Controller
public class URIController {

	private Associate associate;

	@RequestMapping( value= {  "/","index"})
	public String getIndexPage() {
		return "index";
	}
	@RequestMapping("/registration")
	public  String getRegistrationPage() {

		return "registrationPage";
	}
	@RequestMapping("/findAssociateDetails")
	public  String getAssociatePage() {

		return "findAssociateDetails";
	}
	@RequestMapping("/calculateSalary")
	public  String getNetSalaryPage() {

		return "NetSalary";
	}
	
	@ModelAttribute
	public Associate getAssociate() {

		associate=new Associate();
		return associate;


	}
}