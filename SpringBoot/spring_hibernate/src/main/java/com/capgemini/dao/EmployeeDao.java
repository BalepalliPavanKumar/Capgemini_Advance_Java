package com.capgemini.dao;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.capgemini.dto.Employee;

@Repository
public class EmployeeDao {
	@Autowired
	EntityManager entityManager;
	public void insert(Employee e) {
		entityManager.getTransaction().begin();
		Employee 
	}

}
