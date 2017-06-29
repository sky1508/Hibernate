package com.myhib14_HQL;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class ForLogic2 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate/hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		

		Criteria crit = session.createCriteria(Product.class);	
		 
		ProjectionList p1=Projections.projectionList();
		         p1.add(Projections.property("proName"));
		         p1.add(Projections.property("price"));	
 
		crit.setProjection(p1);		
 
		List l=crit.list();
 
		Iterator it=l.iterator();
 
		while(it.hasNext())
		{
			Object ob[] = (Object[])it.next();
			System.out.println(ob[0]+"--------"+ob[1]);
		}
 
		
		session.close();
		factory.close();


	}

}
