package com.virtusa.service;

import java.sql.SQLException;

import com.virtusa.model.LoginModel;



public interface LoginService {

	//String userAuthenticationService(LoginModel loginModel);

	
	public String userAuthenticationService(LoginModel loginModel)throws ClassNotFoundException,SQLException;
}
      