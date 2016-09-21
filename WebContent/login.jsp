<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/css/login.css">
<title>Login Page</title>
</head>
<body>
<div >
	<% String msg =(String)request.getAttribute("msg"); %>
	<%if(msg!=null){%>
	<div id="error">
		<%=" *"+msg %>
	</div>
	
	<%} %>
</div>
	<form action="LoginServlet" method="post">
		<table>
			<tr>
				<th colspan="3" id="title">LOGIN FORM</th>
			</tr>
			<tr>
				<td class="lbl">Email</td>
				<td class="cln">:</td>
				<td class="txtfldtd"><input type="email" name="email"
					class="txtfld" required></td>
			</tr>

			<tr>
				<td class="lbl">Password</td>
				<td class="cln">:</td>
				<td class="txtfldtd"><input type="password" name="password"
					class="txtfld" required></td>
			</tr>

			<tr>
				<td id="btn"><input type="submit" value="LOGIN" class="txtfld">
				</td>
			</tr>

			<tr>
				<td id="warn">*All Fields Are Mandatory</td>
			</tr>

		</table>
	</form>

</body>
</html>