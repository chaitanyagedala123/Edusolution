<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>title</title>
</head>
<br>
<br>

<body>
<br>
<h1>Login Page</h1>
<br>
<br>
<p style="color: red;">${errormsg}</p>
	<form action="${contextRoot}/login" method="post">
		<table>
			<tr>
				<td><input type="text" name="mobile" id="mobile"
					placeholder="MobileNo" required></td>
			</tr>
			<tr>

				<td><input type="text" name="password" id="password"
					placeholder="Password" required></td>
			</tr>
			<tr>
				<td><button type="submit">login</button></td>
			</tr>

		</table>



	</form>
</body>
</html>