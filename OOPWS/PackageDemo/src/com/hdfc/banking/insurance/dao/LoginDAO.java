package com.hdfc.banking.insurance.dao;

import com.hdfc.banking.insurance.dto.LoginDTO;

public class LoginDAO {
	
	public boolean isUserExist(LoginDTO loginDTO){
		System.out.println("DB Call and Check in DB  UserExist or Not");
		System.out.println("select * from user "
				+ "where userid=? and password=? and Pincode =?");
		if(loginDTO.getUserid().
				equals(loginDTO.getPassword())){
			return true;
		}
		else{
			return false;	
		}
		
	}

}
