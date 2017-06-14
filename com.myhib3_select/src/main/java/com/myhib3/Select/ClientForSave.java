package com.myhib3.Select;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientForSave {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate/hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Object o=session.load(Product.class,new Integer(101));
		Product s=(Product)o;
		// For loading Transaction scope is not necessary...
		System.out.println("Loaded object product name is___"+s.getProName());
 
		System.out.println("Object Loaded successfully.....!!");
		session.close();
		factory.close();

	}

}
