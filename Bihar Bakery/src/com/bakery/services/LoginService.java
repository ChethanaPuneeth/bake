/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.services;

import com.bakery.beans.Login;
import com.bakery.daofactory.DaoFactory;
import com.bakery.daointerfaces.LoginDao;
import java.sql.SQLException;

/**
 *
 * @author MSLC
 */
public class LoginService {
public String validateUser(Login login) throws ClassNotFoundException, SQLException{
        LoginDao loginDao = DaoFactory.getLoginDao();
        return loginDao.validateUser(login);
    }
}
