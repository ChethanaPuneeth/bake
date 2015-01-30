/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.daointerfaces;

import com.bakery.beans.Login;
import java.sql.SQLException;

/**
 *
 * @author MSLC
 */
public interface LoginDao {
public abstract String validateUser(Login login ) throws ClassNotFoundException, SQLException;
}
