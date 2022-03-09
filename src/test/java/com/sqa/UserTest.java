package com.sqa;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;

public class UserTest {

	
	 
	UserService UserService = Mockito.mock(UserService.class);
	//User user = new User(UserService);
	 
	private User user = new User();
//	@Test
//	void Getavg() {
//
//		Mockito.when(UserService.getTotalData()).thenReturn(500);
//		Mockito.when(UserService.getMarks()).thenReturn(10);
//		Assertions.assertEquals(50, user.getAvgData());
//	}

	/*
	 * @Test void LoginTest() {
	 * 
	 * String usernmae = "abc"; String pass = "123";
	 * 
	 * Mockito.when(UserService.UserLogin()).thenReturn("abc","123");
	 * 
	 * Assertions.assertEquals(usernmae,pass, user.Login());
	 * 
	 * }
	 */
	 
	 @BeforeEach
	 void method() {
		 System.out.println("Login Run");
	 }

	@Test
	void LoginTest() {
		
		String name = "123";
		String password = "555";
		
		assertEquals("Login Success", user.Login("oshan", "abcd@123"));
        //assertEquals("Login Success", user.Login("", "abcd@123"));
		

    	//Mockito.when(user.Login("", "")).thenReturn("oshan","123");

//	Assertions.assertEquals("Login Success",user.Login("kalhan", "abc@123"));

	}

}
