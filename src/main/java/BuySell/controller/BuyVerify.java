package BuySell.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import BuySell.dao.Crud;
@WebServlet("/buyVerify")
public class BuyVerify extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		int amount=Integer.parseInt(req.getParameter("amount"));
		System.out.println(id+amount);
		Crud c=new Crud();
		if (amount==c.fetchPrice(id)) {
			c.deleteProduct(id);
		}
		RequestDispatcher dispatcher=req.getRequestDispatcher("home.jsp");
		dispatcher.include(req, res);
	}
}
