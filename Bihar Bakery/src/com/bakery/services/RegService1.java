/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.services;

import com.bakery.beans.Registration1;
import com.bakery.daofactory.DaoFactory;
import com.bakery.daointerfaces.RegDao1;
import java.sql.SQLException;
//import java.util.List;

/**
 *
 * @author MSLC
 */
public class RegService1 {


   public boolean addNewCustomer(Registration1 customer) throws ClassNotFoundException, SQLException{
        RegDao1 customerDao =DaoFactory.getRegDao1();
        return customerDao.addNewCustomer(customer);
    }
}
