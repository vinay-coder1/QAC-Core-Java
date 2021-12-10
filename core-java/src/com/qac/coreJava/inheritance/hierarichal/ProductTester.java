package com.qac.coreJava.inheritance.hierarichal;

public class ProductTester {

	public static void main(String[] args) {
		System.out.println("Main Method Started");
		
		TeleVison teleVison = new TeleVison();
		
		//properties of parent class Product
		teleVison.id = 1;   
		teleVison.name = "LED TV";
		teleVison.color = "Black";
		teleVison.price = 55000;
		
		//property of child Television
		teleVison.smartTv = true;
		
		//Methods of parent class Product
		teleVison.getproductDetails();
		teleVison.getAvavilablity(500);
		
		teleVison.onlineStreaming();
		
		
		Cooker cooker = new Cooker();
		
		//properties of parent class Product through child class Cooker
		cooker.id = 2;   
		cooker.name = "Pressure Cooker";
		cooker.color = "Silver";
		cooker.price = 5500;
		
		//Methods of parent class Product through child class Cooker
		cooker.getproductDetails();
		cooker.getAvavilablity(100);
		
		cooker.cooking();
		
		
		SunGlass glass = new SunGlass();
		
		//properties of parent class Product through child class glass
		glass.id = 3;   
		glass.name = "Rebon Glass";
		glass.color = "Gold";
		glass.price = 8000;
				
		//Methods of parent class Product through child class glass
		glass.getproductDetails();
		glass.getAvavilablity(150);
		
		
		System.out.println("Main Method Ended");
	}

}
