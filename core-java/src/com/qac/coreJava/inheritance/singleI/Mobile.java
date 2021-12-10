package com.qac.coreJava.inheritance.singleI;
//parent
public class Mobile {

	String brand;
	String colour;
	int ram;
	int rom;
	float cameraMP;
	String battery;
	
	
	public void calling() {
		System.out.println("Calling from Mobile");
	}
	
	public void  messsaging() {
		System.out.println("messsaging from Mobile");
	}
		
	public void  capturing() {
		System.out.println("capturing from Mobile");
	}
	
	
	public void displayMobileDeatils() {
		System.out.println("Mobile Details");
		System.out.println("Brand="+this.brand);
		System.out.println("Colour="+this.colour);
		System.out.println("Ram="+this.ram);
		System.out.println("Rom="+this.rom);
		System.out.println("Camaera MP="+this.cameraMP);
		System.out.println("Battery Capacity="+this.battery);
        		
	}
	
	
	
}
