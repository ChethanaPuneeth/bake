/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MSLC
 */
public class DBUtility {
public static Connection getConnection( ) throws ClassNotFoundException, SQLException{
        Connection con = null;
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con =DriverManager.getConnection("jdbc:oracle:thin:@172.16.154.10:1521:elp","elp1131","msat123$");
}
catch(Exception e){e.printStackTrace();}    return con;
        }

     public static void closeConnection(Connection con) throws SQLException{
         con.close( );
    }
}
