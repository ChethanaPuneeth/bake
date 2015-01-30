package com.test;
import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import com.bakery.beans.Display;
import com.bakery.daoimplementations.DisplayDaoImplementation;



public class DisplayTest {
	
	

@Test
	public void testDisplayItm() throws ClassNotFoundException, SQLException
	{
	Display lb=new Display();



	DisplayDaoImplementation ldi=new DisplayDaoImplementation();

	Display role=ldi.displayitm(lb);
	assertNotNull(role);
	System.out.println("successfull");
	}


	}


