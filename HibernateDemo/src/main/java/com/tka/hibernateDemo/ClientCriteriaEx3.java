package com.tka.hibernateDemo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

public class ClientCriteriaEx3 {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Mobile.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		// select * from mobile where mobId>2; in HibernateQl
		Criteria crt = session.createCriteria(Mobile.class);
		crt.add(Restrictions.gt("mobId", 2));
		List<Mobile> listOfAllMobile = crt.list();
		for (Mobile mobile : listOfAllMobile) 
		{
			System.out.println(mobile);

		}
	}
}
