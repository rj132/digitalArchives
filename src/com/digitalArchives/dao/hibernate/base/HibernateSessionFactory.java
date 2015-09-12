package com.digitalArchives.dao.hibernate.base;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateSessionFactory {
	private static SessionFactory sqlSessionFactory;
	synchronized public static SessionFactory getSessionFactory() {
		try{
			if(sqlSessionFactory == null){
				Configuration config = new Configuration().configure();
				sqlSessionFactory = config.buildSessionFactory(); 
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return sqlSessionFactory;
	}

}
