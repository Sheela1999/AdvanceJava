package com.xworkz.inheritancechain;

public class Mobile extends Laptop {
	
String color;
	
	
	public Mobile() {
		System.out.println("No args Constructor");
	}
	
	public Mobile(String name, int price, String color) {
		super(price , name);
		
		this.color = color;
	}	

}
