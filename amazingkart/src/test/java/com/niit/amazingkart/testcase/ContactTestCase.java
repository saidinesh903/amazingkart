package com.niit.amazingkart.testcase;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.amazingkart.DAO.ContactDAO;
import com.niit.amazingkart.model.Contact;

public class ContactTestCase {

	@Autowired
	static AnnotationConfigApplicationContext context;

	@Autowired
	static ContactDAO contactDAO;
	@Autowired
	static Contact contact;

	@BeforeClass
	public static void initialize() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();

		contactDAO = (ContactDAO) context.getBean("contactDAO");

		
		contact = (Contact) context.getBean("contact");

	}
@Ignore
	@Test
	public void createContactTestCase() {
		contact.setName("B Isaac Deva Varam");
		contact.setEmail("isaacdv84@gmail.com");
		contact.setContact("8194869957");
		contact.setMessage("Original : You designed a  web application");

		boolean flag = contactDAO.save(contact);

		assertEquals("createContactTestCase", true, flag);

	}

	/*@Test
	public void updateContactTestCase() {

		boolean flag = contactDAO.delete(0);

		assertEquals("updateContactTestCase", true, flag);

	}

	@Test
	public void listAllContactTestCase() {
		int actualSize = contactDAO.list().size();
		assertEquals(1, actualSize);
	}*/

}
