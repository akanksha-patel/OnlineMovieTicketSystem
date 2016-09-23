<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:useBean class="com.bitwise.models.Movie" scope="session"
	id="movieDetail"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/movie.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/home.css">
<title>Detail Of Movie</title>
</head>
<body>

	<form id="form" action="MovieBookServlet">
	<div id="title"><c:out value="${fn:toUpperCase(movieDetail.getMovieName())}" /></div>
	
	
		<table>

			<tr id="heading">

				<td>MOVIE NO</td>
				<td>MOVIES NAME</td>
				<td>THEATER NAME</td>
				<td>AVAILABLE SEATS</td>
				<td>START TIME</td>
				<td>END TIME</td>
			</tr>

			<tr>

				<td>Movie <c:out value="${movieDetail.getMovieId()}" /></td>
				<td><c:out value="${movieDetail.getMovieName()}" /></td>
				<td><c:out value="${movieDetail.getTheaterName()}" /></td>
				<td><c:out value="${movieDetail.getSeatAvailable()}" /></td>
				<td><c:out value="${movieDetail.getStartTime()}" /></td>
				<td><c:out value="${movieDetail.getEndTime()}" /></td>
			</tr>
			<tr></tr>

		</table>
		Enter no of seats you want to book : <input type="text" name="seats"
					>
		<br> <br> <input type="submit" name="submit" value="BOOK"
			class="btn">
	</form>
</body>
</html>