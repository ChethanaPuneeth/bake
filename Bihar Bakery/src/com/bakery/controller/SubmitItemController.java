/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.controller;

import com.bakery.beans.Submit;
import com.bakery.services.SubmitService;
import com.bakery.servicesfactory.ServiceFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SubmitItemController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String code = request.getParameter("itemCode");
            String name = request.getParameter("itemName");
            String price = request.getParameter("itemPrice");
            String quantity=request.getParameter("Quantity");
            String mfd = request.getParameter("itemMfd");
            boolean i1=false;
            Submit submitInfo = new Submit( );
            submitInfo.setitemCode(code);
            submitInfo.setitemName(name);
            submitInfo.setitemPrice(price);
            submitInfo.setitemMfd(mfd);
            submitInfo.setQuantity(quantity);
            SubmitService submitService = ServiceFactory.getSubmitService();
        try{
                i1 = submitService.valid(submitInfo);
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
            RequestDispatcher rd = request.getRequestDispatcher("AdminHomePage.jsp?msg1=Done!!!");
            rd.forward(request, response);

        }
    }
         finally {
            out.close();
        }
    }


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

