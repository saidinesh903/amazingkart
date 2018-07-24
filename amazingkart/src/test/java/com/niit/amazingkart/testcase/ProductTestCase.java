package com.niit.amazingkart.testcase;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.amazingkart.DAO.ProductDAO;
import com.niit.amazingkart.DAO.SupplierDAO;
import com.niit.amazingkart.model.Product;
import com.niit.amazingkart.model.Supplier;

public class ProductTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static ProductDAO productDAO;
	@Autowired
	static Product product;
	
	@BeforeClass
	public static void initialize()
	{
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		
		productDAO =  (ProductDAO) context.getBean("productDAO");
		
		product = (Product)context.getBean("product");
		
	}
	@Ignore
	@Test
	public void createProductTestCase()
	{
		
		product.setId("PROD1");
		product.setCategory_id("CATG1");
		product.setDescription("Diabetic Medicine");
		product.setName("Glimmy1");
		product.setPrice(210);
		product.setQuantity(1);
		product.setSupplier_id("SUPP1");
		
		boolean flag =  productDAO.saveOrUpdate(product);

		assertEquals("createProductTestCase",true,flag);
		
	}
	@Ignore
	@Test
	public void updateProductTestCase()
	{
		product.setId("PROD1");
		product.setName("ADITYA");
		product.setDescription("MOBILES");
		product.setCategory_id("MOTOROLA");
		product.setPrice(15000);
		product.setSupplier_id("SUPP1");
		product.setQuantity(73);
		boolean flag = productDAO.saveOrUpdate(product);
		assertEquals("update Product TestCase",true,flag);
	}
	@Test
	public void deleteProductTestCase()
	{
	boolean status =	productDAO.delete("PROD1");
	assertEquals("delete product test case" , true, status);
	
	}

	@Ignore
	@Test
	public void listAllProductTestCase()
	{
		int actualSize = productDAO.list().size();
		assertEquals(2, actualSize);
	} 
}
