package com.cg.onlinebookstore.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.onlinebookstore.beans.Books;
import com.cg.onlinebookstore.exceptions.BookDetailsNotFoundException;
import com.cg.onlinebookstore.services.OnlineBookStoreServices;

@Controller
public class BookServiceController {

	@Autowired
	OnlineBookStoreServices onlineBookStoreServices;
	
	@RequestMapping(value="/saveBook",method=RequestMethod.POST,
			consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ResponseEntity<String> saveBookParam(@ModelAttribute Books book){
		book=onlineBookStoreServices.insertBookDetails(book);
		return new ResponseEntity<String>("Book details successfully added . book ISBN: "+book.getIsbnNumber(),HttpStatus.OK);
	}
	
	@RequestMapping(value="/getBookDetails", method = RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE,
			headers="Accept=application/json"
			)
	public ResponseEntity<Books> getBookDetails(@RequestParam String bookTitle) throws BookDetailsNotFoundException {
		return new ResponseEntity<Books>(onlineBookStoreServices.getBookDetails(bookTitle),HttpStatus.OK);
	}
	
	//Getting book details by7 isbn number//
	@RequestMapping(value="/getBookDetailsByIsbn", method = RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE,
			headers="Accept=application/json"
			)
	public ResponseEntity<Books> getBookDetailsByIsbn(@RequestParam long isbnNumber) throws BookDetailsNotFoundException {
		return new ResponseEntity<Books>(onlineBookStoreServices.getBookDetailsByIsbn(isbnNumber),HttpStatus.OK);
	}
	//...../Getting book details by7 isbn number//
	
	
	@RequestMapping(value= {"/getAllBookDetails"},method=RequestMethod.GET,
			produces=MediaType.APPLICATION_JSON_VALUE,
			headers="Accept=application/json")
	public ResponseEntity<List<Books>> getAllBookDetailspathParam(){
		return new ResponseEntity<List<Books>>(onlineBookStoreServices.getAllBookDetails(),HttpStatus.OK);
	}
	
	@RequestMapping(value="/removeBookDetails",method=RequestMethod.DELETE,
			consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ResponseEntity<String> removeBookDetails(@RequestParam long isbnNumber) throws BookDetailsNotFoundException{
		onlineBookStoreServices.removeBookDetails(isbnNumber);
		return new ResponseEntity<>("Book Details with ISBN Number "+isbnNumber+" successfully removed",HttpStatus.OK);
	}
	
}
