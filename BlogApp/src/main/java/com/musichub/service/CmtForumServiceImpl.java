package com.musichub.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.musichub.dao.CmtForumDao;
import com.musichub.model.ForumCmt;
import com.musichub.model.ForumInfo;
@Service("cmtForumService")
public class CmtForumServiceImpl implements CmtForumService{
	@Autowired
CmtForumDao cmtForumDao;
	@Transactional(propagation=Propagation.SUPPORTS)
	public int insertRow(ForumCmt f) {
		// TODO Auto-generated method stub
		return cmtForumDao.insertRow(f);
	}
	@Transactional(propagation=Propagation.SUPPORTS)
	public List<ForumCmt> getList() {
		// TODO Auto-generated method stub
		return cmtForumDao.getList();
	}
	@Transactional(propagation=Propagation.SUPPORTS)
	public ForumInfo getRowById(int id) {
		// TODO Auto-generated method stub
		return cmtForumDao.getRowById(id);
	}

}
