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
@WebServlet("/profile")
public class MyProfile extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String u=LoginUser.user;
		Crud c=new Crud();
		User user=c.fetchUser(u);
		req.setAttribute("user", user);
		RequestDispatcher dispatcher=req.getRequestDispatcher("profile.jsp");
		dispatcher.forward(req, res);
	}

}
