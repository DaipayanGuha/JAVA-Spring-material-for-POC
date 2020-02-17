package com.cg.movie.controller;

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

import com.cg.movie.beans.Movie;
import com.cg.movie.exceptions.MovieNotFoundException;
import com.cg.movie.services.MovieServices;

@Controller
public class MovieServicesController {
	
	@Autowired
	MovieServices movieServices;
	
	 @RequestMapping(value={"/getMovieDetails"},method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json") 
	  public ResponseEntity<Movie> getMovieDetailsRequestParam(@RequestParam int movieId)throws MovieNotFoundException{ 
		 Movie movie = movieServices.getMovieDetails(movieId);
	  return new ResponseEntity<Movie>(movie,HttpStatus.OK); }
	 	
	@RequestMapping(value= {"/getAllMovieDetails"},method=RequestMethod.GET,produces=MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json")
	public ResponseEntity<List<Movie>>getMovieDetailsPathParam(){
		return new ResponseEntity<List<Movie>>(movieServices.getAllMovieDetails(),HttpStatus.OK);
	}
	
	@RequestMapping(value= {"/acceptMovieDetails"},method=RequestMethod.POST,produces=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ResponseEntity<String>acceptMovieDetails(@ModelAttribute Movie movie){
		movie = movieServices.acceptMovieDetails(movie);
		return new ResponseEntity<>("Associate Details successfully added with Associate ID.: " + movie.getMovieId(),HttpStatus.OK);
	}
	
	@RequestMapping(value= {"/removeMovieDetails"},method=RequestMethod.DELETE,produces=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
	public ResponseEntity<String>removeMovieDetails(@RequestParam int movieId)throws MovieNotFoundException{
		movieServices.removeMovieDetails(movieId);
		return new ResponseEntity<>("Associate Details successfully removed",HttpStatus.OK);
	}
	
}
