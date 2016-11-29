package com.musichub.dao;

import java.util.List;

import com.musichub.model.BlogCmt;



public interface CommentDao {
	public int insertRow(BlogCmt b);  
	  
	 public List<BlogCmt> getList();  
	  
	 public BlogCmt getRowById(int id); 
	 
	 public int updateRow(BlogCmt s);  
	  
	 public int deleteRow(int id);
}
