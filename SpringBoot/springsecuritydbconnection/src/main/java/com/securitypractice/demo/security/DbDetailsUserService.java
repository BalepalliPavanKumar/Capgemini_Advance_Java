package com.securitypractice.demo.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.securitypractice.Entity.Account;
import com.securitypractice.demo.repo.AccountJpa;

public class DbDetailsUserService implements UserDetailsService {
	
	private AccountJpa jpa;
	
	
	public DbDetailsUserService(AccountJpa jpa) {
		this.jpa = jpa;
	}


	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Account account=jpa.findByUsername(username)
				.orElseThrow(()->new RuntimeException("username not found"));
		
		List<SimpleGrantedAuthority> authorites=new ArrayList();
		authorites.add(new SimpleGrantedAuthority(account.getRole()));
		return new User(account.getUsername(),account.getPassword(),null);
	}
}
