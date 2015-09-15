package com.digitalArchives.action;

import com.digitalArchives.dao.hibernate.UserDao;
import com.digitalArchives.modal.User;
import com.opensymphony.xwork2.Action;

public class LoginAction implements Action {
	private String username;
	private String password;

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

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String validateUser() throws Exception {
		User user = new User();
		user.setUsername(username);
		int i = 0;
		i++;
		return "validated";
	}
	
	public String HelloServletUrl() throws Exception {
		return "HelloServletUrl";
	}

}
