package com.tka;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CriteriaExAllRows {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure(); // reads hibernatte.cfg.xml
		cfg.addAnnotatedClass(Mobile.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		/*List cats = session.createCriteria(Cat.class)
			     .add( Restrictions.like("name", "Iz%") )
			     .add( Restrictions.gt( "weight", new Float(minWeight) ) )
			     .addOrder( Order.asc("age") )
			     .list();*/

		
		//select * from Mobile;
		Criteria  criteria=session.createCriteria(Mobile.class);
		List<Mobile> listOfMobile	=criteria.list();
		for (Mobile mobile : listOfMobile) {
			System.out.println(mobile);
		}
		
		
	}
}











