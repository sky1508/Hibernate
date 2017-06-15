package com.myhib3.Delete;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientForSave {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate/hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		 Object o=session.load(Product.class,new Integer(102));
	        Product p=(Product)o;
	 
	        Transaction tx = session.beginTransaction();
	        session.delete(p);
	        System.out.println("Object Deleted successfully.....!!");
	        tx.commit();
	        session.close();
	        factory.close();

	}

}
