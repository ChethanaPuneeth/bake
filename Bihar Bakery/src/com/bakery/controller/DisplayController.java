/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.controller;

import com.bakery.beans.Display;
import com.bakery.services.DisplayService;
import com.bakery.servicesfactory.ServiceFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author MSLC
 */

public class DisplayController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String code = request.getParameter("code");
            Display displayInfo = new Display( );
            displayInfo.setitemCode(code);
            
            Display a1=new Display();
            DisplayService displayService = ServiceFactory.getDisplayService();
        try{
                    a1=displayService.displayitm(displayInfo);

                out.println("<html>");
                out.println("<head>");
                out.println("<title>Modify</title>");
                out.println("</head>");
                out.println("<body bgcolor=dimblue>");
                out.println("<h2 align='center'>Item Selected is</h2>");
                out.println("<table align='center' border='1'>");
                
                out.println("<tr>");
                out.println("<th>");
                out.println("Item ID");
                out.println("</th>");
                out.println("<th>");
                out.println("Item Name");
                out.println("</th>");

                out.println("<th>");
                out.println("Item Price");
                out.println("</th>");
                
                out.println("<th>");
                out.println("Item MFD");
                out.println("</th>");

                out.println("</tr>");

                out.println("<form action='ModifyItemController'>");
                out.println("<tr>");
                out.println("<td>");
                out.println("<input type='text' name='itemCode'/>");
                out.println("</td>");
                out.println("<td>");
                out.println("<input type='text' name='itemName'/>");
                out.println("</td>");

                out.println("<td>");
                out.println("<input type='text' name='itemPrice'/>");
                out.println("</td>");

                out.println("<td>");
                out.println("<input type='text' name='itemMfd'/>");
                out.println("</td>");

                out.println("</tr>");

                out.println("<tr>");
                out.println("<td colspan='4' align='center'><input type='submit' value='Submit'/></td>");
                out.println("</tr>");
                out.println("</form>");
                out.println("</table>");
                
                out.println("</body>");
                out.println("</html>");

            
            }
        catch(ClassNotFoundException ce){
            ce.printStackTrace();
            // append exception message to log file
        }
        catch(SQLException se){
            se.printStackTrace( );
            // append exception message to log file
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

