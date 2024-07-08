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

@SuppressWarnings("serial")
@WebServlet("/category")
public class Category extends GenericServlet {

	@SuppressWarnings("unchecked")
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String category=req.getParameter("category");
		System.out.println(category);
		
		Crud c=new Crud();
			List<Product> li = c.fetch(category);
			System.out.println(li);
			req.setAttribute("list", li);
			RequestDispatcher dispatcher=req.getRequestDispatcher("home.jsp");
			dispatcher.forward(req, res);
	}
}