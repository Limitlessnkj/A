<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN</title>
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
<h1>Sorry Invalid Credentials</h1>
<h2>Please Login Again OR Register Using the Signup Option</h2>
<a href="displaySignup.obj">SignUp</a>
<form:form action="userHome.obj" modelAttribute="loginDetails">
<table align="center">
<tr>
<td>Enter UserId:</td>
<td><form:input type="text" path="userId"/>
<form:errors path="userId"/>
</td>
</tr>

<tr>
<td>Enter Password:</td>
<td><form:input type="password" path="userPassword"/>
<form:errors path="userPassword"/>
</td>
</tr>
<tr>
<td><input class="inputBtn" type="button" value="Submit"></td>
<td><input class="inputBtn" type="reset" value="Clear"></td>

</table>
</form:form>

</body>
</html>