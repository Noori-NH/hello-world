package com.musichub.service;

import java.util.List;

import com.musichub.model.ForumCmt;
import com.musichub.model.ForumInfo;

public interface CmtForumService {
	public int insertRow(ForumCmt f);  
	  
	 public List<ForumCmt> getList();  
	  
	 public ForumInfo getRowById(int id);
}
