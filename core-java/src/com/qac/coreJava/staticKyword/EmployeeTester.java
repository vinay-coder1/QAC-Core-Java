package com.qac.coreJava.staticKyword;

public class EmployeeTester {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		
		System.out.println(Employee.companyName);  // calling static variable
		
		Employee.working();
		
		Employee emp1 = new Employee();
		
		emp1.displayEmpDetails();
		
		/*
		 * Employee emp1 = new Employee();
		 * 
		 * emp1.name = "Kiran"; emp1.id = 001; emp1.email = "Kiran@Tesla.com";
		 * emp1.number = 7845464646l;
		 * 
		 * 
		 * emp1.displayEmpDetails();
		 * 
		 * 
		 * Employee emp2 = new Employee();
		 * 
		 * emp2.name = "Shiva"; emp2.id = 002; emp2.email = "Shiva@Tesla.com";
		 * emp2.number = 9746464641l; //emp2.companyName = "Tesla";
		 * 
		 * emp2.displayEmpDetails();
		 */
		
		System.out.println("Main Method Ended");
	}

}
