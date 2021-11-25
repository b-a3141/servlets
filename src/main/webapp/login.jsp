<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login</title>
</head>
<body>

<% String flash = (String) request.getAttribute("flash"); %>
<% if (flash != null) { %>
<%= flash %>
<% } %>

<br>
<div style="padding: 10px;">
<!-- la accion dirige a un servlet -->
	<form action="login" method="post">
		<div style="padding: 10px;">
		User: <input name="userName">
		<br>
		</div>
		<div style="padding: 10px;">
		Password: <input type="password" name="password">
		<br>
		</div>
		<button type="submit">Ingresar</button>
	</form>
</div>
</body>
</html>