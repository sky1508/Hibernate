package com.myhib17;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ForLogic2 {
	@SuppressWarnings("rawtypes")
	public static void main(String args[])
	{
	 
	Configuration cfg = new Configuration();
	cfg.configure("hibernate/hibernate.cfg.xml");
	 
	SessionFactory factory = cfg.buildSessionFactory();
	Session session = factory.openSession();
	
	
	//Selecting all parents with all child objects
	Query qry =session.createQuery("from Vendor v");
	List l=qry.list();
	Iterator it = l.iterator();
	 
	while(it.hasNext())
	{
	 
	Object o = it.next();
	Vendor v = (Vendor) o;
	System.out.println(v.getVendorId()+ " " +v.getVendorName());
	 
	Set s= v.getChildren();
	Iterator it1=s.iterator();
	 
	while(it1.hasNext())
	{
	Customer c = (Customer) it1.next();
	System.out.println(c.getCustomerId()+" "+c.getCustomerName()+ " "+ c.getForevenId());
	 
	}
	 
	}
	 
	session.close();
	System.out.println("One To Many is Done for selecting.....!");
	factory.close();
	 
	}
}
