/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.services;

import com.bakery.beans.DeleteBean;
import com.bakery.daofactory.DaoFactory;
import com.bakery.daointerfaces.DeleteDao;
import java.sql.SQLException;

/**
 *
 * @author MSLC
 */
public class DeleteService {
public String delete(DeleteBean delete) throws ClassNotFoundException, SQLException{
        DeleteDao deleteDao = DaoFactory.getDeleteDao();
        return deleteDao.delete(delete);
    }
}
