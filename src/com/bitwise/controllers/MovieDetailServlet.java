package com.bitwise.controllers;

import java.io.IOException;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.bitwise.models.Movie;
import com.bitwise.models.Movies;

@WebServlet("/MovieDetailServlet")
public class MovieDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public MovieDetailServlet() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int movieId = Integer.parseInt(request.getParameter("movieId"));
		System.out.println(getMovieDetailById(movieId));
		request.getRequestDispatcher("movieDetails.jsp").forward(request, response);
	}
	
	public Movie getMovieDetailById(int movieId){
		Movies movies = new Movies();
		for(Movie movie:movies.getMovies()){
			if(movie.getMovieId()==movieId){
				return movie;
			}
		}
		return null;
	}
	
	
}
