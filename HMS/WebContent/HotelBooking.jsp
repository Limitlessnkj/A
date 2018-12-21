<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>WELCOME TO HOTEL BOOKING PAGE OF "${bookingDetails.name}"</h3>

	<form:form action="BookingSuccess.jsp">
		<table border=2 bgcolor="#EFC8C8">
			<tr>
				<td>Enter From Date:</td>
				<td><input type="date" value="From Date" /></td>
			</tr>
			<tr>
				<td>Enter To Date:</td>
				<td><input type="date" value="To Date" /></td>
			</tr>
		</table>
		<br>
		<p>
			Select Number Of Rooms <select name="rooms" value="Select">
				<option value="" selected disabled hidden>Choose here</option>
				<option value="1">1</option>
				<option value="2">2</option>
				<option value="3">3</option>
				<option value="4">4</option>
				<option value="5">5</option>
			</select>
		</p>

		<p>
			Enter Contact Details:<input type="tel"/>
		</p>

		<input type="submit" value="Book" />
		<input type="reset" value="Clear" />

	</form:form>
</body>
</html>