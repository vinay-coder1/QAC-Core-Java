package com.qac.coreJava.inheritance.singleI;

public class AppleMobileTester {

	public static void main(String[] args) {
		System.out.println("Inside Main Method");
		
		AppleMobile appleMobile = new AppleMobile();
			
		
		//parent class properties
		appleMobile.brand = "Apple 5";
		appleMobile.colour = "Gold";
		appleMobile.cameraMP = 64;
		appleMobile.battery = "5000mah";
		
		appleMobile.displayMobileDeatils();
		
		
		//child class properties
		System.out.println("IOS :"+appleMobile.ios);
		System.out.println("Ear Phone Jack:"+appleMobile.earPhoneJack);
		
		
		// parent class methods
		appleMobile.calling();
		
		appleMobile.messsaging();  
		
		
		appleMobile.hdRecording(); // child class method
		
		
		
		Mobile m = new Mobile();
		
		// m.hdRecording(); cant access child class properies and methods from parent object
		
		
		
		
		
		System.out.println("Inside Main Method");
	}

}
