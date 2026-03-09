package com.securitypractice.dto;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class AccountRequestDTO {
	
	private String username;
	private String mail;
	private String phone;
	private String fullname;
	private String role;
	private String password;
	LocalDateTime createdAt=LocalDateTime.now();
	

}
