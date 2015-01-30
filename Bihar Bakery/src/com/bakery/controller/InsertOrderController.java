package com.bakery.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bakery.beans.Display;
import com.bakery.beans.Order;
import com.bakery.services.OrderService;
import com.bakery.servicesfactory.ServiceFactory;
import com.bakery.util.DBUtility;

/**
 * Servlet implementation class InsertOrderController
 */
public class InsertOrderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertOrderController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	     int d = (int)(Math.random()*(500)+200);
			String rand=""+d;
		HttpSession se = request.getSession();
		se.setAttribute("order", rand);
		String OID = (String) request.getSession().getAttribute("order");
		String userName = (String) request.getSession().getAttribute("userName");
		System.out.println(userName);
		String requestString = request.getParameter("selectedItems");
		OrderService orderService = ServiceFactory.getOrderService();
		 
		try 
		{
			System.out.println(requestString);
			ArrayList a1 = orderService.placeOrder(requestString, userName,rand);
			request.setAttribute("itemCatalogue",a1);
			RequestDispatcher rd = getServletContext().getRequestDispatcher(
			"/Cart.jsp");
			rd.forward(request, response);
		} 
		catch (ClassNotFoundException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (SQLException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
