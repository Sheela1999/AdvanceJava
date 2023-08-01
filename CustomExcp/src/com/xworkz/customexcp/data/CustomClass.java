package com.xworkz.customexcp.data;

import com.xworkz.customexcp.custom.InvalidAgeException;

public class CustomClass {
	
	public static void age(int age) throws InvalidAgeException {
		if(age < 18) {
			System.out.println("age is not Valid for voting");
		}
		throw new InvalidAgeException("Invalid Age");
//			System.out.println("Invalid age for voting");
	}

}
