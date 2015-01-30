package com.test;
import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import com.bakery.beans.Login;
import com.bakery.daoimplementations.LoginDaoImplementation;



public class LoginTest {
	String userName="admin";
	String password="12345";

@Test
	public void validateUser() throws ClassNotFoundException, SQLException
	{
	Login lb=new Login();
	lb.setUserName(userName);
	lb.setPassword(password);

	LoginDaoImplementation ldi=new LoginDaoImplementation();

	String role=ldi.validateUser(lb);
	assertEquals("admin",role);
	System.out.println("successfull");
	}


	}


