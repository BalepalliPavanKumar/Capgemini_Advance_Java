package com.capgemini.springmvcboot;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Users {
	private String name;
	@Id
	private String email;
	private String password;
	private String gender;
	private String Country;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	

}
