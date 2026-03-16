package com.prac;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Patient {
	@Id
	private int id;
	private String name;
	private int age;
	private long contact;
	@OneToOne
	private 
	

}
