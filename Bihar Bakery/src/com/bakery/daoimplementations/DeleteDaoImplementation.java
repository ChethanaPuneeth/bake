/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.daoimplementations;

import com.bakery.beans.DeleteBean;
import com.bakery.daointerfaces.DeleteDao;
import com.bakery.util.DBUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author MSLC
 */
public class DeleteDaoImplementation implements DeleteDao {
public String delete(DeleteBean delete) throws ClassNotFoundException, SQLException{
        Connection con = DBUtility.getConnection();
        PreparedStatement psmt = con.prepareStatement("delete from Items where ItemID=?");
        psmt.setString(1, delete.getitemCode());
        boolean i=psmt.execute();
        if(i==true)
            return "Success";
        else
            return "Failure";
    }
}