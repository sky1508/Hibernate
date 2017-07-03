package com.myhib18;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ForLogic2_Select {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate/hibernate.cfg.xml");
		 
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		
		
		//Selecting single child element with parent
		/*Object o = session.get(Customer.class, new Integer(506));
		Customer c = (Customer)o;
 
		System.out.println(c.getCustomerName());
		Vendor v=c.getParentObjects();
		System.out.println(v.getVendorName()); */
		
		//Selecting all child with parents
		
		Query qry=session.createQuery("from Customer c");
		 
	    List l=qry.list();
	    Iterator it = l.iterator();
	    while(it.hasNext())
	    {
	    	Object o = it.next();
	    	Customer c = (Customer)o;
	    	Vendor v=c.getParentObjects();
	    	System.out.println(c.getCustomerName()+"  "+v.getVendorName());
	    }
		
		session.close();
		System.out.println("Many To one is Done..!!");
		factory.close();

	}

}
