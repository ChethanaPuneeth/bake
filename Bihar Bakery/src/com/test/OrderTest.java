package com.test;
import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;

import com.bakery.beans.Order;
import com.bakery.daoimplementations.OrderDaoImplementation;



public class OrderTest {
	String itemName="CCC";
	

@Test
	public void testGetPrice() throws ClassNotFoundException, SQLException
	{
	Order lb=new Order();
	lb.setItemName(itemName);


	OrderDaoImplementation ldi=new OrderDaoImplementation();

	String role=ldi.getPrice(itemName);
	assertEquals("45",role);
	System.out.println("successfull");
	}


	}


