package com.musichub.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.musichub.model.BlogCmt;
@Repository("commentDao")
public class CommentDaoImpl implements CommentDao{
	@Autowired
	private SessionFactory sessionFactory;
	@Transactional(propagation=Propagation.SUPPORTS)
	public int insertRow(BlogCmt b) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Transactional(propagation=Propagation.SUPPORTS)
	public List<BlogCmt> getList() {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional(propagation=Propagation.SUPPORTS)
	public BlogCmt getRowById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Transactional(propagation=Propagation.SUPPORTS)
	public int updateRow(BlogCmt s) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Transactional(propagation=Propagation.SUPPORTS)
	public int deleteRow(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

}
