package com.virtusa.helper;

import com.virtusa.dao.AlumniDAO;
import com.virtusa.dao.AlumniDAOImpl;

public class FactoryAlumniDAO {
	
public static AlumniDAO createAlumniDAO(){
		
		AlumniDAO alumniDAO = new AlumniDAOImpl();
		return alumniDAO;
		
	}
  

}
     
