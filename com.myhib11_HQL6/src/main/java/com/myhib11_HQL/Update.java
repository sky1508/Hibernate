package com.myhib11_HQL;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate/hibernate.cfg.xml"); 

		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();		

		 Query qry = session.createQuery("update Product p set p.proName=? where p.productId=101");
		 qry.setParameter(0,"updated..");
		 int res = qry.executeUpdate();		
		
		 System.out.println("Command successfully executed....");
	     System.out.println("Numer of records effected due to update query "+res);
		session.close();
		factory.close();


	}

}
