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
			return (User)query.uniqueResult();
		}catch(Exception ex) {
			throw ex;
		}
	}

	public User getUserByUsernamePassword(User user) {
		try{
			Session session = HibernateSession.getSession();
			HibernateSession.beginTransaction();
			Query query = session.createQuery("from User where username = :username and password = :password");
			query.setString("username", user.getUsername());
			query.setString("password", user.getPassword());
			return (User)query.uniqueResult();
		}catch(Exception ex) {
			throw ex;
		}
	}
}
