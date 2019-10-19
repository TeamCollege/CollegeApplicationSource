package com.virtusa.helper;

import com.virtusa.dao.FacultyDAO;
import com.virtusa.dao.FacultyDAOImpl;

public class FactoryFacultyDAO {

	public static FacultyDAO createFacultyDAO() {
		FacultyDAO facultyDAO = new FacultyDAOImpl();
		return facultyDAO;
	}

} 
  