<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>
${userGameGuess.checkGuess()}
</p>
<a href="numberguess.jsp">Play again</a>
<br>
<a href="index.jsp">Return to Home Page</a>
</body>
</html>