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
		movies.add(new Movie("priyansh part time", "pvr", 10, new Time(07, 07, 07),new Time(10, 07, 07)));
		movies.add(new Movie("lala ke daat", "pvr", 10, new Time(06, 07, 07),new Time(11, 07, 07)));
		movies.add(new Movie("pooja ka pagalpan", "pvr", 10, new Time(05, 07, 07),new Time(12, 07, 07)));
		movies.add(new Movie("harsimar ka keher", "pvr", 10, new Time(04, 07, 07),new Time(13, 07, 07)));
		movies.add(new Movie("pikachu ka current", "pvr", 10, new Time(03, 07, 07),new Time(14, 07, 07)));
		movies.add(new Movie("pikachu ki wapasi", "pvr", 10, new Time(02, 07, 07),new Time(15, 07, 07)));
		movies.add(new Movie("gaurav madhe charbi aahe", "pvr", 10, new Time(01, 07, 07),new Time(16, 07, 07)));
	}

}
