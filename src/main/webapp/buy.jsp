<%@page import="BuySell.dto.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	button {
		margin-left: 30px;
		/* padding: 20px; */
	}
</style>
</head>
<body>
<a href="home.jsp"><button>back</button></a>
	<h1>Buy</h1> 
	
			<h2><%Product product=(Product) request.getAttribute("product"); %>
			<%=product.getName() %> <br>
			<%=product.getPrice() %></h2>
	

	<form action="buyVerify">
		Enter amount : <input type="number" name="amount">
						<input type="hidden" name="id" value=<%=product.getId()%>>
		<button>buy</button>
	</form>

</body>
</html>