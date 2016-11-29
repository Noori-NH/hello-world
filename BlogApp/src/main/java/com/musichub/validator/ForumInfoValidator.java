package com.musichub.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.musichub.model.ForumInfo;

public class ForumInfoValidator implements Validator{

	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return ForumInfo.class.isAssignableFrom(arg0);
	}

	public void validate(Object obj, Errors arg1) {
		// TODO Auto-generated method stub
		ForumInfo f=(ForumInfo)obj;
	}

}
