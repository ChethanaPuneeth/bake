/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.daointerfaces;

import com.bakery.beans.Registration1;
import java.sql.SQLException;

/**
 *
 * @author MSLC
 */
public interface RegDao1 {
//public abstract List getAllCustomerDetails( ) throws ClassNotFoundException, SQLException;
    public abstract boolean addNewCustomer(Registration1 customer ) throws ClassNotFoundException, SQLException;
    //public abstract boolean updateNewCustomer(Registeration customer ) throws ClassNotFoundException, SQLException;
}
