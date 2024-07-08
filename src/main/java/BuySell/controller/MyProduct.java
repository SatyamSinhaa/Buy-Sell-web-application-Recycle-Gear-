package BuySell.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

import BuySell.dao.Crud;
import BuySell.dto.Product;
@WebServlet("/my")
public class MyProduct extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String u=LoginUser.user;
		Crud c=new Crud();
		List<Product> p=c.myProducts(u);
		req.setAttribute("product", p);
		RequestDispatcher dispatcher=req.getRequestDispatcher("myproduct.jsp");
		dispatcher.forward(req, res);
	}
}
