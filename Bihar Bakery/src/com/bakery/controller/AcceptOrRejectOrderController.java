package com.bakery.controller;

import java.io.*;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bakery.services.OrderService;
import com.bakery.servicesfactory.ServiceFactory;

/**
 * Servlet implementation class AcceptOrRejectOrderController
 */
public class AcceptOrRejectOrderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AcceptOrRejectOrderController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String totalOrders = request.getParameter("totalOrders");
		int orderCount = Integer.parseInt(totalOrders);
		OrderService orderService = ServiceFactory.getOrderService();
		System.out.println(orderCount);
		//PrintWriter out=response.getWriter();
		
		for(int i=1;i<=orderCount;i++)
		{
			String orderId = request.getParameter("orderId"+i);
			String status = request.getParameter("status"+i);
			String Quantity=request.getParameter("quantity"+i);
			String Itemname = request.getParameter("ItemName"+i);
			
			try 
			{
				orderService.updateOrderStatus(orderId, status,Quantity,Itemname);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher(
		"/AdminHomePage.jsp");
		rd.forward(request, response);
	}

}
