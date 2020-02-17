package com.cg.movie.beans;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Movie {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int movieId;
	
	private String movieName;
	private int movieTime;
	private String movieDirector;
	
	@Embedded
	private Song song;

	public Movie() {}

	public Movie(int movieId, String movieName, int movieTime, String movieDirector, Song song) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieTime = movieTime;
		this.movieDirector = movieDirector;
		this.song = song;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public int getMovieTime() {
		return movieTime;
	}

	public void setMovieTime(int movieTime) {
		this.movieTime = movieTime;
	}

	public String getMovieDirector() {
		return movieDirector;
	}

	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}

	public Song getSong() {
		return song;
	}

	public void setSong(Song song) {
		this.song = song;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((movieDirector == null) ? 0 : movieDirector.hashCode());
		result = prime * result + movieId;
		result = prime * result + ((movieName == null) ? 0 : movieName.hashCode());
		result = prime * result + movieTime;
		result = prime * result + ((song == null) ? 0 : song.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		if (movieDirector == null) {
			if (other.movieDirector != null)
				return false;
		} else if (!movieDirector.equals(other.movieDirector))
			return false;
		if (movieId != other.movieId)
			return false;
		if (movieName == null) {
			if (other.movieName != null)
				return false;
		} else if (!movieName.equals(other.movieName))
			return false;
		if (movieTime != other.movieTime)
			return false;
		if (song == null) {
			if (other.song != null)
				return false;
		} else if (!song.equals(other.song))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", movieTime=" + movieTime
				+ ", movieDirector=" + movieDirector + ", song=" + song + "]";
	}
	
}
