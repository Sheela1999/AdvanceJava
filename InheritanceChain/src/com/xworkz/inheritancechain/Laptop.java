package com.xworkz.inheritancechain;

public class Laptop extends ElectronicGadgets {
	
	int price;
	
	public Laptop() {
		super();
	}
	
	public Laptop(int price, String name) {
		super(name);
		this.price = price;
		
	}
	
	

}
