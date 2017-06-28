package com.myhib11_HQL;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Delete {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate/hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		

		Integer i = new Integer(102);
		 Query qry = session.createQuery("delete from Product p where p.productId=:par");
		 qry.setParameter("par",i);
		 int res = qry.executeUpdate();

		 System.out.println("Command successfully executed....");
		 System.out.println("Numer of records effected due to delete query "+res);	
		session.close();
		factory.close();


	}

}
