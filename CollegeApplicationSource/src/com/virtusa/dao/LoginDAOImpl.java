package com.virtusa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.virtusa.integrate.ConnectionManager;



public class LoginDAOImpl implements LoginDAO {

	@Override
	public String userAuth(String userId, String password) throws ClassNotFoundException,SQLException {
		// TODO Auto-generated method stub
		    
		
		String role="";
		Connection connection=ConnectionManager.openConnection();
		
		String query2="select role from user_credentials where username=? and user_password=?";
		PreparedStatement preparedStatement2=connection.prepareStatement(query2);
		preparedStatement2.setString(1, userId);
		preparedStatement2.setString(2, password);
		//System.out.println("In DAO");
		ResultSet rs2 = preparedStatement2.executeQuery();
		while(rs2.next()) 
		role=rs2.getString("role");
		
		return role;
		
	}

}
