package com.bitwise.controllers;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.bitwise.models.*;

@WebServlet("/MovieBookServlet")
public class MovieBookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		String seats = request.getParameter("seats");
		String submit = request.getParameter("submit");
		System.out.println(submit);
		request.setAttribute("seats", seats);
		Movie movie = (Movie) session.getAttribute("movieDetail");
		int movieId = movie.getMovieId();
		String movieName = movie.getMovieName();
		String theaterName = movie.getTheaterName();
		int seatsAvailable = movie.getSeatAvailable();
		String startTime = movie.getStartTime();
		String endTime = movie.getEndTime();
		
		if (submit == null) {
			return;
		}

		if (submit.equals("BOOK MORE SHOW")||submit.equals("BOOK")) {
			if (isCartNull(session)) {
				System.out.println("new");
				initializeCart(movieId, movieName, theaterName, seatsAvailable, startTime, endTime, session);
				System.out.println("initialized");
				request.getRequestDispatcher("movieBooking.jsp").forward(request, response);
				
			} else {
				System.out.println("old");
				addItemToCart(movieId, movieName, theaterName, seatsAvailable, startTime, endTime, session);
				response.sendRedirect("movieBooking.jsp");
			}
		}

		if (submit.equals("REMOVE SHOW")) {
			if (isCartNotEmpty(session)) {
				removeItemFromCart(movieId, movieName, theaterName, seatsAvailable, startTime, endTime, session);
				response.sendRedirect("movieBooking.jsp");
			}
		}

		if (submit.equals("DISPLAY CART")) {
			if (isCartNotEmpty(session)) {
				response.sendRedirect("movieBooking.jsp");
			}
		}

	}

	private boolean isCartNotEmpty(HttpSession session) {
		return session.getAttribute("shows") != null;
	}

	private boolean isCartNull(HttpSession session) {
		return session.getAttribute("shows") == null;
	}

	private void addItemToCart(int movieId, String movieName, String theaterName, int seatAvailable, String startTime,
			String endTime, HttpSession session) {
		BookShow shows = (BookShow) session.getAttribute("shows");
		System.out.println(shows.bookMovieShow(new Movie(movieId, movieName, theaterName, seatAvailable, startTime, endTime)));

	}

	private void removeItemFromCart(int movieId, String movieName, String theaterName, int seatAvailable, String startTime,
			String endTime, HttpSession session){
		Movie movie = new Movie(movieId, movieName, theaterName, seatAvailable, startTime, endTime);
				BookShow shows = (BookShow) session.getAttribute("shows");
		shows.removeMovieShow(movie);
	}

	private void initializeCart(int movieId, String movieName, String theaterName, int seatAvailable, String startTime,
		String endTime, HttpSession session) {
		BookShow shows = new BookShow();
		session.setAttribute("shows", shows);
		System.out.println(shows.bookMovieShow(new Movie(movieId, movieName, theaterName, seatAvailable, startTime, endTime)));

	}

}


