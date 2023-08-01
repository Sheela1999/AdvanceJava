package com.xworkz.inheritancechain;

public class Grinder extends Mobile {
	
	String type ;
	
	
	public Grinder() {
		super();	
	}

	public Grinder(String name, int price, String color, String type) {
		super(name , price , color);
		
		this.type = type;
	}
	
	

}
