package com.myhib23;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

@SuppressWarnings("deprecation")
public class ClientForSave {
	
	 public static void main(String[] args)
	    {
	 
	        AnnotationConfiguration cfg=new AnnotationConfiguration();
	        cfg.configure("hibernate/hibernate.cfg.xml");
	 
	        SessionFactory factory = cfg.buildSessionFactory();
	        Session session = factory.openSession();
	        Product p=new Product(); 
	 
	        p.setProductId(105);
	        p.setProName("java");
	        p.setPrice(15000);
	 
	        Transaction tx = session.beginTransaction();
	        session.save(p);
	        System.out.println("Object saved successfully using annotations.....!!");
	        tx.commit();
	        session.close();
	        factory.close();
	    }

}
