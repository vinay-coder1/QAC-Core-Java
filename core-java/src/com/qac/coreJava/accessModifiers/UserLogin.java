package com.qac.coreJava.accessModifiers;


public class UserLogin {

	public static void main(String[] args) {
		System.out.println("Main Method started");
		
		User user1 = new User();
		
		//com.qac.coreJava.testAccess.User user2  = new com.qac.coreJava.testAccess.User();
		
		//System.out.println(user2.userName); 
		
		user1.login("Vinay", "Vinay");
		
		System.out.println(user1.userName); 
		
		System.out.println("Main Method ended");
	}

}
