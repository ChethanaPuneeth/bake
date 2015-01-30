/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bakery.servicesfactory;

import com.bakery.services.RegService;
import com.bakery.services.RegService1;
import com.bakery.services.LoginService;
import com.bakery.services.SubmitService;
import com.bakery.services.SubmitService1;
import com.bakery.services.DeleteService;
import com.bakery.services.DisplayService;
import com.bakery.services.StatusService;
import com.bakery.services.OrderService;

/**
 *
 * @author MSLC
 */
public class ServiceFactory {
    private static RegService regService = null;
    private static RegService1 regService1 = null;
    private static LoginService loginService = null;
    private static SubmitService submitService = null;
    private static SubmitService1 submitService1 = null;
    private static DeleteService deleteService = null;
    private static DisplayService displayService = null;
    private static StatusService statusService = null;
    private static OrderService orderService = null;

    public static RegService getRegService( ){
        if(regService == null){
            regService = new RegService( );
        }
        else{
            return regService;
        }
        return regService;
    }

    public static RegService1 getRegService1( ){
        if(regService1 == null){
            regService1 = new RegService1( );
        }
        else{
            return regService1;
        }
        return regService1;
    }

    public static LoginService getLoginService( ){
        if(loginService==null){
            loginService= new LoginService( );
        }
        else{
            return loginService;
        }
        return loginService;
    }

    public static SubmitService getSubmitService( ){
        if(submitService == null){
            submitService = new SubmitService( );
        }
        else{
            return submitService;
        }
        return submitService;
    }


   public static SubmitService1 getSubmitService1( ){
        if(submitService1 == null){
            submitService1 = new SubmitService1( );
        }
        else{
            return submitService1;
        }
        return submitService1;
    }

    public static DeleteService getDeleteService( ){
        if(deleteService == null){
            deleteService = new DeleteService( );
        }
        else{
            return deleteService;
        }
        return deleteService;
    }

    public static DisplayService getDisplayService( ){
        if(displayService == null){
            displayService = new DisplayService( );
        }
        else{
            return displayService;
        }
        return displayService;
    }
    public static StatusService getStatusService( ){
        if(statusService == null){
            statusService = new StatusService( );
        }
        else{
            return statusService;
        }
        return statusService;
    }
    public static OrderService getOrderService( ){
        if(orderService == null){
            orderService = new OrderService( );
        }
        else{
            return orderService;
        }
        return orderService;
    }
}
