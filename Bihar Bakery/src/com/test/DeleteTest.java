package com.test;
import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import com.bakery.beans.DeleteBean;
import com.bakery.daoimplementations.DeleteDaoImplementation;



public class DeleteTest {
	String itemCode="s123";
	

@Test
	public void testDelete() throws ClassNotFoundException, SQLException
	{
	DeleteBean lb=new DeleteBean();
	lb.setitemCode(itemCode);


	DeleteDaoImplementation ldi=new DeleteDaoImplementation();

	String role=ldi.delete(lb);
	assertEquals("Failure",role);
	System.out.println("successfull");
	}


	}


