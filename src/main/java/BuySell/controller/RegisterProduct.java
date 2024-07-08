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
@WebServlet("/add")
public class RegisterProduct extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String category=req.getParameter("category");
		String name=req.getParameter("name");
		int price=Integer.parseInt(req.getParameter("price"));
		String description=req.getParameter("description");
		String image=req.getParameter("image");
		String user=LoginUser.user;
		Product p=new Product(category, name, price, description, image, user);
		Crud c=new Crud();
		c.addProduct(p);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("home.jsp");
		dispatcher.include(req, res);
		
	}
	
}
