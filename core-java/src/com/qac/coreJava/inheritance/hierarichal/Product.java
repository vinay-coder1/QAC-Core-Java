package com.qac.coreJava.inheritance.hierarichal;

public class Product {

	int id;
	String name;
	double price;
	String color; 
	double weight;
	
	
	public void getproductDetails() {
		System.out.println("---Product Details-----");
		System.out.println("Product Id:"+id);
		System.out.println("Product Name:"+name);
		System.out.println("Product Price:"+price);
		System.out.println("Product Color:"+color);
		System.out.println("Product Weight:"+weight);
	}
	
	
	public void getAvavilablity(int available) {
		System.out.println("No of Product Available:"+available);
	}
	
	
}
