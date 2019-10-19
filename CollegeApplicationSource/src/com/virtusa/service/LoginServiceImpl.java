package com.virtusa.service;

import java.sql.SQLException;

import com.virtusa.dao.LoginDAO;
import com.virtusa.helper.FactoryLoginDB;
import com.virtusa.model.LoginModel;


public class LoginServiceImpl implements LoginService {
	private LoginDAO loginDAO=null;

	public LoginServiceImpl() {
		this.loginDAO=FactoryLoginDB.createLoginDAO();
	}
	
	@Override
	public String userAuthenticationService(LoginModel loginModel) throws ClassNotFoundException, SQLException {
		
		// TODO Auto-generated method stub
		String userValid=loginDAO.userAuth(loginModel.getUserId(),loginModel.getPassword());
		//System.out.println(userValid);
		
		return userValid;   
		
		
	}


}
