package com.tka;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class CriteriaExProjection {
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
		Projection projection1 = Projections.property("mobBrandName");
		Projection projection2 = Projections.property("mobCost");
		
		ProjectionList projectionList=Projections.projectionList();
		
		projectionList.add(projection1);
		projectionList.add(projection2);
		
		criteria.setProjection(projectionList);
		
		criteria.add(Restrictions.eq("mobBrandName", "samsung11"));

		List<Mobile> listOfMobile = criteria.list();
		for (Mobile mobile : listOfMobile) {
			System.out.println(mobile);
		}

	}
}
