package com.musichub.dao;

import java.util.List;

import com.musichub.model.ForumCmt;
import com.musichub.model.ForumInfo;

public interface CmtForumDao {
	public int insertRow(ForumCmt f);  
	  
	 public List<ForumCmt> getList();  
	  
	 public ForumInfo getRowById(int id);
	 
	 public List<ForumCmt> getpostTopic(int id);  
}
