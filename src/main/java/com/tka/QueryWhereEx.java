package com.tka;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

public class QueryWhereEx {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure(); // reads hibernatte.cfg.xml
		cfg.addAnnotatedClass(Mobile.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		// select * from Mobile;
		Query query = session.createQuery("from Mobile where mobBrandName='samsung11'");
		// where mobCost is equal to 4000

		List<Mobile> listOfMobile = query.list();
		for (Mobile mobile : listOfMobile) {
			System.out.println(mobile);
		}

	}
}
