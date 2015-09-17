package com.digitalArchives.dao.hibernate;

import org.hibernate.Query;
import org.hibernate.Session;

import com.digitalArchives.dao.hibernate.base.HibernateSession;
import com.digitalArchives.modal.User;

public class UserDao {
	public User getUserById(Integer id) {
		try{
			Session session = HibernateSession.getSession();
			HibernateSession.beginTransaction();
			return (User)session.get(User.class, id);
		}catch(Exception ex) {
			throw ex;
		}
	}
	
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
	
	public User getUserByUsername(User user) {
		try{
			Session session = HibernateSession.getSession();
			HibernateSession.beginTransaction();
			Query query = session.createQuery("from User where username = :username");
			query.setString("username", user.getUsername());
			return (User)query.uniqueResult();
		}catch(Exception ex) {
			throw ex;
		}
	}
	
	public User getUserByPhone(User user) {
		try{
			Session session = HibernateSession.getSession();
			HibernateSession.beginTransaction();
			Query query = session.createQuery("from User where phone = :phone");
			query.setString("phone", user.getPhone());
			return (User)query.uniqueResult();
		}catch(Exception ex) {
			throw ex;
		}
	}
	
	public User getUserById_card_typeId_card_code(User user) {
		try{
			Session session = HibernateSession.getSession();
			HibernateSession.beginTransaction();
			Query query = session.createQuery("from User where id_card_type = :id_card_type and id_card_code = :id_card_code");
			query.setString("id_card_type", user.getId_card_type());
			query.setString("id_card_code", user.getId_card_code());
			return (User)query.uniqueResult();
		}catch(Exception ex) {
			throw ex;
		}
	}
	
	public User getUserByEmail(User user) {
		try{
			Session session = HibernateSession.getSession();
			HibernateSession.beginTransaction();
			Query query = session.createQuery("from User where email = :email");
			query.setString("email", user.getEmail());
			return (User)query.uniqueResult();
		}catch(Exception ex) {
			throw ex;
		}
	}
	
	public User getUserByName(User user) {
		try{
			Session session = HibernateSession.getSession();
			HibernateSession.beginTransaction();
			Query query = session.createQuery("from User where name = :name");
			query.setString("name", user.getName());
			return (User)query.uniqueResult();
		}catch(Exception ex) {
			throw ex;
		}
	}
	
	public void updateUser(User user) {
		try{
			Session session = HibernateSession.getSession();
			HibernateSession.beginTransaction();
			session.update(user);
		}catch(Exception ex) {
			throw ex;
		}
	}
	
	public void deleteUser(User user) {
		try{
			Session session = HibernateSession.getSession();
			HibernateSession.beginTransaction();
			session.delete(user);
		}catch(Exception ex) {
			throw ex;
		}
	}
	
	public void insertUser(User user) {
		try{
			Session session = HibernateSession.getSession();
			HibernateSession.beginTransaction();
			session.save(user);
		}catch(Exception ex) {
			throw ex;
		}
	}
}
