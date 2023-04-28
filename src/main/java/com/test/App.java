package com.test;

import java.util.ResourceBundle;

public class App {
public int userlogin(String in_user,String in_pwd)
{
	ResourceBundle rb=ResourceBundle.getBundle("config");
	String userName=rb.getString("userName");
	String passWord=rb.getString("passWord");
	if(in_user.equals(userName)&&in_pwd.equals(passWord))
	return 1;
	else
		return 0;
	
	}
}

