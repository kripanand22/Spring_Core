<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Menu</h1>
	
	<table border=1 cellpadding="30%" align="center" bordercolor="red">
	
	<tr>
		<th>Code</th>
		<th>Item</th>
		<th>Price</th>
	</tr>
	
	<c:forEach var="item" items="${fooditem}">

	<tr>
	
	<td> ${item.id} </td></b>
	<td> ${item.item} </td></b>
	<td> ${item.price} </td></b>
	
	</c:forEach>
	</tr>
	</table>
</body>
</html>