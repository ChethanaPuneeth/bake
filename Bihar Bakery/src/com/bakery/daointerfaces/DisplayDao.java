/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.daointerfaces;
import com.bakery.beans.Display;
import java.sql.SQLException;

public interface DisplayDao {
public abstract Display displayitm(Display display) throws ClassNotFoundException, SQLException;
}