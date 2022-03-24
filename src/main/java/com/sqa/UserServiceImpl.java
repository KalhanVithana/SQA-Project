package com.sqa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserServiceImpl implements UserService {

	private String username = "oshan";
	private String password = "123456";
	private String email = "abcd@123";
	private String gender;
	private boolean EmailValidation,genderValidate,passwordValidation,Idvalidation;
	
	
	
    
	@Override
	public int getMarks() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getTotalData() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String UserLogin(String username, String password) {
		if (username == null || username.isEmpty())
			return "Username not found";
		if (password == null || password.isEmpty())
			return "Password not found";

		if (this.username.equals(username) && this.password.equals(password)) {
			return "Login Success";
		} else {
			return "Login fail.";
		}

	}

	@Override
	public String UserSignUp(String username, String email, String password, String gender, int age, String ID) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(email);
		EmailValidation = matcher.find();

		passwordValidation = password.contains("%");
		genderValidate = gender.contains("male") || gender.contains("female");
		Idvalidation = ID.contains("&");
		
		System.out.println(Idvalidation);

		if (username == null || username.isEmpty())
			return "Username not found";
		if (!(username.length() > 2))
			return "Invalid Username";
		if (email == null || email.isEmpty())
			return "Username not found";

		if (!(password.length() > 5))
			return "Invalid Password";
		if (password == null || password.isEmpty())
			return "Password not found";

		if (email == null || email.isEmpty())
			return "Email not found";

		if (!EmailValidation) {
			return "Invalid Email";
		}
		if (passwordValidation) {
			return "Invalid Password";
		}

		if (!genderValidate) {
			return "Invalid Gender";
		}

		if (!(age > 20)) {
			return "Invalid Age";
		}
		
		if (Idvalidation) {
			return "Invalid ID";
		}

		return "SignUp Success";
	}

	

}
