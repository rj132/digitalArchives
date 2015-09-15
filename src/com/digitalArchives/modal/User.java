package com.digitalArchives.modal;

import java.sql.Timestamp;

public class User {
	private Integer id;
	private String name;
	private String username;
	private String password;
	private String phone;
	private Integer age;
	private String sex;
	private String id_card_type;
	private String id_card_code;
	private String email;
	private Integer money;
	private Timestamp create_time;
	private Timestamp login_time;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getId_card_type() {
		return id_card_type;
	}
	public void setId_card_type(String id_card_type) {
		this.id_card_type = id_card_type;
	}
	public String getId_card_code() {
		return id_card_code;
	}
	public void setId_card_code(String id_card_code) {
		this.id_card_code = id_card_code;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getMoney() {
		return money;
	}
	public void setMoney(Integer money) {
		this.money = money;
	}
	public Timestamp getCreate_time() {
		return create_time;
	}
	public void setCreate_time(Timestamp create_time) {
		this.create_time = create_time;
	}
	public Timestamp getLogin_time() {
		return login_time;
	}
	public void setLogin_time(Timestamp login_time) {
		this.login_time = login_time;
	}
	
}
