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

	public String Login(String uname, String password) {
		return Userservice.UserLogin(uname, password);

	}

	public String SignUp(String username, String email,String password,String gender,int age,String ID) {
		return Userservice.UserSignUp(username,email, password,gender,age,ID);

	}

}
