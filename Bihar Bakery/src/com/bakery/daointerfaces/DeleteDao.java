/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.daointerfaces;
import com.bakery.beans.DeleteBean;
import java.sql.SQLException;

/**
 *
 * @author MSLC
 */
public interface DeleteDao {
public abstract String delete(DeleteBean delete ) throws ClassNotFoundException, SQLException;
}