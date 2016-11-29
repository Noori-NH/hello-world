package com.musichub.dao;

import java.util.List;


import com.musichub.model.Student;

public interface StudentDao {
	public int insertRow(Student s);  
	  
	 public List<Student> getList();  
	  
	 public Student getRowById(int id); 
	 
	 public int updateRow(Student s);  
	  
	 public int deleteRow(int id); 
}
