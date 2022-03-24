package com.sqa;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;

public class UserTest {

	private User user = new User();

	@BeforeEach
	void method() {
		System.out.println("Login Run");
	}

	@Test
	void LoginTest() {

		String name = "oshan";
		String password = "123456456";
		assertEquals("Login Success", user.Login("oshan", "123456"));

	}

	@Test
	void LoginInputTest() {

		String name = "123456";
		String password = "123456456";

		assertEquals("Password not found", user.Login("oshan", ""));
		assertEquals("Username not found", user.Login("", "123456"));

	}

	@Test
	void SignUpTest() {

		String name = "oshan";
		String password = "123456";
		String email = "abcd@gmail.com";
		String gender = "male";
		String ID = "123456V";
		int age = 22;

		assertEquals("SignUp Success", user.SignUp(name, email, password, gender, age, ID));

	}

	@Test
	void ValidateUserName() {

		String name = "o";
		String password = "123456";
		String email = "abcd@gmail.com";
		String gender = "male";
		String ID = "123456V";
		int age = 22;

		assertEquals("Invalid Username", user.SignUp(name, email, password, gender, age, ID));

	}

	@Test
	void ValidatePasswordLength() {

		String name = "oshan";
		String password = "1";
		String email = "abcd@gmail.com";
		String gender = "male";
		String ID = "123456V";
		int age = 22;

		assertEquals("Invalid Password", user.SignUp(name, email, password, gender, age, ID));

	}

	@Test
	void ValidateEmail() {

		String name = "oshan";
		String password = "123456";
		String email = "abcdgmail.com";
		String gender = "male";
		String ID = "123456V";
		int age = 22;
		assertEquals("Invalid Email", user.SignUp(name, email, password, gender, age, ID));

	}

	@Test
	void ValidatePassword() {

		String name = "oshan";
		String password = "123456%";
		String email = "abcd@gmail.com";
		String gender = "male";
		String ID = "123456V";
		int age = 22;
		assertEquals("Invalid Password", user.SignUp(name, email, password, gender, age, ID));

	}

	@Test
	void ValidateGender() {

		String name = "oshan";
		String password = "123456";
		String email = "abcd@gmail.com";
		String gender = "7";
		String ID = "123456V";
		int age = 22;
		assertEquals("Invalid Gender", user.SignUp(name, email, password, gender, age, ID));

	}

	@Test
	void ValidateAge() {

		String name = "oshan";
		String password = "123456";
		String email = "abcd@gmail.com";
		String gender = "male";
		String ID = "123456V";
		int age = 10;
		assertEquals("Invalid Age", user.SignUp(name, email, password, gender, age, ID));

	}

	@Test
	void ValidateID() {

		String name = "oshan";
		String password = "123456";
		String email = "abcd@gmail.com";
		String gender = "male";
		String ID = "45&";
		int age = 25;
		assertEquals("Invalid ID", user.SignUp(name, email, password, gender, age, ID));

	}

}
