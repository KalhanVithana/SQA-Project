package com.sqa;

public class UserServiceImpl implements UserService {

	private String uname = "oshan";
	private String pass = "abcd@123";

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
	public String UserLogin(String uname, String pass) {
		if (uname == null || uname.isEmpty())
			return "Username not found";
		if (pass == null || pass.isEmpty())
			return "Password not found";

		if (this.uname.equals(uname) && this.pass.equals(pass)) {
			return "Login Success";
		} else {
			return "Login fail.";
		}

	}

	@Override
	public String UserSignUp() {
		// TODO Auto-generated method stub
		return null;
	}

}
