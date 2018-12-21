<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>

<body bgcolor="#ec407a">
  <h2 style="color:#069">List of hotels</h2>
<form action="goback" method="post">
<table>
<ul>
<c:forEach var="entry" items="${listofHotels}">
 <li>
 <a href="${entry.value}"><c:out value="${entry.key}"></c:out> </a>
</li> 
</c:forEach>
</ul>
</table>
</form>
</body>
<input type="button" value="back">


</html>