package com.tka;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class TipsHibernate {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernateMysql.cfg.xml"); // reads hibernate.cfg.xml
		
		
		Configuration cfgOra = new Configuration();
		cfgOra.configure("hibernateOracle.cfg.xml"); // reads hibernate.cfg.xml
	
		
		
		cfg.addAnnotatedClass(Mobile.class);
		cfg.addAnnotatedClass(MobileDetails.class);
		cfg.addAnnotatedClass(AddressShop.class);
		
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
	
		
		SessionFactory factoryOra = cfgOra.buildSessionFactory();
		Session sessionOra = factoryOra.openSession();

		
		
		
		AddressShop addressShop1 = new AddressShop("pune");
		AddressShop addressShop2 = new AddressShop("mumbai");

		ArrayList<AddressShop> listShop = new ArrayList<AddressShop>();
		listShop.add(addressShop1);
		listShop.add(addressShop2);
		Mobile mobile = new Mobile("samsung2", "400002", listShop);

		session.save(mobile);
		session.beginTransaction().commit();
	}
}
