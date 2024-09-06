package com.tka.hibernateDemo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class ClientQueryEx {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Mobile.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		// For HQL query(Hibernate Query Language)
		Query qry = session.createQuery("from Mobile");
		List<Mobile> listOfAllMobile = qry.list();
		for (Mobile mobile : listOfAllMobile) {
			System.out.println(mobile);

		}
	}
}
