package com.tka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//connection = session
public class ClientSelect {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure(); // reads hibernatte.cfg.xml
		cfg.addAnnotatedClass(Mobile.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		// which class u want to load
		// 1 is primary key
		Mobile mobile = session.get(Mobile.class,67);
		System.out.println(mobile);
		session.close();
		
	}
}
