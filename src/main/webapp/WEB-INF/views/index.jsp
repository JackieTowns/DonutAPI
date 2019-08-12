<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Donuts</title>
</head>
<body>


	<h1> Donuts</h1>
	<hr/>
	
	<ul>
		<c:forEach items="${donut}" var="theDonuts">
	
		 <li><a href="/donut-results?id=${theDonuts.id}">${theDonuts.name}</a></li> 
		<%-- <li>${theDonuts.name}</li> --%>	
		
		</c:forEach>
	</ul>


</body>
</html>