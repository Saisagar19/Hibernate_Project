package com.tka.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientInsert {

	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Mobile.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Mobile mobile1 = new Mobile("Realme 2 pro", "50000");
		session.beginTransaction();
		session.save(mobile1);
		session.getTransaction().commit();
		session.close();
		Session session1 = factory.openSession();
		Mobile mobile2 = new Mobile("Iphone 5", "25000");
		session1.beginTransaction();
		session1.save(mobile2);
		session1.getTransaction().commit();
		session1.close();
	}

}
