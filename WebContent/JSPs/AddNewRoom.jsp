<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Add new Room</title>
	</head>
	<body>
		
		<form:form method="post" modelAttribute="roomBean"  action="insertRoom.do" >
		
			<label for="hotelID">Hotel ID :</label>
			<form:select name="hotelID" path="hotelID" id="hotelID">
					<c:forEach items="${ hotelList }" var="hotel">
						<option value="${hotel.hotelID }">${hotel.hotelName }</option>
					</c:forEach>
			</form:select>
			
			<label for="roomNumber">Room Number :</label>
		  		<form:input path="roomNumber" id="roomNumber" type="text"/><br/>	
		  		
		  	<label for="roomType">Room Type :</label>
		  		<form:select path="roomType" id="roomType" >
		  			<form:option value="AC Deluxe">AC Deluxe</form:option>
		  			<form:option value="AC">AC</form:option>
		  			<form:option value="Non-AC">Non-AC</form:option>
		  		</form:select>
		  			<br/>	
		  	
		  	<label for="perNightRate">Per Night Rate :</label>
		  		<form:input path="perNightRate" id="perNightRate" type="text"/><br/>
		  		
		  	<label for="photo">Photo :</label>
		  		<form:input path="photo" id="photo" type="file"/><br/>
			
			
			<input type="submit" value="Confirm Changes"/>
			
		</form:form>
		
	</body>
</html>