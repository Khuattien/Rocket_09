package com.vti.entity;

public class Account_ex4 {
	private String id, name;
	private int balance;
	
	Account_ex4(String id, String name, int balance)
	{
		this.id = id;
		this.name=name;
		this.balance = balance;
	}
	
	public String getID() {
		return id;
	}
	 public String getName() {
		return name;
	}
	 
	public int getBalance() {
		return balance;
	}
	
	
}


