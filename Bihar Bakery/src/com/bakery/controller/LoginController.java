/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.controller;

import com.bakery.beans.Login;
import com.bakery.services.LoginService;
import com.bakery.servicesfactory.ServiceFactory;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author MSLC
 */

public class LoginController extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String userName = request.getParameter("userName");
            String password = request.getParameter("password");
            String role = "";
            Login loginInfo = new Login( );
            loginInfo.setUserName(userName);
            loginInfo.setPassword(password);
            LoginService loginService = ServiceFactory.getLoginService();
        try{
         role = loginService.validateUser(loginInfo);
        }
        catch(ClassNotFoundException ce){
            ce.printStackTrace();
            // append exception message to log file
        }
        catch(SQLException se){
            se.printStackTrace( );
            // append exception message to log file
        }
        if( role.equalsIgnoreCase("Admin")){
            HttpSession session = request.getSession();
            session.setAttribute("userName", userName);
            RequestDispatcher rd = request.getRequestDispatcher("AdminHomePage.jsp");
            rd.forward(request, response);

        }

        if( role.equalsIgnoreCase("user")){
            HttpSession session = request.getSession();
            session.setAttribute("userName", userName);
            RequestDispatcher rd = request.getRequestDispatcher("CustomerView.jsp");
            rd.forward(request, response);

        }

        if( role.equalsIgnoreCase("invalid")){
            //String invalidPage = getServletContext( ).getInitParameter("invalidPage");
            RequestDispatcher rd = request.getRequestDispatcher("index.jsp?msg=Invalid LoginID or Password.");
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

