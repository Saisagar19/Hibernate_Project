package com.tka.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ClientUpdate {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Mobile.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session = factory.openSession();
		Mobile mobile=new Mobile(1,"IQOO 9T","45000");
		session.update(mobile);
		session.beginTransaction().commit();
	}
}
