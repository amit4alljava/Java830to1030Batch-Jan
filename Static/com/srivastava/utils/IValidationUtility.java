package com.srivastava.utils;

public interface IValidationUtility {
	static boolean isBlank(String value){
		if(value!=null && value.length()>0){
			return false;
		}
		return true;
	}
}
