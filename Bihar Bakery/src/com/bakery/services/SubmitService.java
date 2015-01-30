/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.services;

import com.bakery.beans.Submit;
import com.bakery.daofactory.DaoFactory;
import com.bakery.daointerfaces.SubmitDao;
import java.sql.SQLException;

/**
 *
 * @author MSLC
 */
public class SubmitService {
public boolean valid(Submit submit) throws ClassNotFoundException, SQLException{
        SubmitDao submitDao = DaoFactory.getSubmitDao();
        return submitDao.valid(submit);
    }
}
