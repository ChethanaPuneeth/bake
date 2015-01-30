/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.services;

import com.bakery.beans.Display;
import com.bakery.daofactory.DaoFactory;
import com.bakery.daointerfaces.DisplayDao;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author MSLC
 */
public class DisplayService {
public Display displayitm(Display display) throws ClassNotFoundException, SQLException{
        DisplayDao displayDao = DaoFactory.getDisplayDao();
        return displayDao.displayitm(display);
    }
}
