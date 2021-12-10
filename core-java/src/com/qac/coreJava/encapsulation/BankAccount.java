package com.qac.coreJava.encapsulation;

public class BankAccount {
	
	
	//data members
	private long accountNumber;
	private String ifsCode;
	private String branch;
	private double balance;
	public String name;
	public String email;
	private String dob;
	
	
	public BankAccount(String name,String email,String dob,double balance,String branch) {
		    System.out.println("inside 5 paramters constructor");
		    this.name = name;
		    this.email = email;
		    this.dob = dob;
		    this.balance = balance;
		    this.branch = branch;
		    
		    this.accountNumber = 164466112325l;
		    this.ifsCode = "BNKB5646131";
		    
	}
	
	
	//member function
	public void CreateAccount() {
		System.out.println("Creating a Bank Account");
	}

	public void withdraw() {
		System.out.println("Withdraw ammount");
	}
	
	public void deposit() {
		System.out.println("deposit ammount");
	}
	
	//getter method
	public double getBalance() {
		return this.balance;
	}
	
	public long getAccount() {
		return this.accountNumber;
	}
	
	public String getIfsCode() {
		return this.ifsCode;
	}
	
	public String getBranch() {
		return this.branch;
	}
	
	public String getDob() {
		return this.dob;
	}
	
	//setter method
	public void setDob(String dob) {
		this.dob = dob;
	}
	
}
