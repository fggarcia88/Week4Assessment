<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Number Guesser</title>
</head>
<body>
	<h1>Number Guessing Game</h1>
	<p>
		Guess a number between 1-6!
	</p>
	<form action = "getNumberServlet" method = "post">
		<input type="text" name="userGuess" size="10">
		<input type="submit" value="Guess!" />
	</form>
</body>
</html>