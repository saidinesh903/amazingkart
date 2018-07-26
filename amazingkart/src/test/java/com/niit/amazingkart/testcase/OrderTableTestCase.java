package com.niit.amazingkart.testcase;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.amazingkart.DAO.OrderTableDAO;
import com.niit.amazingkart.model.OrderTable;

public class OrderTableTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;
	
	@Autowired
	static OrderTable orderTable;
	
	@Autowired
	static OrderTableDAO orderTableDAO;
	
	@BeforeClass
	public static void initialize()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		orderTableDAO =  (OrderTableDAO) context.getBean("orderTableDAO");
		
		
		orderTable = (OrderTable)context.getBean("orderTable");
		
	}
	
	
	@Ignore
	@Test
	public void createOrderTableTestCase(){
		orderTable.setId(1);
		orderTable.setUser_id("IsaacDV");
		orderTable.setStatus("N");
		boolean flag = orderTableDAO.save(orderTable);
		assertEquals("createOrderTableTestCase", true, flag);
	}
	
	/*@Test
	public void listTestCase(){
		int orderedSize = orderTableDAO.list("IsaacDV").size();
		assertEquals(1, orderedSize);
	}
*/
}
