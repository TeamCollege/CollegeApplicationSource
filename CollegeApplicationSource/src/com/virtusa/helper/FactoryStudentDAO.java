package com.virtusa.helper;


import com.virtusa.dao.StudentDAO;
import com.virtusa.dao.StudentDAOImpl;

import com.virtusa.service.StudentService;
import com.virtusa.service.StudentServiceImpl;

public class FactoryStudentDAO {

	public static StudentDAO createStudentDAO() {
		StudentDAO studentDAO=new StudentDAOImpl();
		return studentDAO;
	}

	public static StudentService createStudentService() {
		// TODO Auto-generated method stub
		StudentService studentService=new StudentServiceImpl();
		return studentService;
		
	}

	      

}
