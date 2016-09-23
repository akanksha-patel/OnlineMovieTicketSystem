package com.bitwise.models;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class Movie {
	private int movieId;
	private String movieName;
	private String theaterName;
	private int seatAvailable;
	private String startTime;
	private String endTime;

	@Override
	public String toString() {
		return movieId + " " + movieName + " " + theaterName + " " + seatAvailable + " " + seatAvailable + " "
				+ startTime + " " + endTime;
	}

	public Movie(int movieId, String movieName, String theaterName, int seatAvailable, String startTime,
			String endTime) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.theaterName = theaterName;
		this.seatAvailable = seatAvailable;
		this.setStartTime(startTime);
		this.setEndTime(endTime);
	}

	public Movie() {

	}

	

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	public int getSeatAvailable() {
		return seatAvailable;
	}

	public void setSeatAvailable(int seatAvailable) {
		this.seatAvailable = seatAvailable;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

}
