package com.myhib10_HQL;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ForOurLogic2 {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate/hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		

		//Parameterized HQL Query using named parameter
		Integer i = new Integer(101);
		/*Query qry = session.createQuery("from Product p where p.productId= :java4s");
        qry.setParameter("java4s",i);
 
		List l =qry.list();
		System.out.println("Total Number Of Records : "+l.size());
		Iterator it = l.iterator();
 
		while(it.hasNext())
		{
			Object o = (Object) it.next();
			Product p = (Product)o;
			System.out.println("Product Name : "+p.getProName());
			System.out.println("Product Price : "+p.getPrice());
			System.out.println("---------------------------");
 
		}*/
		
		//Using ? mark, 0 is for first ? mark
		Query qry = session.createQuery("from Product p where p.productId= ?");
        qry.setParameter(0,i);

		List l =qry.list();
		System.out.println("Total Number Of Records : "+l.size());
		Iterator it = l.iterator();

		while(it.hasNext())
		{
			Object o = (Object) it.next();
			Product p = (Product)o;
			System.out.println("Product Name : "+p.getProName());
			System.out.println("Product Price : "+p.getPrice());
			System.out.println("---------------------------");

		}		
		
		session.close();
		factory.close();


	}

}
