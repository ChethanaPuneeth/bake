/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.daointerfaces;

import com.bakery.beans.Status;
import java.sql.SQLException;

/**
 *
 * @author MSLC
 */
public interface StatusDao {
public abstract String userStatus(Status status ) throws ClassNotFoundException, SQLException;
}
