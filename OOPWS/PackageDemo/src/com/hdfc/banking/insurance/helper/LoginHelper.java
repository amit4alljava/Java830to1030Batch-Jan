package com.hdfc.banking.insurance.helper;

import com.hdfc.banking.insurance.dao.LoginDAO;
import com.hdfc.banking.insurance.dto.LoginDTO;

public class LoginHelper {
	public String userExist(LoginDTO loginDTO){
		LoginDAO loginDAO = new LoginDAO();
		if(loginDAO.isUserExist(loginDTO)){
			return "Welcome User ";
		}
		else
		{
			return "Invalid User ";
		}
		
	}

}
