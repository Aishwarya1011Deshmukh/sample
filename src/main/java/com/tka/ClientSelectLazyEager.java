package com.tka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//connection = session
public class ClientSelectLazyEager {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure(); // reads hibernatte.cfg.xml
		cfg.addAnnotatedClass(Mobile.class);
		cfg.addAnnotatedClass(MobileDetails.class);
		cfg.addAnnotatedClass(AddressShop.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		// which class u want to load
		// 1 is primary key
		Mobile mobile = session.load(Mobile.class,5);
	//	System.out.println(mobile);
		session.close();
		
	}
}
