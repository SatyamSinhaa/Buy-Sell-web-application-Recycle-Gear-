<%@page import="BuySell.dto.User"%>
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
	<h1>My Profile</h1>
	<%User user=(User) request.getAttribute("user"); %> <br>
	Name : <%=user.getName() %> <br>
	Age : <%=user.getAge() %> <br>
	Gender : <%=user.getGender() %> <br>
	Phone : <%=user.getPhone() %> <br>
	Address : <%=user.getAddress() %> <br>
	Email : <%=user.getEmail() %> <br>
	Password : <%=user.getPwd() %> <br><br><br><br>
	
	<a href="my">my products</a>
</body>
</html>