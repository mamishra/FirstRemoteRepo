<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body bgcolor="wheat">
		
		
		<h1>Modify Page</h1>
		
		<form action="updateTrainee.do">
		<table border="5" align="center" bgcolor="cyan" bordercolor="red" cellpadding="5" >
			<tr>
				<th>Trainee ID</th>
				<th>Trainee Name</th>
				<th>Trainee Location</th>
				<th>Trainee Domain</th>
			</tr>
			
			<tr>
				<td><input type="number" name="tId" id="tId" value="${trainee.tId }"></td>
				<td><input type="text" name="tName" id="tName" value="${trainee.tName }"></td>
				<td><input type="text" name="tLocation" id="tLocation" value="${trainee.tLocation }"></td>
				<td><input type="text" name="tDomain" id="tDomain" value="${trainee.tDomain }"></td>
				
			</tr>
			<tr><td colspan="2"><input type="submit" value="Update"></td></tr>
		</table><br/><br/>
		</form>
		<a href="getEmpList.do">GO BACK TO LIST</a><br/><br/>
		<a href="getHomePage.do">HOME</a><br/><br/>
		
		
	
	
		
	</body>
</html>