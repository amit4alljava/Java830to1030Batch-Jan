package com.srivastava.caller;

import com.srivastava.factory.Factory;
import com.srivastava.server.Account;
import com.srivastava.server.SavingAccount;
// Caller 1 to 1000
public class Caller {

	public static void main(String[] args) {
		Account account = Factory.getObject();
		System.out.println(account.deposit(2000, "XXX", "XXX"));
		System.out.println(account.withDraw(2000, "XXX", "XXX"));
		
		

	}

}
