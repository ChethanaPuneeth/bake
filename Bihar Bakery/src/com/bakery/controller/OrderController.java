/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.controller;

import com.bakery.beans.Display;
import com.bakery.services.OrderService;
import com.bakery.servicesfactory.ServiceFactory;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MSLC
 */

public class OrderController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    	OrderService orderService = ServiceFactory.getOrderService();
//	
		ArrayList<Display> a1;
		try {
			a1 = orderService.displayitm1();
			request.setAttribute("itemCatalogue",a1);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher(
		"/PlaceOrder.jsp");
		rd.forward(request, response);
    }                

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
        
    }

  
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        processRequest(request, response);
    }

    public String getServletInfo() {
        return "Short description";
    }

}

