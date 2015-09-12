package com.digitalArchives.dao.hibernate;

import org.hibernate.Query;
import org.hibernate.Session;

import com.digitalArchives.dao.hibernate.base.HibernateSession;
import com.digitalArchives.modal.User;

public class UserDao {
	public User validateUser(User user) throws Exception {
		try{
			Session session = HibernateSession.getSession();
			HibernateSession.beginTransaction();
			Query query = session.createQuery("from User");
			return (User)query.list();
		}catch(Exception ex) {
			throw ex;
		}
	}
}
