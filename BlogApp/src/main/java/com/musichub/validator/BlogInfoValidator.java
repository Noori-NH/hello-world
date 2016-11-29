package com.musichub.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.musichub.model.BlogInfo;

public class BlogInfoValidator implements Validator{

	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return BlogInfo.class.isAssignableFrom(arg0);
	}

	public void validate(Object obj, Errors arg1) {
		// TODO Auto-generated method stub
		BlogInfo b=(BlogInfo)obj;
	}

}
