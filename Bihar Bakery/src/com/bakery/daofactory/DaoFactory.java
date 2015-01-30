/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.daofactory;

import com.bakery.daoimplementations.RegDaoImplementation;
import com.bakery.daoimplementations.RegDaoImplementation1;
import com.bakery.daoimplementations.LoginDaoImplementation;
import com.bakery.daoimplementations.SubmitDaoImplementation;
import com.bakery.daoimplementations.SubmitDaoImplementation1;
import com.bakery.daoimplementations.DeleteDaoImplementation;
import com.bakery.daoimplementations.DisplayDaoImplementation;
import com.bakery.daoimplementations.StatusDaoImplementation;
import com.bakery.daoimplementations.OrderDaoImplementation;
import com.bakery.daointerfaces.RegDao;
import com.bakery.daointerfaces.RegDao1;
import com.bakery.daointerfaces.LoginDao;
import com.bakery.daointerfaces.SubmitDao;
import com.bakery.daointerfaces.DeleteDao;
import com.bakery.daointerfaces.DisplayDao;
import com.bakery.daointerfaces.StatusDao;
import com.bakery.daointerfaces.OrderDao;

/**
 *
 * @author MSLC
 */
public class DaoFactory {
    private static RegDao regDao= null;
    private static RegDao1 regDao1= null;
    private static LoginDao loginDao=null;
    private static SubmitDao submitDao=null;
    private static DeleteDao deleteDao=null;
    private static DisplayDao displayDao=null;
    private static StatusDao statusDao=null;
    private static OrderDao orderDao=null;

    public static RegDao getRegDao( ){
        if(regDao==null){
            regDao=new RegDaoImplementation( );

        }
        else{
            return regDao;
        }
        return regDao;
    }

       public static RegDao1 getRegDao1( ){
        if(regDao1==null){
            regDao1=new RegDaoImplementation1( );

        }
        else{
            return regDao1;
        }
        return regDao1;
    }

    public static LoginDao getLoginDao( ){
        if(loginDao==null){
            loginDao=new LoginDaoImplementation( );
        }
        else{
            return loginDao;
        }
        return loginDao;

    }
    public static SubmitDao getSubmitDao( ){
        if(submitDao==null){
            submitDao=new SubmitDaoImplementation();

        }
        else{
            return submitDao;
        }
        return submitDao;
    }
    public static SubmitDao getSubmitDao1( ){
        if(submitDao==null){
            submitDao=new SubmitDaoImplementation1();

        }
        else{
            return submitDao;
        }
        return submitDao;
    }

    public static DeleteDao getDeleteDao( ){
        if(deleteDao==null){
            deleteDao=new DeleteDaoImplementation();

        }
        else{
            return deleteDao;
        }
        return deleteDao;
    }
    public static DisplayDao getDisplayDao( ){
        if(displayDao==null){
            displayDao=new DisplayDaoImplementation();

        }
        else{
            return displayDao;
        }
        return displayDao;
    }

    public static StatusDao getStatusDao( ){
        if(statusDao==null){
            statusDao=new StatusDaoImplementation();

        }
        else{
            return statusDao;
        }
        return statusDao;
    }
    public static OrderDao getOrderDao( ){
        if(orderDao==null){
            orderDao=new OrderDaoImplementation();

        }
        else{
            return orderDao;
        }
        return orderDao;
    }
}