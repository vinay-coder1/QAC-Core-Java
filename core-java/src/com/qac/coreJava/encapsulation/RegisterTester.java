package com.qac.coreJava.encapsulation;

public class RegisterTester {

	public static void main(String[] args) {
		
		Registeration registeration = new Registeration();
		
		registeration.setName("Kavya");
		registeration.setEmail("Kavya@gmail.com");
		registeration.setUserId("Kavya_K");
		registeration.setPassword("Kavya_K");
		
		
		System.out.println(registeration.getEmail());

	}

}
