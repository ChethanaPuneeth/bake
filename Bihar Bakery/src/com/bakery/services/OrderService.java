/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.services;

import com.bakery.daofactory.DaoFactory;
import com.bakery.daointerfaces.OrderDao;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MSLC
 */
public class OrderService {
public ArrayList displayitm1() throws ClassNotFoundException, SQLException{
        OrderDao orderDao = DaoFactory.getOrderDao();
        return orderDao.displayitm1();
    }
public ArrayList placeOrder(String request,String userName,String OID) throws ClassNotFoundException, SQLException{
    OrderDao orderDao = DaoFactory.getOrderDao();
    return orderDao.placeOrder(request,userName,OID);
}
public ArrayList viewPendingOrders() throws ClassNotFoundException, SQLException{
    OrderDao orderDao = DaoFactory.getOrderDao();
    return orderDao.viewPendingOrders();
}
public void updateOrderStatus(String orderId,String status,String Quantity,String Itemname)throws ClassNotFoundException, SQLException{
    OrderDao orderDao = DaoFactory.getOrderDao();
    orderDao.updateOrderStatus(orderId, status,Quantity,Itemname);

}

}
