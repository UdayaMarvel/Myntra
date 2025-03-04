package com.myntra.men_stepdefinition;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Data {

	private String username;
	private String password;
	private String mail;
	private String id;
	
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public void setId(String id) {
		this.id = id;
	}
	@XmlElement
	public String getUsername() {
		return username;
	}
	@XmlElement
	public String getPassword() {
		return password;
	}
	@XmlElement
	public String getMail() {
		return mail;
	}
	@XmlElement
	public String getId() {
		return id;
	}
}
