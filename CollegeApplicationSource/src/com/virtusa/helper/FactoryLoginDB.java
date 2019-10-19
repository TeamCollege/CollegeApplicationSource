package com.virtusa.helper;

import com.virtusa.dao.LoginDAO;
import com.virtusa.dao.LoginDAOImpl;
import com.virtusa.service.LoginService;
import com.virtusa.service.LoginServiceImpl;

public class FactoryLoginDB {

	public static LoginDAO createLoginDAO(){
	
		LoginDAO loginDAO=new LoginDAOImpl();
		
		return loginDAO;
		
	}
	
	public static LoginService createLoginService(){
	   
		LoginService loginService=new LoginServiceImpl();
		
		return loginService;
	}
	

}
