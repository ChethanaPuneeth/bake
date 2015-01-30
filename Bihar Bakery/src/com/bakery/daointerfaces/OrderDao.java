/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.daointerfaces;
import com.bakery.beans.Display;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MSLC
 */
public interface OrderDao {
public abstract ArrayList displayitm1() throws ClassNotFoundException, SQLException;
public abstract ArrayList placeOrder(String request,String userName,String OID)throws ClassNotFoundException, SQLException; 
public abstract ArrayList viewPendingOrders()throws ClassNotFoundException, SQLException; 
public abstract void updateOrderStatus(String orderId,String status,String Quantity,String Itemname)throws ClassNotFoundException, SQLException;
}