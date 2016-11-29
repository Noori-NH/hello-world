package com.musichub.dao;

import java.util.List;


import com.musichub.model.StudentInfo;

public interface StudentInfoDao {
	public int insertRow(StudentInfo s);  
	  
	 public List<StudentInfo> getList();  
	  
	 public StudentInfo getRowById(int id); 
	 
	 public int updateRow(StudentInfo s);  
	  
	 public int deleteRow(int id); 
	 
	 public List<StudentInfo> getStudentRecord(String s);
}
