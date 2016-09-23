<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <jsp:useBean class="com.bitwise.models.BookShow" scope="session"
	id="shows"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/movie.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/home.css">
<title>Booking Page</title>
</head>
<body>


<form id="form" action="MovieServlet">
	<div id="title">YOUR BOOKING</div>

	<c:if test="${ not empty shows.getList() }" var="movie" >
		<table>

			<tr id="heading">

				<td>MOVIE NO</td>
				<td>MOVIES NAME</td>
				<td>THEATER NAME</td>
				<td>SEATS BOOKED</td>
				<td>START TIME</td>
				<td>END TIME</td>
			</tr>
			
			
		<c:forEach items="${ shows.getList() }" var="movie">
			<tr>

				<td>Movie <c:out value="${movie.getMovieId()}" /></td>
				<td><c:out value="${movie.getMovieName()}" /></td>
				<td><c:out value="${movie.getTheaterName()}" /></td>
				<td><c:out value="${requestScope.seats}" /></td>
				<td><c:out value="${movie.getStartTime()}" /></td>
				<td><c:out value="${movie.getEndTime()}" /></td>
			</tr>
			</c:forEach>
			
			<tr></tr>

		</table>
	</c:if>
					
		<br> <br> <input type="submit" name="submit" value="BOOK MORE SHOW"
			class="btn">
		<input type="submit" name="submit" value="REMOVE SHOW"
			class="btn">
	</form>
</body>
</html>