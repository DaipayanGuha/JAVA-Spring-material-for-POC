package com.cg.payroll.aspect;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cg.payroll.beans.CustomResponse;
import com.cg.payroll.exceptions.AssociateDetailsNotFoundException;

@ControllerAdvice
public class PayrollExceptionAspect {
	/*
	 * @ExceptionHandler(AssociateDetailsNotFoundException.class) public
	 * ModelAndView handelAssociateDetailsNotFoundException(Exception e) { return
	 * new ModelAndView("findAssociateDetails", "errorMessage",e.getMessage()); }
	 */
	
	@ExceptionHandler(AssociateDetailsNotFoundException.class)
	public ResponseEntity<CustomResponse> handelAssociateDetailsNotFoundException(Exception e){
		CustomResponse response = new CustomResponse(e.getMessage(),HttpStatus.EXPECTATION_FAILED.value());
		return new ResponseEntity<>(response,HttpStatus.EXPECTATION_FAILED);
	}

}
