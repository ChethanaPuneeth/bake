/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.services;

import com.bakery.beans.Status;
import com.bakery.daofactory.DaoFactory;
import com.bakery.daointerfaces.StatusDao;
import java.sql.SQLException;

/**
 *
 * @author MSLC
 */
public class StatusService {
public String userStatus(Status status) throws ClassNotFoundException, SQLException{
        StatusDao statusDao = DaoFactory.getStatusDao();
        return statusDao.userStatus(status);
    }
}
