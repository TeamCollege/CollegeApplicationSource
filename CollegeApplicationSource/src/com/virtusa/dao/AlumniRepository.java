package com.virtusa.dao;

import java.util.ArrayList;
import java.util.List;

import com.virtusa.entities.Alumni;  

public class AlumniRepository {
	
private static List<Alumni> alumni1=new ArrayList<Alumni>();
	
	public static boolean add(Alumni alumni){
		return alumni1.add(alumni);
	}
	   
	public static List<Alumni> get(){
		return alumni1;
	}


}
