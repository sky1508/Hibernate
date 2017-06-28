package com.myhib12_HQL;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Insert {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate/hibernate.cfg.xml");
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		Integer i = new Integer(600);
		Query qry = session.createQuery("insert into Product(productId,proName,price) select i.itemId,i.itemName,i.itemPrice from Items i where i.itemId= ?");
		qry.setParameter(0,i);
		int res = qry.executeUpdate();

		System.out.println("Command successfully executed....");
		System.out.println("Numer of records effected...,"+res);
		
		session.close();
		factory.close();


	}

}
