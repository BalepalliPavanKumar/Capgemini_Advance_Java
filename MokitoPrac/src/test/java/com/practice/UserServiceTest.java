package com.practice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class UserServiceTest {
//	@Test
	public void testGetTypeOfCustomer() {
		UserDao userdao=new UserDao();
		UserService userservice=new UserService(userdao);
		String actualres=userservice.typeOfUser(1);
		assertEquals("premium user", actualres);
		
	}
	
//	@Test
	public void testDoubleAddition() {
		//step1: create fake object
		Calculator calmock=mock(Calculator.class);
		//step2: what mock object should return 
		when(calmock.add(10,20)).thenReturn(60);
		//step3: give the fake object reference --> inject the mock reference
		MathService service=new MathService(calmock);
		int res=service.doubleAddition(10, 20);
		assertEquals(60, res);
		
	}

}
