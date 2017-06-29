package com.myhib14_HQL;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projections;

public class ForLogic {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate/hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		

		Criteria crit = session.createCriteria(Product.class);
		 
		/*
				crit.setProjection(Projections.property("proName"));
				List l=crit.list();
				Iterator it=l.iterator();
		 
				while(it.hasNext())
				{
					String s=(String)it.next();
					System.out.println(s);
				}
		 
		*/	
				//crit.setProjection(Projections.property("price"));
				crit.setProjection(Projections.property("proName"));
				List l=crit.list();
				Iterator it=l.iterator();
		 
				while(it.hasNext())
				{
					//Double s=(Double)it.next();
					String s=(String) it.next();
					System.out.println(s);
				}
		
		session.close();
		factory.close();


	}

}
