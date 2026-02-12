package com.prac;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	public void addTest() {
		int res=Calculator.add(10, 20);
	}
//	@Test
	public void reverseTest() {
		String actualres=Calculator.reverseString("data");
		
		
		assertEquals("atad",actualres);
		
	}
//	@Test
	public void reverseTestNull() {
		String actualRes=Calculator.reverseString(null);
		
		assertEquals("llun",actualRes);
	}
//	@Test
	public void factTest() {
		int output=Calculator.fact(5);
		assertEquals(120,output);
	}
	@Test
	public void AgeTest() {
		Employee e =new Employee(10,"allen",17,"CSE");
		
		assertFalse(e.isAge());
		
	}

}
