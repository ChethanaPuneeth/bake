/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.services;

import com.bakery.beans.Registeration;
import com.bakery.daofactory.DaoFactory;
import com.bakery.daointerfaces.RegDao;
import java.sql.SQLException;


/**
 *
 * @author MSLC
 */
public class RegService {

  public boolean updateNewCustomer(Registeration customer) throws ClassNotFoundException, SQLException{
        RegDao customerDao =DaoFactory.getRegDao();
        return customerDao.updateNewCustomer(customer);
    }
}
