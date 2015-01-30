package com.bakery.controller;


import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import com.bakery.beans.Order;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bakery.beans.Order;
import com.bakery.util.DBUtility;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddressUpdateController
 */
public class AddressUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddressUpdateController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try{
			String OID = (String) request.getSession().getAttribute("order");
		String address = request.getParameter("address");
	        String phoneno = request.getParameter("phoneno");
	        Connection con = DBUtility.getConnection();	
			PreparedStatement psmt = con.prepareStatement("Update orderplace set Address = ? ,Phoneno= ? where OrderID = ?");
			psmt.setString(1,address);
			psmt.setString(2,phoneno);
			psmt.setString(3,OID);
		    psmt.executeUpdate();
	        psmt.close();
	        DBUtility.closeConnection(con);
	        RequestDispatcher rd=request.getRequestDispatcher("Thankyou.jsp");
	        rd.forward(request, response);
	        
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
	

	}


