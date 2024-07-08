package BuySell.controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import BuySell.dao.Crud;
import BuySell.dto.Product;

@WebServlet("/buy")
public class BuyProduct extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		System.out.println(id);
		Crud c=new Crud();
		Product db = c.buy(id);
		req.setAttribute("product", db);
		RequestDispatcher dispatcher=req.getRequestDispatcher("buy.jsp");
		dispatcher.forward(req, res);
	}
	
}
