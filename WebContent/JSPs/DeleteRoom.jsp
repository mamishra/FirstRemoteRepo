<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
        <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Insert title here</title>
	</head>
	<body>
		
		<form:form method="post" action="deleteRoom.do">
			<select name="roomID">
					<c:forEach items="${roomList }" var="room">
						<option value="${room.roomID }">${room.roomID }</option>
					</c:forEach>
			</select>
		<input type="submit" value="Delete Room"/>
			
		</form:form>
		
	</body>
</html>