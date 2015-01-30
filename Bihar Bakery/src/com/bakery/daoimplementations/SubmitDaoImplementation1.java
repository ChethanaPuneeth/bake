/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.daoimplementations;

import com.bakery.beans.Submit;
import com.bakery.daointerfaces.SubmitDao;
import com.bakery.util.DBUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author MSLC
 */
public class SubmitDaoImplementation1 implements SubmitDao {
public boolean valid(Submit submit) throws ClassNotFoundException, SQLException{
        Connection con = DBUtility.getConnection();
        PreparedStatement psmt = con.prepareStatement("update Items set ItemName=?, itemPrice=?, itemMFD=? where itemID=?");
        
        psmt.setString(1, submit.getitemName());
        psmt.setString(2, submit.getitemPrice());
        psmt.setString(3, submit.getitemMfd());
        psmt.setString(4, submit.getitemCode());
        boolean i=psmt.execute();
        psmt.close();
        DBUtility.closeConnection(con);
            return i;
    }
}