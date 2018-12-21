<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Search Results:</h1>
	<c:choose>
		<c:when test="${hotelList.size()>0}">

			<table border="2" align="center" bgcolor="#EFC8C8">
				<tr>
					<th>Name of Hotel</th>
					<th>Member Name</th>
					<th>Price</th>
					<th>Rooms Available</th>
					<th>Rating</th>
					<th>Transport Available</th>
					<th>Book Hotel</th>
				</tr>
				<c:when test="${hotelList.name=='Vivanta By Taj'}">
					<c:forEach items="${hotelList}" var="list">
						<tr>
							<td>${list.name}</td>
							<td><a
								href="https://vivanta.tajhotels.com/en-in/ambassador-new-delhi/">Click
									for Membership Details: ${list.member}</a></td>
							<td>${list.price}</td>
							<td>${list.rooms}</td>
							<td>${list.rating}</td>
							<td><a
								href="https://vivanta.tajhotels.com/en-in/dwarka-new-delhi/">${list.transport}</a></td>

							<td><a href="bookHotel.obj?name=${list.name}">Click to
									book hotel</a></td>
						</tr>
					</c:forEach>
				</c:when>
				<c:when test="${hotelList.name=='Marriott'}">
					<c:forEach items="${hotelList}" var="list">
						<tr>
							<td>${list.name}</td>
							<td><a
								href="https://www.marriott.com/loyalty/member-benefits.mi">Click
									for Membership Details:${list.member}</a></td>
							<td>${list.price}</td>
							<td>${list.rooms}</td>
							<td>${list.rating}</td>
							<td><a href="https://www.zoomcar.com/delhi/">${list.transport}</a></td>
							<td><a href="bookHotel.obj?name=${list.name}">Click to
									book hotel</a></td>
						</tr>
					</c:forEach>
				</c:when>
				<c:otherwise>
					<c:forEach items="${hotelList}" var="list">
						<tr>
							<td>${list.name}</td>
							<td><a
								href="https://www.fabhotels.com/hotels-in-bangalore/?gclid=EAIaIQobChMI0b292s6r3wIV0DUrCh3y_QPFEAAYASAAEgIdyvD_BwE">Click
									for Membership Details:${list.member}</a></td>
							<td>${list.price}</td>
							<td>${list.rooms}</td>
							<td>${list.rating}</td>
							<td><a href="https://www.olacabs.com/">${list.transport}</a></td>
							<td><a href="bookHotel.obj?name=${list.name}">Click to
									book hotel</a></td>
						</tr>
					</c:forEach>
				</c:otherwise>

			</table>

		</c:when>
		<c:otherwise>
			<h3>
				<center>No Data Found</center>
			</h3>
		</c:otherwise>
	</c:choose>
</body>
</html>