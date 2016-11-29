package com.musichub.service;

import java.util.List;

import com.musichub.model.StudAddress;
import com.musichub.model.Student;

public interface StudentService {
	public int insertRow(Student s);  
	  
	 public List<Student> getList();  
	  
	 public Student getRowById(int id);  
	
     public int updateRow(Student s);  
	  
	 public int deleteRow(int id); 
}
