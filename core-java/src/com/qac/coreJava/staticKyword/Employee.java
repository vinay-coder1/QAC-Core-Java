package com.qac.coreJava.staticKyword;

public class Employee {
	
	private int id;       // instance or object variables
	public String name;
	public String email;
	public long number;
    
    
	public static String companyName = "TESLA"; //static or class variable
	
	
	public void login() {
		System.out.println("Employee log in:"+name);
	}
	
	public static void working() {
		companyName = "TESLA";
		System.out.println("Employee working:");
	}
	
	public void logout() {
		System.out.println("Employee log out:"+name);
	}
	
	
	  public void displayEmpDetails() {
		    System.out.println("Employee Details");
		    System.out.println("ID="+id);
			System.out.println("Name="+name);
			System.out.println("Email="+email);
			System.out.println("Number="+number);
			System.out.println("CompanyName="+Employee.companyName);
	  }
	 
	
	   //instance block
	{
     System.out.println("Inside instance block");
     this.id = 5;
     System.out.println("id intialized");
	}
	
	// static block 
  static{
	     System.out.println("Inside static block 1");
		}
  
  static{
	     System.out.println("Inside static block 2");
		}
}
