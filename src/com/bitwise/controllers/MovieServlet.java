package com.bitwise.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bitwise.models.Movie;
import com.bitwise.models.Movies;

@WebServlet("/MovieServlet")
public class MovieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public MovieServlet() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		if (session.getAttribute("movies") != null) {
			System.out.println("im old user");
			Movies movies = (Movies)session.getAttribute("movies");
			session.setAttribute("movies", movies);
		} else {
			System.out.println("im new user");
			Movies movies = new Movies();
			session.setAttribute("movies", movies);

		}

		request.getRequestDispatcher("movieShows.jsp").include(request, response);
	}

}
