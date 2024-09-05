package com.tka;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//connection = session
public class ClientSaveOrUpdate {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure(); // reads hibernatte.cfg.xml
		cfg.addAnnotatedClass(Mobile.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Mobile mobile = new Mobile(3,"samsung11", "400011");
		session.saveOrUpdate(mobile);
		session.beginTransaction().commit();
		session.close();
	}
}
