package com.tka;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//connection = session
public class ClientInsert {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure(); // reads hibernatte.cfg.xml
		cfg.addAnnotatedClass(Mobile.class);
		cfg.addAnnotatedClass(MobileDetails.class);
		cfg.addAnnotatedClass(AddressShop.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Mobile mobile = new Mobile("samsung2", "400002");
		session.save(mobile);
		session.beginTransaction().commit();
	}
}
