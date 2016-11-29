package com.musichub.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.ValueGenerationType;

@Entity
public class BlogCmt {
	@Id
	@GeneratedValue
   private int cmtId;
   private int bId;
   private String username;
   private String tagname;
   private String comments;
   private int rate;
   public int getRate() {
	return rate;
}
public void setRate(int rate) {
	this.rate = rate;
}
private String website;
public int getCmtId() {
	return cmtId;
}
public void setCmtId(int cmtId) {
	this.cmtId = cmtId;
}
public int getbId() {
	return bId;
}
public void setbId(int bId) {
	this.bId = bId;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getTagname() {
	return tagname;
}
public void setTagname(String tagname) {
	this.tagname = tagname;
}
public String getComments() {
	return comments;
}
public void setComments(String comments) {
	this.comments = comments;
}
public String getWebsite() {
	return website;
}
public void setWebsite(String website) {
	this.website = website;
}
   
}
