package com.capgemini.springmvcboot;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, String>{
	
	public Users findByEmailAndPassword(String email,String password);

}
