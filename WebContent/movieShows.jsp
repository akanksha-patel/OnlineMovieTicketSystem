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
<title>Insert title here</title>
</head>
<body>
	<h3>WELCOME TO THE WORLD OF GLAMOUR</h3>
	<br />
	<form action="CartController" method="post">

		<c:if test="${ not empty movies.getList() }">
			<select name="movie">
				<c:forEach items="${ movies.getList() }" var="item">
					<option value="${ item }">
						<c:out value="${ item. }, ${ item.getProductPrice() }"></c:out>
					</option>
				</c:forEach>
			</select>

		</c:if>

		<input type="submit" name="submit" value="ADD TO CART" /> <input
			type="submit" name="submit" value="REMOVE FROM CART" /> <input
			type="submit" name="submit" value="DISPLAY CART" />

	</form>
</body>
</html>