package com.xworkz.inheritancechain;

public class Fridge extends Grinder {

	int capacity;
	
	
	public Fridge() {
		System.out.println("No args Constructor");
	}
	
	public Fridge(String name, int price, String type, int capacity, String color) {
		super(name , price , color , type);
			this.capacity = capacity;
		
	}
	
	
	
	
}
