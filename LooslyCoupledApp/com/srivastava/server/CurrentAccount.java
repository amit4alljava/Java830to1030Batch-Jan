package com.srivastava.server;

public class CurrentAccount implements Account {

	@Override
	public double withDraw(double amount, String pinCode, String password) {
		// TODO Auto-generated method stub
		return 2000;
	}

	@Override
	public String deposit(double amount, String pinCode, String password) {
		// TODO Auto-generated method stub
		return "Current Account Deposit ";
	}

}
