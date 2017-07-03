package com.myhib18;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ForLogic_Delete {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate/hibernate.cfg.xml");
		 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		Object o = session.get(Customer.class, new Integer(506));
		Customer c = (Customer)o;
		c.setParentObjects(null); //Removing FK dependency
 
		Transaction tx = session.beginTransaction();
		session.delete(c);
		tx.commit();

		session.close();
		System.out.println("many to one delete done..!!");
		factory.close(); 

	}

}
