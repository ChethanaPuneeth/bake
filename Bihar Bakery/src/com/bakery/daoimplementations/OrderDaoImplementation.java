/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.daoimplementations;

import com.bakery.beans.Display;
import com.bakery.beans.Order;
import com.bakery.daointerfaces.OrderDao;
import com.bakery.util.DBUtility;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author MSLC
 */
public class OrderDaoImplementation implements OrderDao {

	public ArrayList displayitm1() throws ClassNotFoundException, SQLException{
        Connection con = DBUtility.getConnection();
        ArrayList itm=new ArrayList();
        
        PreparedStatement psmt = con.prepareStatement("select * from Items");
        String s="";
        ResultSet rs = psmt.executeQuery();
        while(rs.next()){
            Display d=new Display();
            d.setitemName(rs.getString("ItemName"));
      
           
            int value=Integer.parseInt(rs.getString("Quantity"));
            d.setitemPrice(rs.getString("ItemPrice"));
            d.setitemMfd(rs.getString("ItemMFD"));
            if(value<=0)
            {
            	s="No Stock";
            }
            else
            {
            	s=value+"";
            }
            d.setQuantity(s);
            itm.add(d);
        }
        psmt.close();
        DBUtility.closeConnection(con);
        return itm;
    }

	public Display fetchItem(String itemName) throws ClassNotFoundException, SQLException
	{
        Connection con = DBUtility.getConnection();
        
        PreparedStatement psmt = con.prepareStatement("select * from Items where itemName = ?");
        psmt.setString(1,itemName);
        ResultSet rs = psmt.executeQuery();
        Display d=null;
        while(rs.next()){
            d=new Display();
            d.setitemName(rs.getString("ItemName"));
            d.setitemPrice(rs.getString("ItemPrice"));
            d.setitemMfd(rs.getString("ItemMFD"));
        }
        psmt.close();
        DBUtility.closeConnection(con);
        return d;
	}
	
	public void insertOrder(String item,String quantity,String userName,String OID,String Status) throws ClassNotFoundException, SQLException
	{
		
		 Connection con = DBUtility.getConnection();
			PreparedStatement psmt = con.prepareStatement("Insert into orderplace(orderId,itemSelected,Quantity,UserName,Status) values(?,?,?,?,?)");
	     psmt.setString(1,OID);
	     psmt.setString(2,item);
	     psmt.setString(3,quantity);
	     psmt.setString(4,userName);
	     psmt.setString(5,Status);
	     psmt.executeUpdate();
	     psmt.close();
	     DBUtility.closeConnection(con);
	}
	@Override
	public ArrayList placeOrder(String request,String userName,String OID) throws ClassNotFoundException,
			SQLException {
		 String[] itemList = request.trim().split("#");
		 ArrayList itm=new ArrayList();
		 for(String item:itemList)
		 {
			 if(item.isEmpty())
			 	continue;
			  String itemName = item.substring(0,item.indexOf("-"));
			  String quantity = item.substring(item.indexOf("-")+1,item.length());
			  System.out.println(itemName+"  "+quantity);
			  Display d = fetchItem(itemName);
			  d.setStatus("PENDING");
			  d.setQuantity(quantity);
			  if(d!=null)
			  {
				  insertOrder(d.getitemName(),quantity,userName,OID,d.getStatus());
				  itm.add(d);
			  }
		 }
		return itm;
	}

	public String getPrice(String itemName) throws ClassNotFoundException, SQLException
	{
		Connection con = DBUtility.getConnection();
	     PreparedStatement psmt = con.prepareStatement("select Quantity from Items where ItemName = ?");
	     psmt.setString(1, itemName);
	     ResultSet rs = psmt.executeQuery();
	     String price="0.00";
	     if(rs.next())
	     {
	    	 price = rs.getString("Quantity");
	     }
	     psmt.close();
	     DBUtility.closeConnection(con);
	     return price;
	}
	@Override
	public ArrayList viewPendingOrders() throws ClassNotFoundException,
			SQLException {
		 Connection con = DBUtility.getConnection();
	     PreparedStatement psmt = con.prepareStatement("select * from orderPlace where status='PENDING'or status='ACCEPT'");
	        ResultSet rs = psmt.executeQuery();
			 ArrayList itm=new ArrayList();
	        while(rs.next()){
	            Order d=new Order();
	            d.setItemCode(rs.getString("OrderId"));
	            d.setItemName(rs.getString("itemSelected"));
	            d.setUsername(rs.getString("username"));
	            d.setAddress(rs.getString("Address"));
	            d.setStatus(rs.getString("Status"));
	            d.setQuantity(rs.getString("Quantity")); 
	            d.setItemPrice(getPrice(d.getItemName()));
	            System.out.println(d);
	            itm.add(d);
	        }
	        psmt.close();
	        DBUtility.closeConnection(con);
	        return itm;
	}

	@Override
	public void updateOrderStatus(String orderId, String status,String Quantity,String Itemname)
			throws ClassNotFoundException, SQLException {
		Connection con = DBUtility.getConnection();	
		PreparedStatement psmt = con.prepareStatement("Update orderplace set status = ? where orderID = ?");
		psmt.setString(1,status);
		psmt.setString(2, orderId);
		 psmt.executeUpdate();
         psmt.close();
         if(status.equalsIgnoreCase("ACCEPT"))
 		{
        	 PreparedStatement p = con.prepareStatement("select Quantity from Items where ItemName= ?");
        	 p.setString(1,Itemname);
        	 ResultSet a = p.executeQuery();
        	 int count=0;
        	 int q=0;
        	 int rem=0;
        	 String r="";
        	 if(a.next()){
                 count=Integer.parseInt(a.getString(1));
                 q=Integer.parseInt(Quantity);
                 r=count-q+"";
             }
        	 p.close();
 			PreparedStatement ps = con.prepareStatement("Update Items set Quantity= ? where ItemName= ?");
 			ps.setString(1,r);
 			ps.setString(2,Itemname);
 			System.out.println(Quantity+Itemname);
 			 ps.executeUpdate();
 			System.out.println(Itemname+Quantity);
 			ps.close();
 		}
         if(status.equalsIgnoreCase("DELIVERED")){
        	 PreparedStatement ps = con.prepareStatement("Update Items set Status= ? where ItemName= ?");
        	 ps.setString(1,status);
        	 ps.setString(2, orderId);
         }
         
        DBUtility.closeConnection(con);
	}

	
}
