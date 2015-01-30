/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.daoimplementations;

import com.bakery.beans.Status;
import com.bakery.daointerfaces.StatusDao;
import com.bakery.util.DBUtility;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author MSLC
 */
public class StatusDaoImplementation implements StatusDao {
public String userStatus( Status status) throws ClassNotFoundException, SQLException{
        String state = "";
        
        Connection con = DBUtility.getConnection();
        PreparedStatement psmt = con.prepareStatement("select Status from OrderPlace where OrderID=?");
        psmt.setString(1, status.getorderCode());
        ResultSet rs = psmt.executeQuery();
        if(rs.next()){
            state=rs.getString(1);
            System.out.println(state);
        }
        else{
            state = "invalid";
        }
        psmt.close();
        DBUtility.closeConnection(con);
        return state;
    }
}