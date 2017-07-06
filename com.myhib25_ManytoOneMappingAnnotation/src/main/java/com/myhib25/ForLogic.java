package com.myhib25;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")
public class ForLogic {
	
	public static void main(String[] args) {
		 
		SessionFactory factory = new AnnotationConfiguration().configure("hibernate/hibernate.cfg.xml").buildSessionFactory();
		Session session = factory.openSession();		

		Vendor v =new Vendor();

		v.setVendorId(100);
		v.setVendorName("java");

		Customer c1=new Customer();

		c1.setCustomerId(504);
		c1.setCustomerName("customer4");
		c1.setParent(v);

		Customer c2=new Customer();

		c2.setCustomerId(505);
		c2.setCustomerName("customer5");
		c2.setParent(v);

		Customer c3=new Customer();

		c3.setCustomerId(506);
		c3.setCustomerName("customer6");
		c3.setParent(v);         		             

		Transaction tx = session.beginTransaction();

		//session.save(v);
		session.save(c2);
		session.save(c2);
		session.save(c3);

		tx.commit();
		session.close();
		System.out.println("Many to One with annotation done...!!");
		factory.close();
 	}
}
