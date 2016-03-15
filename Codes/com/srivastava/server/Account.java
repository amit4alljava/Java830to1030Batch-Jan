package com.srivastava.server;

public interface Account {
	double withDraw(double amount, String pinCode, String password);
	String deposit(double amount, String pinCode, String password);

}
