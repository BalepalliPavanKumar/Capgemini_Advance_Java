package com.securitypractice.demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.securitypractice.Entity.Account;

public interface AccountJpa  extends JpaRepository<Account, Long>{
	public Optional<Account> findByUsername(String name);
	public boolean existByUsername(String name);
	public boolean existsByEmail(String email);

}
