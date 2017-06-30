package com.myhib16;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ForLogic {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate/hibernate.cfg.xml");
		 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		//To delete a single parent object with all child objects
		Object o = session.get(Vendor.class, new Integer(101));
		Vendor v = (Vendor)o;
		 
		Transaction tx = session.beginTransaction();
		session.delete(v);
		tx.commit();
		
		
		
		/*To delete all the parent objects with child objects 
		 * Query qry =session.createQuery("from Vendor v");
			List l=qry.list();
			Iterator it = l.iterator();
			 
			Transaction tx = session.beginTransaction();
			 
			while(it.hasNext())
			{
			 
			Object o = it.next();
			Vendor v = (Vendor) o;
			session.delete(v);
			}
			 
			tx.commit();*/
		 
		session.close();
		System.out.println("One To Many is Done for deleting..!!");
		factory.close();
		 
		
	}

}
