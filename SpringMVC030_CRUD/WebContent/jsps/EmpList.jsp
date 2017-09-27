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
		
		<table border="5" align="center" bgcolor="cyan" bordercolor="red" cellpadding="5" id="empList">
			<tr>
				<th>Employee Number</th>
				<th>Employee Name</th>
				<th>View Details</th>
			</tr>
			
			<c:forEach items="${empList }" var="emp">
			<tr>
				<td>${emp.empNo }</td>
				<td>${emp.empNm }</td>
				<td><a href="getEmpDetails.do?empNo=${emp.empNo }">Click For Deatils</a></td>
			</tr>
			</c:forEach>
		</table><br/><br/>
		<a href="getHomePage.do">HOME</a>
	</body>
</html>