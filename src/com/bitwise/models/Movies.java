package com.bitwise.models;

import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Movies {
	private List<Movie> movies = new ArrayList<Movie>();
	Movie movie = new Movie();
	
	public List<Movie> getMovies() {
		return movies;
	}


	@Override
	public String toString() {
		return  movies+" " ;
	}
	

	public Movies() {
		movies.add(new Movie(1,"dhoom", "pvr", 10,"12 p.m","3 p.m"));
		movies.add(new Movie(2,"luv story 2015", "cinemax", 40, "3 p.m","6 p.m"));
		movies.add(new Movie(3,"titanic", "imax", 30, "3 p.m","6 p.m"));
		movies.add(new Movie(4,"chak de india", "cinemax", 10, "6 p.m","9 p.m"));
		movies.add(new Movie(5,"sanam re", "pvr", 30, "6 p.m","9 p.m"));
		movies.add(new Movie(6,"luv aaj kal", "pvr", 20, "12 p.m","3 p.m"));
		movies.add(new Movie(7,"pyar ke side effects", "inox", 10, "3 p.m","6 p.m"));
		movies.add(new Movie(8,"pink", "inox", 10, "9 a.m","12 a.m"));
		movies.add(new Movie(9,"baar baar dekho", "imax", 10, "6 p.m","12 a.m"));
		movies.add(new Movie(10,"black", "cinemax", 10, "9 a.m","12 p.m"));
		movies.add(new Movie(11,"blue", "pvr", 10, "9 p.m","12 a.m"));
	}
	

	}


