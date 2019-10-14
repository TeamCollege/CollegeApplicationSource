package com.virtusa.dao;

import java.sql.SQLException;
import java.util.List;

import com.virtusa.entities.Alumni;


public interface AlumniDAO {  

	public List<Alumni> getAlumni() throws ClassNotFoundException, SQLException;
	public boolean registerAlumni(Alumni alumni) throws ClassNotFoundException, SQLException;
	
}
