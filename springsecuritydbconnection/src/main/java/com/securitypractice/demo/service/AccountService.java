package com.securitypractice.demo.service;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.securitypractice.Entity.Account;
import com.securitypractice.demo.repo.AccountJpa;
import com.securitypractice.dto.AccountRequestDTO;

@Service
public class AccountService {
	private AccountJpa jpa;
	private PasswordEncoder encode;
	public AccountService(AccountJpa jpa, PasswordEncoder encode) {
		this.jpa = jpa;
		this.encode = encode;
	}
	public void createAccount(AccountRequestDTO dto) {
		if(jpa.existByUsername(dto.getUsername())) {
			throw new RuntimeException("user name exist");
		}if(jpa.existByUsername(dto.getMail())) {
			throw new RuntimeException("user Email Exist");
		}
		Account account =new Account();
		account.setUsername(dto.getUsername());
		account.setFullname(dto.getFullname());
		account.setPassword(dto.getPassword());
		
		
	}
	
}
