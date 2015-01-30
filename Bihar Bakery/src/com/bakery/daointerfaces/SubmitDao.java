/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.daointerfaces;

import com.bakery.beans.Submit;
import java.sql.SQLException;

/**
 *
 * @author MSLC
 */
public interface SubmitDao {
public abstract boolean valid(Submit submit ) throws ClassNotFoundException, SQLException;
}