package com.cg.onlinebookstore.aspect;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cg.onlinebookstore.beans.CustomResponse;
import com.cg.onlinebookstore.exceptions.BookDetailsNotFoundException;

@ControllerAdvice
public class BookDetailsNotFoundExceptionAspect {

	@ExceptionHandler(BookDetailsNotFoundException.class)
	public ResponseEntity<CustomResponse>  handelBookDetailsNotFoundException(Exception e){
		CustomResponse response = new CustomResponse(e.getMessage(),HttpStatus.EXPECTATION_FAILED.value());
		return new ResponseEntity<>(response,HttpStatus.EXPECTATION_FAILED);
	}
	
}
