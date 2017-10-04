<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
	<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Employee List</title>
		<script src="jsLib/jquery-1.12.3.js" type="text/javascript"></script>
		<script src="jsLib/MyJsLib.js" type="text/javascript"></script>
		
	</head>
	<body bgcolor="wheat">
		<h1>Capgemini India Pvt. Ltd. Mumbai</h1>
		<h3>${pageHead}</h3>
		
		<center>
		<table border="5" align="center" bgcolor="cyan" bordercolor="red" cellpadding="5" id="empList">
			<tr>
				<th>Trainee ID</th>
				<th>Trainee Name</th>
				<th>Trainee Location</th>
				<th>Trainee Domain</th>
			</tr>
			
			<c:forEach items="${traineeList }" var="trainee">
			<tr>
				<td>${trainee.tId }</td>
				<td>${trainee.tName }</td>
				<td>${trainee.tLocation }</td>
				<td>${trainee.tDomain }</td>
				
			</tr>
			</c:forEach>
		</table></center><br/><br/>
		<a href="getHomePage.do">HOME</a>
	</body>
</html>