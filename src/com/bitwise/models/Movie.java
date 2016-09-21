package com.bitwise.models;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class Movie {
	private String movieName;
	private String theaterName;
	private int seatAvailable;
	private Time startTime;
	private Time endTime;

	@Override
	public String toString() {
		return movieName + " " + theaterName + " " + seatAvailable + " " + seatAvailable + " " + startTime + " "
				+ endTime;
	}

	public Movie() {

	}

	public Movie(String movieName, String theaterName, int seatAvailable, Time startTime, Time endTime) {
		super();
		this.movieName = movieName;
		this.theaterName = theaterName;
		this.seatAvailable = seatAvailable;
		this.setStartTime(startTime);
		this.setEndTime(endTime);
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

	public Time getStartTime() {
		return startTime;
	}

	public void setStartTime(Time startTime) {
		this.startTime = startTime;
	}

	public Time getEndTime() {
		return endTime;
	}

	public void setEndTime(Time endTime) {
		this.endTime = endTime;
	}

}
