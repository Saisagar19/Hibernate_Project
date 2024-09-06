package com.tka.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientSelect {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();// it reads hibernate.cfg.xml file from the project

		// org.hibernate.UnknownEntityTypeException means that we do not provided the
		// entity obj
		cfg.addAnnotatedClass(Mobile.class);
		// session== connection
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Mobile mobile = session.load(Mobile.class, 2);
		System.out.println(mobile);
		session.close();
		// seesion.load() method is like select method from mySql but it select
		// particular element
		// session.load(className: which class you want to load ,primary key: means
		// particular obj/row no.
		Session session1 = factory.openSession();
		Mobile mobile1 = session1.load(Mobile.class, 1);
		System.out.println(mobile1);
		session1.close();
	}
}
