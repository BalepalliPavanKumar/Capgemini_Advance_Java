package com.capgemini.springbootbasic;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonJpaRepository extends JpaRepository<Person, Integer>{
	public Person getByName(String name);
}