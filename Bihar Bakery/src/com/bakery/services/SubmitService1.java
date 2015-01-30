/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.services;

import com.bakery.beans.Submit;
import com.bakery.daofactory.DaoFactory;
import com.bakery.daointerfaces.SubmitDao;
import java.sql.SQLException;

public class SubmitService1 {
public boolean valid(Submit submit) throws ClassNotFoundException, SQLException{
        SubmitDao submitDao = DaoFactory.getSubmitDao1();
        return submitDao.valid(submit);
    }
}
