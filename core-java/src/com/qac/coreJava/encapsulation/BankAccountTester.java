package com.qac.coreJava.encapsulation;

public class BankAccountTester {

	public static void main(String[] args) {
		
		BankAccount account1 = new BankAccount("Sunil", "Sunil@gmail.com", "08/09/1996", 1000.00, "M G Road");
		
		account1.name = "Sunil";
		account1.email = "Sunil1526@gmail.com";
		
		account1.setDob("08/09/1995");
		
		System.out.println(account1.getDob());
		
		System.out.println(account1.email);
		
		System.out.println(account1.getBalance());
		
		System.out.println(account1.getBranch());
	}

}
