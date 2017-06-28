package com.myhib13_HQL;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

public class ForLogic {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate/hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		

		Criteria crit = session.createCriteria(Product.class);
		Criterion cn = Restrictions.gt("price",new Double(19000));
		crit.add(cn);
		List l=crit.list();
		System.out.println("List total size..._"+l.size());
		Iterator it=l.iterator();
 
		while(it.hasNext())
		{
			Product p=(Product)it.next();
			System.out.println(p.getProductId());
			System.out.println(p.getProName());
			System.out.println(p.getPrice());
			System.out.println("-----------------");
		}
		
		session.close();
		factory.close();


	}

}
