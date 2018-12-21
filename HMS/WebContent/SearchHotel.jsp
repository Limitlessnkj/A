<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
#navlist {
  position: relative;
}

#navlist li {
  margin: 0;
  padding: 0;
  list-style: none;
  position: absolute;
  top: 0;
}

#navlist li, #navlist a {
  height: 44px;
  display: block;
}

#home {
  left: 0px;
  width: 46px;
  background: url('img_navsprites.gif') 0 0;
}

#prev {
  left: 63px;
  width: 43px;
  background: url('img_navsprites.gif') -47px 0;
}

#next {
  left: 129px;
  width: 43px;
  background: url('img_navsprites.gif') -91px 0;
}
#home a:hover {
  background: url('img_navsprites_hover.gif') 0 -45px;
}

#prev a:hover {
  background: url('img_navsprites_hover.gif') -47px -45px;
}

#next a:hover {
  background: url('img_navsprites_hover.gif') -91px -45px;
}
</head>
<body align="center">
	<h1>
		<strong>Search Hotel</strong>
	</h1>

	<form:form action="SearchHotel.obj">
		<table border=2 align="center">
			<tr>
				<td>Enter City to Search</td>
				<td><input type="text" name="city" /></td>
				<td><input type="submit" value="Search" /></td>
				<td><input type="reset" value="Clear" /></td>
			</tr>


		</table>
	</form:form>
	<ul id="navlist">
  <li id="home"><a href="index.jsp"></a></li>
  <li id="prev"><a href="Login.jsp"></a></li>
  <li id="next"><a href="HotelList.jsp"></a></li>
</ul>

</body>
</html>