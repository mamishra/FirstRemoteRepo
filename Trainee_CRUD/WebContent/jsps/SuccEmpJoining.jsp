<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
		<script src="jsLib/jquery-1.12.3.js" type="text/javascript"></script>
		<script src="jsLib/MyJsLib.js" type="text/javascript"></script>
	</head>
	<body bgcolor="wheat">
		<h1>Capgemini India Pvt. Ltd. Mumbai</h1>
		<h3>${pageHead}</h3>
		
		<table border="5" align="center" bgcolor="cyan" bordercolor="red" cellpadding="5" >
			<tr>
				<th>Trainee ID</th>
				<th>Trainee Name</th>
				<th>Trainee Location</th>
				<th>Trainee Domain</th>
			</tr>
			
			<tr>
				<td>${trainee.tId }</td>
				<td>${trainee.tName }</td>
				<td>${trainee.tLocation }</td>
				<td>${trainee.tDomain }</td>
				
			</tr>
		</table><br/><br/>
		<a href="getEntryPage.do">ADD NEW EMPLOYEE</a><br/><br/>
		<a href="getHomePage.do">HOME</a><br/><br/>
	</body>
</html>