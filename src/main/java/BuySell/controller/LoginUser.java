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
@WebServlet("/login")
public class LoginUser extends GenericServlet {
	static String user;
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String email=req.getParameter("email");
		user=email;
		String pwd=req.getParameter("pwd");
		
		System.out.println(email +"\n"+ pwd);
		Crud c=new Crud();
		try {
			User db=c.userLogin(email);
			if (db.getPwd().equals(pwd)) {
				System.out.println("success");
				RequestDispatcher dispatcher=req.getRequestDispatcher("home.jsp");
				dispatcher.forward(req, res);
			}
			else {
				req.setAttribute("msg", "password is wrong");
				RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
				dispatcher.forward(req, res);
			}
		} catch (Exception e) {
			req.setAttribute("msg", "email is wrong");
			RequestDispatcher dispatcher=req.getRequestDispatcher("login.jsp");
			dispatcher.forward(req, res);
		}
	}
	
}
