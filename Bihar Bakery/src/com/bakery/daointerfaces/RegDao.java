/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.daointerfaces;

import com.bakery.beans.Registeration;
import java.sql.SQLException;

/**
 *
 * @author MSLC
 */
public interface RegDao {
    public abstract boolean updateNewCustomer(Registeration customer ) throws ClassNotFoundException, SQLException;
}
