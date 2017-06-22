package com.myhib8_comp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ForOurLogic {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate/hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
 
		Product p=new Product();
 
		p.setProductId(101);
                p.setProName("iPhone");
                p.setPrice(25000); 
 
	       Transaction tx=session.beginTransaction();
	          session.save(p);
	          System.out.println("Object Loaded successfully.....!!");
	       tx.commit();     
 
		session.close();
		factory.close();


	}

}
