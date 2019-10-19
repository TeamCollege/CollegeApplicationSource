package com.virtusa.helper;

import com.virtusa.dao.AdminDAO;
import com.virtusa.dao.AdminDAOImpl;

public class FactoryAdminDAO
{
	public static AdminDAO createAdminDAO()
	{
		AdminDAO adminDAO = new AdminDAOImpl();
		return adminDAO;
	}
     
}
