package com.myhib24;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("deprecation")
public class ForLogic {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate/hibernate.cfg.xml");
		 
		SessionFactory factory = new AnnotationConfiguration().configure("hibernate/hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();		
 
	    Vendor v=new Vendor();
	    v.setVendorId(100);
	    v.setVendorName("java");
 
	    Customer c1=new Customer();
	    c1.setCustomerId(500);
	    c1.setCustomerName("customer1");
 
	    Customer c2=new Customer();
	    c2.setCustomerId(501);
	    c2.setCustomerName("customer2");

	    Set s=new HashSet();
	    s.add(c1);
	    s.add(c2);

	    v.setChildren(s);

	    Transaction tx=session.beginTransaction();
	    session.save(v);
	    tx.commit();

		session.close();
		System.out.println("One to Many Annotatios Done...!!!!!!");
		factory.close();


	}

}
