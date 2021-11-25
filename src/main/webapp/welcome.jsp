<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Welcome</title>
</head>
<body>
<% String userName = (String) session.getAttribute("userName"); %>
	<h1>Bienvenido, <%= userName %> </h1>
	<br>
	<a href="logout">Logout </a> 
</body>
</html>