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
		HttpSession session = request.getSession();
		int movieId = Integer.parseInt(request.getParameter("movieId"));
		
		if(session.getAttribute("movies")!=null){
			Movies movies = (Movies) session.getAttribute("movies");
			Movie movieDetail = movies.getMovieDetailById(movieId,movies);
			session.setAttribute("movieDetail", movieDetail);
		}
		request.getRequestDispatcher("movieDetails.jsp").forward(request, response);
	}

	
}
