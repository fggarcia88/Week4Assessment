<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Convert Ounces to Pounds</title>
</head>
<body>
	<h1>Ounces to Pounds Converter</h1>
	<p>
		Enter ounces to convert to pounds.
	</p>
	
	<form action="getOuncesServlet" method = "post">
		<input type="text" name="userOunces" size="10">
		<input type="submit" value="Calculate Ounces to Pounds" />
	</form>

</body>
</html>