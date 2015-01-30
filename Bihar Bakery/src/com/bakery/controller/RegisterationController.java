/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.controller;

import com.bakery.beans.Registeration;
import com.bakery.services.RegService;
import com.bakery.servicesfactory.ServiceFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MSLC
 */

public class RegisterationController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String name = request.getParameter("custName");
            String num = request.getParameter("phNumber");
            String addr = request.getParameter("address");
            boolean i1=false;
            Registeration regInfo = new Registeration();
            regInfo.setcustName(name);
            regInfo.setphNumber(num);
            regInfo.setaddress(addr);
            RegService regService = ServiceFactory.getRegService();
        try{
                 i1 = regService.updateNewCustomer(regInfo);
           }
        catch(ClassNotFoundException ce){
            ce.printStackTrace();
            // append exception message to log file
        }
        catch(SQLException se){
            se.printStackTrace( );
            // append exception message to log file
        }

            if( i1==false){
            RequestDispatcher rd = request.getRequestDispatcher("Registration.jsp");
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

    /**
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

