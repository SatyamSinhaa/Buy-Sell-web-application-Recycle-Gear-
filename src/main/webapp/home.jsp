<%@page import="java.util.ArrayList"%>
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
	<form action="category">
		<select name="category">
			<option>Category</option>
			<option value="mobile">Mobile</option>
			<option value="laptop">Laptop</option>
			<option value="tv">TeleVission</option>
			<option value="furnitures">Furniture</option>
			<option value="bike">Bikes</option>
			<option value="car">Cars</option>
		</select>
		<button>search</button>
	</form>
	<br>
	<a href="registerproduct.jsp?<%=request.getParameter("email")%>"><button>SELL</button></a>
	<br>

	<%
	@SuppressWarnings("unchecked")
	List<Product> li = (List<Product>) request.getAttribute("list");
	%>
	<%
	if (li != null) {
	%>
	<div style="display: flex;">
		<%
		for (Product p : li) {
		%>
		<div style="margin-left: 10%; margin-top: 40px;">
			<img alt="no image" src="<%=p.getImage()%>" height=100px><br>
			<%=p.getName()%>
			<br>
			<%=p.getDescription()%>
			<br>
		
				<h3><%=p.getPrice()%></h3>
				<a href="buy?id=<%=p.getId()%>"><button>BUY</button></a>
		
		</div>
		<%
		}
		}
		%>

	</div>
	<a href="profile">myprofile</a>
</body>
</html>