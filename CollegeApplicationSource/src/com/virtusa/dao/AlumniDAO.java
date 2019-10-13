package com.virtusa.dao;

import java.util.List;

import com.virtusa.entities.Alumni;

public interface AlumniDAO {  

	public boolean persistStudent(Alumni alumni);
	public List<Alumni> viewAlumni();


}
