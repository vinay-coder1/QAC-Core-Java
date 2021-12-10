package com.qac.coreJava.accessModifiers;

public class User {
	
	
	  //instance variable
	  String userName;
	  
	  
	  public static String password; //static variable
	
	
	 void login(String userName,String password) {	 
	    String test = "pass"; //local variable
		System.out.println("Login SuccessFull: "+this.userName);
		System.out.println(test);
	}
		
	void display() {
		System.out.println(userName); 
		System.out.println(test);
	}
	

}
