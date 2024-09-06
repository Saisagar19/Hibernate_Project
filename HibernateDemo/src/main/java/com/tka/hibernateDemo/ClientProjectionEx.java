package com.tka.hibernateDemo;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class ClientProjectionEx {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Mobile.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		//for single column 
		Criteria criteria = session.createCriteria(Mobile.class);
		Projection projection=Projections.property("MobBrandName");
		criteria.setProjection(projection);
		criteria.add(Restrictions.gt("mobCost","25000" ));
		
		List<String> listOfMob = criteria.list();
        for (String mobile : listOfMob) {
            System.out.println(mobile);
        }
	}

}
