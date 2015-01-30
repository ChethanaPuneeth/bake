/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.daoimplementations;

import com.bakery.beans.Display;
import com.bakery.daointerfaces.DisplayDao;
import com.bakery.util.DBUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


/**
 *
 * @author MSLC
 */
public class DisplayDaoImplementation implements DisplayDao {
public Display displayitm(Display display) throws ClassNotFoundException, SQLException{
        Connection con = DBUtility.getConnection();
        //List itm=new ArrayList();
        Display d=new Display();
        PreparedStatement psmt = con.prepareStatement("select * from Items where ItemID=?");
        psmt.setString(1,display.getitemCode());
        ResultSet rs = psmt.executeQuery();
        while(rs.next()){
            d.setitemCode(rs.getString("ItemID"));
            d.setitemName(rs.getString("ItemName"));
            d.setitemPrice(rs.getString("ItemPrice"));
            d.setitemMfd(rs.getString("ItemMFD"));
        }
        psmt.close();
        DBUtility.closeConnection(con);
        return d;
    }
}
