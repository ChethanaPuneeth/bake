
package com.bakery.daoimplementations;

import com.bakery.beans.Registeration;
import com.bakery.daointerfaces.RegDao;
import com.bakery.util.DBUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class RegDaoImplementation implements RegDao {

     public boolean updateNewCustomer(Registeration customer ) throws ClassNotFoundException, SQLException{

        Connection con = DBUtility.getConnection();
        PreparedStatement psmt = con.prepareStatement("insert into Customer values(?,?,?)");
         psmt.setString(1, customer.getcustName());
         psmt.setString(2, customer.getphNumber());
         psmt.setString(3, customer.getaddress());
         boolean i=psmt.execute();
         psmt.close();
         DBUtility.closeConnection(con);
         return i;
     }
}
