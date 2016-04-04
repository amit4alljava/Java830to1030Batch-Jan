package com.srivastava.server;

public class SavingAccount implements Account{
	
	public boolean checkLimit(){
		return true;
	}
	
	@Override
	public double withDraw(double amount, String pinCode, String password) {
		// TODO Auto-generated method stub
		if(checkLimit()){
		return 1000;
		}
		else
		{
			return 0;
		}
	}

	@Override
	public String deposit(double amount, String pinCode, String password) {
		// TODO Auto-generated method stub
		return "Saving Account Deposit Call";
	}

}
