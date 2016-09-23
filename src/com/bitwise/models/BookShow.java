package com.bitwise.models;

import java.util.ArrayList;
import java.util.List;

public class BookShow {
	
	private List<Movie> list = new ArrayList<Movie>();

	public List<Movie> getList() {
		return list;
	}
	
	public List<Movie> bookMovieShow(Movie movie){
		list.add(movie);
		return list;
	}
	
public void removeMovieShow(Movie movie){
		if(list.contains(movie)){
			list.remove(movie);
		}
	}

public void displayBookMovieShow(){
	for(Movie movie : list){
		System.out.println(movie);
	}
}
	
	

}
