package com.qac.coreJava.inheritance.multiI;

public class AnimalTester {

	public static void main(String[] args) {
		System.out.println("Inside Main Method");
		
		BabyDog babyDog = new BabyDog();
		
		System.out.println(babyDog.age);
		
	    System.out.println(babyDog.loyal); //from parent class Dog
	    
	  //from parent class Animal
	   String name = babyDog.name = "Baby Dog";
	                 babyDog.legs = 4;
	                 babyDog.breed = "Ratviller";
	                 babyDog.colour = "Brown";
	    
	    
	    babyDog.drinkingMilk(name); 
	    
	    babyDog.barking(name); //parent class Dog
	    
	    babyDog.walking(name); //parent class Animal
		
		System.out.println("Ended Main Method");
	}

}
