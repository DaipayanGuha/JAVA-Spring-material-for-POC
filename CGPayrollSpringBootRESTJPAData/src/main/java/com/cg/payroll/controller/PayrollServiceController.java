package com.cg.payroll.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.payroll.beans.Associate;
import com.cg.payroll.exceptions.AssociateDetailsNotFoundException;
import com.cg.payroll.services.PayrollServices;

@Controller
public class PayrollServiceController {

	@Autowired
	PayrollServices payrollServices;
	
	@RequestMapping(value= {"/sayHello"},method=RequestMethod.GET)
	public ResponseEntity<String> sayHello(){
		return new ResponseEntity<String>("Hello World To All From RESTImpl",HttpStatus.OK);
	}
	
	
	  @RequestMapping(value={"/getAssociateDetails"},method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json") 
	  public ResponseEntity<Associate> getAssociateDetailsRequestParam(@RequestParam int associateId)throws AssociateDetailsNotFoundException{ Associate associate =
	  payrollServices.getAssociateDetails(associateId);
	  return new ResponseEntity<Associate>(associate,HttpStatus.OK); }
	 	
	
	@RequestMapping(value= {"/getAssociateDetails/{associateId}"},method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json")
	public ResponseEntity<Associate> getAssociateDetailsPathParam(@PathVariable(value="associateId")int associateId)throws AssociateDetailsNotFoundException{
		Associate associate = payrollServices.getAssociateDetails(associateId);
		return new ResponseEntity<Associate>(associate,HttpStatus.OK);
	}
	
	@RequestMapping(value= {"/getAllAssociateDetails"},method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json")
	public ResponseEntity<List<Associate>>getAssociateDetailsPathParam(){
		return new ResponseEntity<List<Associate>>(payrollServices.getAllAssociateDetails(),HttpStatus.OK);
	}
	
	@RequestMapping(value= {"/acceptProductDetails"},method=RequestMethod.POST,produces=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ResponseEntity<String>acceptAssociateDetails(@ModelAttribute Associate associate){
		associate = payrollServices.acceptAssociateDetails(associate);
		return new ResponseEntity<>("Associate Details successfully added with Associate ID.: " + associate.getAssociateId(),HttpStatus.OK);
	}
	
	@RequestMapping(value= {"/removeAssociateDetails"},method=RequestMethod.DELETE,produces=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ResponseEntity<String>removeAssociateDetails(@RequestParam int associateId)throws AssociateDetailsNotFoundException{
		payrollServices.removeAssociateDetails(associateId);
		return new ResponseEntity<>("Associate Details successfully removed",HttpStatus.OK);
	}
	
}







