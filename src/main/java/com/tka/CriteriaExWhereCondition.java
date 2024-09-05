package com.tka;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class CriteriaExWhereCondition {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure(); // reads hibernatte.cfg.xml
		cfg.addAnnotatedClass(Mobile.class);
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		/*
		 * List cats = session.createCriteria(Cat.class) .add( Restrictions.like("name",
		 * "Iz%") ) .add( Restrictions.gt( "weight", new Float(minWeight) ) ) .addOrder(
		 * Order.asc("age") ) .list();
		 */

		// select * from Mobile;
		Criteria criteria = session.createCriteria(Mobile.class);
		// where mobCost is equal to 4000
		criteria.addOrder(Order.asc("mobBrandName"));
		criteria.add(Restrictions.eq("mobBrandName", "samsung11"));

		criteria.add(Restrictions.gt("mobCost", "4000"));
		
		List<Mobile> listOfMobile = criteria.list();
		for (Mobile mobile : listOfMobile) {
			System.out.println(mobile);
		}

	}
}
