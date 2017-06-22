package com.myhib9_comp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ForOurLogic {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate/hibernate.cfg.xml"); 
 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		
 
		Product p=new Product();
 
		p.setProductId(101);
	    p.setPrice(25000);
 
	    Object o=session.get(Product.class, p);
	    // here p must be an serializable object,
 
	    Product p1=(Product)o;
 
	    System.out.println("The price is: "+p1.getProName());	    
 
		System.out.println("Object Loaded successfully.....!!");
		session.close();
		factory.close();


	}

}
