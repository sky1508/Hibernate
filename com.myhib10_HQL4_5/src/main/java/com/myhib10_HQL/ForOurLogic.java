package com.myhib10_HQL;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ForOurLogic {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate/hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		

		//Total Number of Records
		/*Query qry = session.createQuery("from Product p");
		 
		List l =qry.list();
		System.out.println("Total Number Of Records : "+l.size());
		Iterator it = l.iterator();
 
		while(it.hasNext())
		{
			Object o = (Object)it.next();
			Product p = (Product)o;
			System.out.println("Product id : "+p.getProductId());
			System.out.println("Product Name : "+p.getProName());
			System.out.println("Product Price : "+p.getPrice());
			System.out.println("----------------------");
		}		
		*/
		
		//Selecting the records
		Query qry = session.createQuery("select p.productId from Product p");

		List l =qry.list();
		System.out.println("Total Number Of Records : "+l.size());
		Iterator it = l.iterator();

		while(it.hasNext())
		{
			Integer i = (Integer)it.next();
			System.out.println("Product id : "+i.intValue());
			System.out.println("---------------------------");

		}		
		
		
		 //Selecting all objects(records) end________________________ 		
		/* 
		Query qry = session.createQuery("select p.productId,p.proName from Product p");
		 
		List l =qry.list();
		System.out.println("Total Number Of Records : "+l.size());
		Iterator it = l.iterator();
 
		while(it.hasNext())
		{
			Object o[] = (Object[])it.next();
 
			System.out.println("Product id : "+o[0]+ "Product Name : "+o[1]);
 
			System.out.println("----------------");
		}*/	
		session.close();
		factory.close();


	}

}
