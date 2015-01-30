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
public class SubmitDaoImplementation implements SubmitDao {
public boolean valid(Submit submit) throws ClassNotFoundException, SQLException{
        Connection con = DBUtility.getConnection();
        PreparedStatement psmt = con.prepareStatement("insert into Items values(?, ?, ?, ?,?)");
        psmt.setString(1, submit.getitemCode());
        psmt.setString(2, submit.getitemName());
        psmt.setString(3, submit.getitemPrice());
        psmt.setString(4, submit.getQuantity());
        psmt.setString(5, submit.getitemMfd());
        boolean i=psmt.execute();
        psmt.close();
        DBUtility.closeConnection(con);
            return i;
    }
}