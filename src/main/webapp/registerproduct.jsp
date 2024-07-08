<%@page import="BuySell.controller.LoginUser"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<a href="home.jsp"><button>back</button></a>
	<form action="add">
	Enter category of your product :
		<select name="category">
			<option>Category</option>
			<option value="mobile">Mobiles</option>
			<option value="laptop">Laptops</option>
			<option value="tv">TV</option>
			<option value="bike">Bikes</option>
			<option value="car">Cars</option>
			<option value="furniture">Furnitures</option>
		</select><br>
		
		<input type="hidden" name="user" value="<%=request.getParameter("email")%>">
		Enter Product name : <input type="text" name="name"> <br>
		Enter price : <input type="number" name="price"> <br>
		Enter detail description : <br>
		<textarea rows="10" cols="50" name="description"></textarea><br>
		Enter path of photo : <input type="text" name="image"> <br>
		<button>sell</button>
	</form>
</body>
</html>