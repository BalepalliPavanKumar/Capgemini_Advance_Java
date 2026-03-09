package com.example.springboot_task;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Customer {
	@Id
	private int id;
	private long phone;
	private String email;
	private String name;
	private String gender;
	private String dod;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getPhone() {
		return phone;
	}
	public void setPhone(long phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDod() {
		return dod;
	}
	public void setDod(String dod) {
		this.dod = dod;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", phone=" + phone + ", email=" + email + ", name=" + name + ", gender=" + gender
				+ ", dod=" + dod + "]";
	}
	
	

}
