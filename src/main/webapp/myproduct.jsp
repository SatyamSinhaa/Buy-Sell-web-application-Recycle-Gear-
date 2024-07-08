<%@page import="BuySell.dto.Product"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%List<Product> product=(List<Product>)request.getAttribute("product"); %>
	<table>
	<tr>
		<td>name</td>
		<td>description</td>
		<td>price</td>
		<td>update</td>
		<td>delete</td>
	</tr>
	<%for(Product p : product){ %>
	<tr>
		<td><%=p.getName() %></td>
		<td><%=p.getDescription() %></td>
		<td><%=p.getPrice() %></td>
		<td><a href="update"><button>Update</button></a></td>
		<td><a href="delete"><button>Delete</button></a></td>
	</tr>
	<%} %>
	</table>
</body>
</html>