package com.example.springboot_task;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jakarta.transaction.Transactional;

public interface Customerjpa extends JpaRepository<Customer ,Integer> {
	@Modifying
	@Transactional
	@Query("delete from Customer c where c.name=:cusname")
	public void deleteByName(@Param("cusname")String name);

}
