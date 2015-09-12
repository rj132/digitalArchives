package com.digitalArchives.dao.hibernate.base;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HibernateSession {
		private static ThreadLocal<Session> tl = new ThreadLocal<Session>();
		private static ThreadLocal<Transaction> trans = new ThreadLocal<Transaction>();
			
		public static Session getSession(){
			Session session = tl.get();
			if(session == null){
				SessionFactory sf = HibernateSessionFactory.getSessionFactory();
				session = sf.openSession();
				tl.set(session);
			}
			return session;
		}
		
		public static void beginTransaction(){
			if(tl.get() != null && trans.get() == null){
				trans.set(tl.get().beginTransaction());
			}
		}
		
		public static void commit(){
			if(tl.get() != null && trans.get() != null){
				trans.get().commit();
				tl.get().close();
				tl.set(null);
				trans.set(null);			
			}
		}
		
		public static void rollback(){
			if(tl.get() != null && trans.get() != null){
				trans.get().rollback();
				tl.get().close();
				tl.set(null);
				trans.set(null);
			}
		}
}
