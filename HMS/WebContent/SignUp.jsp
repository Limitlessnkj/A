<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp</title>
<style>
td {
	height: 30px;
}

.inputBtn {
	width: 90px;
	height: 25px;
	font-weight: bold;
	cursor: pointer;
	/* text-decoration: underline; */
	border: none;
}
</style>
</head>
<body align="center">
	<h1>Enter SignUp Details</h1>
	<form:form action="register.obj" modelAttribute="signUpDetails">
		<table align="center">
			<tr>
				<td>Enter First Name:</td>
				<td><input type="text" path="firstName">
				<form:errors path='firstName' /></td>
			</tr>
			<tr>
				<td>Enter Last Name:</td>
				<td><input type="text" path="lastName">
				<form:errors path='lastName' /></td>
			</tr>
			<tr>
				<td>Enter Date Of Birth:</td>
				<td><input type="date" path="dateOfBirth">
				<form:errors path='dateOfBirth' /></td>
			</tr>
			<tr>
				<td>Select Gender:</td>
				<td><input type="radio" path="gender" value="Male"></td>
				<td><input type="radio" path="gender" value="Female"></td>
			</tr>
			<tr>
				<td>Enter Contact Number:</td>
				<td><input type="tel" path="contactNumber">
				<form:errors path='contactNumber' /></td>
			</tr>
			<tr>
				<p id="one"></p>
				<button onclick="random()" path="userId">Click For User Id</button>

				<script>
					function random() {

						document.getElementById("one").innerHTML = Math
								.floor(Math.random() * 412354.115);
					}
				</script>
			</tr>
		</table>
	</form:form>
</body>
</html>