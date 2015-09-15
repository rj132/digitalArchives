package com.digitalArchives.action;

import com.digitalArchives.dao.hibernate.UserDao;
import com.digitalArchives.dao.hibernate.base.HibernateSession;
import com.digitalArchives.modal.User;
import com.opensymphony.xwork2.Action;

public class LoginAction implements Action {
	private String username;
	private String password;
	
	private String message;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String validateUser() throws Exception {
		User user = new User();
		UserDao userDao = new UserDao();
		user.setUsername(username);
		user.setPassword(password);
		try{
			user = userDao.getUserByUsernamePassword(user);
			HibernateSession.commit();
			if(user!=null) {
				message = "validated";
				return "validated";
			} else {
				message = "validate_fail";
				return "validate_fail";
			}
		}catch(Exception ex) {
			exceptionHandle(ex,"error");
			return "error";
		}
	}
	
	public String HelloServletUrl() throws Exception {
		return "HelloServletUrl";
	}
	
	private void exceptionHandle(Exception ex,String failMessage){
		HibernateSession.rollback();
		message = failMessage;
		ex.printStackTrace();
	}

}
