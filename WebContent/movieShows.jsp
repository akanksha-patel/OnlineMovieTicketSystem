<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.bitwise.models.Movies"%>
<%@page import="com.bitwise.models.Users"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<jsp:useBean class="com.bitwise.models.Movies" scope="session"
	id="movies"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/movie.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/home.css">
<title>Insert title here</title>
</head>
<body>
	<form id="form" action="">
		<div id="title">WELCOME TO THE MOVIE TICKET BOOKING SYSTEM</div>


		<c:if test="${ not empty movies.getMovies() }">


			<table>

				<tr id="heading">
					<td></td>
					<td>MOVIE NO</td>
					<td>MOVIES NAME</td>
				</tr>
				<c:forEach items="${ movies.getMovies() }" var="movie">
					<tr>
						<td></td>
						<td>Movie <c:out value="${movie.getMovieId()}" /></td>
						<td><c:out value="${movie.getMovieName()}" /></td>
						<td>&nbsp;&nbsp;&nbsp;&nbsp;</td>
						<td><a href="MovieServlet?movieId=${movie.getMovieId()}">MOVIE DETAIL</a></td>
					</tr>
				</c:forEach>
			</table>


		</c:if>


		<br><br>
		<input type="submit" name="submit"
			value="DISPLAY BOOKED MOVIES" class="btn" />

	</form>
</body>
</html>