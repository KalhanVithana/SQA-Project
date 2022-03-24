package com.sqa;

public interface UserService {

	int getMarks();

	int getTotalData();

	String UserLogin(String uname, String pass);

	String UserSignUp(String username, String email,String password,String gender,int age,String ID);

}
