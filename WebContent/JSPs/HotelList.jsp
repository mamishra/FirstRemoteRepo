<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
		<script type="text/javascript" src="scripts/jquery-1.12.3.js"></script>
		<script type="text/javascript" src="scripts/MyJsLib.js"></script>
	</head>
	<body>

		
		<table border="1">
			<tr>
				<th>Hotel ID</th>
				<th>City</th>
				<th>Hotel Name</th>
				<th>Address</th>
				<th>Description</th>
				<th>Cost/Night</th>
				<th>Phone Number 1</th>
				<th>Phone Number 2</th>
				<th>Rating</th>
				<th>Email ID</th>
				<th>Fax</th>
			</tr>
			<c:forEach items="${hotelList }" var="hotel">
				<tr>
					<td>${hotel.hotelID }</td>
					<td>${hotel.city }</td>
					<td>${hotel.hotelName }</td>
					<td>${hotel.address }</td>
					<td>${hotel.description }</td>
					<td>${hotel.avgRatePerNight }</td>
					<td>${hotel.phoneNumber1 }</td>
					<td>${hotel.phoneNumber2 }</td>
					<td>${hotel.rating }</td>
					<td>${hotel.email }</td>
					<td>${hotel.fax }</td>
					
				</tr>
			</c:forEach>
		</table>
		<a href="getAdminPage.do">Home Page</a>
		
		
	</body>
</html>