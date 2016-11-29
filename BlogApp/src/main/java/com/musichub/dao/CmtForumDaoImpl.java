package com.musichub.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.musichub.model.ForumCmt;
import com.musichub.model.ForumInfo;
@Repository("cmtForumDao")
public class CmtForumDaoImpl implements CmtForumDao{
	@Autowired
	private SessionFactory sessionFactory;
	@Transactional(propagation=Propagation.SUPPORTS)
	public int insertRow(ForumCmt fc) {
		Session ses = sessionFactory.openSession();  
		  Transaction tx = ses.beginTransaction();
		 /*ForumInfo f=new ForumInfo();
		 fc=new ForumCmt();
		 fc.setCforumId(f.getForumId());
		 fc.setCusername(f.getFusername());
		 fc.setCtitle(f.getFtitle());
		 fc.setCcontent(f.getFcontent());
		 fc.setCcategory(f.getCategory());
		 fc.setCcreate_date(f.getFcreate_date());
		 fc.setRating(f.getFrate());*/
		  ses.saveOrUpdate(fc); 
		  ses.flush();
		  
		  tx.commit();  
		  Serializable id = ses.getIdentifier(fc);  
		  ses.close();  
		  return (Integer) id; 
	}
	@Transactional(propagation=Propagation.SUPPORTS)
	public List<ForumCmt> getList() {
		Session session = sessionFactory.openSession();  
		  @SuppressWarnings("unchecked")  
		  List<ForumCmt> fList = session.createQuery("from ForumCmt").list();    
		   session.close();  
		  return fList; 
	}
	@Transactional(propagation=Propagation.SUPPORTS)
	public ForumInfo getRowById(int id) {
		Session session = sessionFactory.openSession();  
		ForumInfo s = (ForumInfo) session.load(ForumInfo.class, id);  
		  return s;  
	}
	public List<ForumCmt> getpostTopic(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
