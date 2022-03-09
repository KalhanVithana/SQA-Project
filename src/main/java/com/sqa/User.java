package com.sqa;

public class User {

	UserService Userservice = new com.sqa.UserServiceImpl();
	//UserService Userservice;
	

	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(UserService Userservice) {
		// TODO Auto-generated constructor stub
		this.Userservice = Userservice;
	}



	public int getAvgData() {

		return Userservice.getMarks() / Userservice.getTotalData();
	}

	public String Login(String uname, String pass) {
		return Userservice.UserLogin(uname, pass);

	}

	public String SignUp() {
		return Userservice.UserSignUp();

	}

}
