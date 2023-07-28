package com.xworkz.novel;

public enum Credentials {
	
	URL("jdbc:mysql://localhost:3306/class_5"), USER("root"), PASSWORD("Xworkzodc@123");
	
	public String name;
	
	Credentials(String name){
		this.name = name;
	}

}
