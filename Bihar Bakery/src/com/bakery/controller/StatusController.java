/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.controller;

import com.bakery.beans.Status;
import com.bakery.services.StatusService;
import com.bakery.servicesfactory.ServiceFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;

/**
 *
 * @author MSLC
 */

public class StatusController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String orderCode = request.getParameter("statusCode");
           Status statusInfo = new Status();
            String state="";
            statusInfo.setorderCode(orderCode);
        
            StatusService statusService = ServiceFactory.getStatusService();
        try{
                 state=statusService.userStatus(statusInfo);
           }
        catch(ClassNotFoundException ce){
            ce.printStackTrace();
       
        }
        catch(SQLException se){
            se.printStackTrace( );
           
        }
            if( state.equalsIgnoreCase("ACCEPT")){
            //HttpSession session = request.getSession();
            //session.setAttribute("statusCode",orderCode);
            //String adminPage = getServletContext( ).getInitParameter("adminHomePage");
            RequestDispatcher rd = request.getRequestDispatcher("OrderStatus.jsp?msg1=Your order has been approved and will be delivered in short time. Thank You for Shopping.");
            rd.forward(request, response);

        }
            if( state.equalsIgnoreCase("DELIVERED")){
                //HttpSession session = request.getSession();
                //session.setAttribute("statusCode",orderCode);
                //String adminPage = getServletContext( ).getInitParameter("adminHomePage");
                RequestDispatcher rd = request.getRequestDispatcher("OrderStat.jsp?msg1=Your order has been DELIVERED. Thank You for Shopping.");
                rd.forward(request, response);

            }

        if( state.equalsIgnoreCase("PENDING")){
            //HttpSession session = request.getSession();
            //session.setAttribute("statusCode",orderCode);
            //String userPage = getServletContext( ).getInitParameter("ItemView");
            RequestDispatcher rd = request.getRequestDispatcher("OrderStatus.jsp?msg=Your order is under process. Sorry for the Delay.");
            rd.forward(request, response);

        }
        if( state.equalsIgnoreCase("REJECT")){
            //HttpSession session = request.getSession();
            //session.setAttribute("statusCode",orderCode);
            //String userPage = getServletContext( ).getInitParameter("ItemView");
            RequestDispatcher rd = request.getRequestDispatcher("OrderStatus.jsp?msg=Sorry,We dont provide service in your area.");
            rd.forward(request, response);

        }

        if( state.equalsIgnoreCase("invalid")){
            //String invalidPage = getServletContext( ).getInitParameter("invalidPage");
            RequestDispatcher rd = request.getRequestDispatcher("OrderStatus.jsp?msg=Sorry your order was not placed.");
            rd.forward(request, response);

        }
    }
         finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);

    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

