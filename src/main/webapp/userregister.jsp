<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%String msg=(String) request.getAttribute("msg"); %>
		<%if(msg!=null){ %>
			<%=msg %>
		<%} %>
	<form action="register">
	Name : <input type="text" name="name"> <br>
	Age : <input type="number" name="age"> <br>
	Email : <input type="text" name="email"> <br>	
	Gender :<input type="radio" name="gender" value="male">Male
			<input type="radio" name="gender" value="female">Female 
			<input type="radio" name="gender" value="other">Other <br>
	Phone : <input type="number" name="phone"> <br>
	Password : <input type="password" name="pwd"> <br>
	Address : <textarea name="address"></textarea> <br>
	<button>Submit</button>
</form>
</body>
</html>