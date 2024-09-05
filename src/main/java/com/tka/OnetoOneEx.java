package com.tka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class OnetoOneEx {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure(); // reads hibernatte.cfg.xml
		cfg.addAnnotatedClass(Mobile.class);
		cfg.addAnnotatedClass(MobileDetails.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		MobileDetails details = new MobileDetails("TKA");
		Mobile mobile = new Mobile("samsung2", "400002", details);
		session.save(mobile);
		session.beginTransaction().commit();
	}
}
