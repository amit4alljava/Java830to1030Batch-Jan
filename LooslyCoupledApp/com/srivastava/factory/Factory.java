package com.srivastava.factory;

import java.util.ResourceBundle;

import com.srivastava.server.Account;
import com.srivastava.server.CurrentAccount;
import com.srivastava.server.SavingAccount;

public class Factory {
	public static Account getObject(){
		// this line is reading the .properties file
		ResourceBundle rb = ResourceBundle.getBundle("object");
		String className = rb.getString("classname"); // it read the key and give the value
		Account account=null;
		try {
			account = (Account)Class.forName(className).newInstance();
		} catch (Exception e) {
			
			e.printStackTrace();
		}  // Dynamic Code
		//Account account = new SavingAccount(); // Static Code
		return account;
	}

}
