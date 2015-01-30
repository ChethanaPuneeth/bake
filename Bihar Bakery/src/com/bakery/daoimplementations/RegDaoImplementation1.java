/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.daoimplementations;

import com.bakery.beans.Registration1;
import com.bakery.daointerfaces.RegDao1;
import com.bakery.util.DBUtility;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class RegDaoImplementation1 implements RegDao1 {
/*public List getAllCustomerDetails( )throws ClassNotFoundException, SQLException{
        List customerList = new ArrayList( );
        Connection con = DBUtility.getConnection();
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("insert into Customer values(?,?,?,?,?)");
        Registeration cust = null;
        while(rs.next()){
            cust = new Registeration();
            cust.setcustName(rs.getString("CustomerID"));
            cust.setuserName(rs.getString("CustomerName"));
            cust.setpassword(rs.getString("CustomerPassword"));
            cust.setphNumber(rs.getInt("Customer Contact"));
            cust.setaddress(rs.getString("CustomerAddress"));

            customerList.add(cust);

        }
        DBUtility.closeConnection(con);

        return customerList;
    }
*/
   public boolean addNewCustomer(Registration1 customer ) throws ClassNotFoundException, SQLException{

        Connection con = DBUtility.getConnection();
        String p="user";
        PreparedStatement psmt = con.prepareStatement("insert into logindetails values(?,?,?)");
         psmt.setString(1, customer.getuserName());
         psmt.setString(2, customer.getpassword());
         psmt.setString(3, p);
         boolean i=psmt.execute();
         psmt.close();
         DBUtility.closeConnection(con);
         return i;
     }
}
