package com.virtusa.dao;

import java.sql.SQLException;

public interface LoginDAO {

	String userAuth(String userId, String password)throws ClassNotFoundException,SQLException;

}
