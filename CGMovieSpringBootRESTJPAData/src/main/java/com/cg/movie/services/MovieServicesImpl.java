package com.cg.movie.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.movie.beans.Movie;
import com.cg.movie.daoservices.MovieDAO;
import com.cg.movie.exceptions.MovieNotFoundException;

@Component("movieServices")
public class MovieServicesImpl implements MovieServices{
	
	@Autowired
	private MovieDAO movieDAO;

	@Override
	public Movie acceptMovieDetails(Movie movie) {
		movie=movieDAO.save(movie);
		return movie;
	}

	@Override
	public Movie getMovieDetails(int movieId) throws MovieNotFoundException {
		return movieDAO.findById(movieId).orElseThrow(()->  new MovieNotFoundException("Movie Details Not found for ID. : "+movieId));
	}

	@Override
	public List<Movie> getAllMovieDetails() {
		return movieDAO.findAll();
	}

	@Override
	public boolean removeMovieDetails(int movieId) throws MovieNotFoundException {
		movieDAO.delete(getMovieDetails(movieId));
		return true;
	}
	
	
}
