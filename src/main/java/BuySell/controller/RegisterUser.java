package BuySell.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import BuySell.dao.Crud;
import BuySell.dto.User;

@WebServlet("/register")
public class RegisterUser extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");
		int age=Integer.parseInt(req.getParameter("age"));
		String email=req.getParameter("email");
		String gender=req.getParameter("gender");
		long phone=Long.parseLong(req.getParameter("phone"));
		String pwd=req.getParameter("pwd");
		String address=req.getParameter("address");
		User user=new User(name, age, email, gender, phone, pwd, address);
		Crud c=new Crud();
		
		try {
			c.saveUser(user);
			RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
			dispatcher.forward(req, res);
		} catch (Exception e) {
			RequestDispatcher dispatcher=req.getRequestDispatcher("userregister.jsp");
			req.setAttribute("msg", "give differnt email");
			dispatcher.include(req, res);
		}	
	}
}
