<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
		<script src="jsLib/jquery-1.12.3.js" type="text/javascript"></script>
		<script src="jsLib/MyJsLib.js" type="text/javascript"></script>
	</head>
	<body bgcolor="wheat">
		
		<h1>Enter Trainee Information</h1>
		
		<sf:form method="post" modelAttribute="trainee" action="submitTraineeDetails.do">
		
			  <label for="tId">Enter Trainee Id:</label>
			  <sf:input path="tId" for="tId" type="number"/><br/>
			  
			 <label for="tName">Enter Trainee Name:</label>
			  <sf:input path="tName" for="tName" type="text"/><br/>
			  
			  <label for="tLocation">Enter Location of Joining:</label><br/>
			  <sf:radiobutton path="tLocation" for="tLocation" value="CHENNAI" label="CHENNAI"/><br/>
			  <sf:radiobutton path="tLocation" for="tLocation" value="MUMBAI" label="MUMBAI"/><br/>
			  <sf:radiobutton path="tLocation" for="tLocation" value="PUNE" label="PUNE"/><br/>
			  <sf:radiobutton path="tLocation" for="tLocation" value="BANGALORE" label="BANGALORE"/><br/>
			  
			  <label for="tDomain">Enter Domain:</label>
			  <sf:select path="tDomain" id="tDomain">
			  	<sf:option value="JEE" path="tDomain" for="tDomain">JEE</sf:option>
			  	<sf:option value=".NET" path="tDomain" for="tDomain">.NET</sf:option>
			  	<sf:option value="MainFrame" path="tDomain" for="tDomain">MainFrame</sf:option>
			  </sf:select>
			  <br/>
			  
			  <input type="submit" value="Submit Details"/>
		</sf:form>
		
		
		
	</body>
</html>