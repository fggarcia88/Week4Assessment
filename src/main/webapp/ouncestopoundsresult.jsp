<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Convert Ounces to Pounds</title>
</head>
<body>
<p>
	${userOuncesPounds.getTotalOunces()} total ounces are equal to: <br>
	${userOuncesPounds.getPounds()} pounds <br>
	${userOuncesPounds.getOunces()} ounces <br>
</p>
<a href="ouncestopounds.jsp">Calculate another number</a>
<br>
<a href="index.jsp">Return to Home Page</a>
</body>
</html>