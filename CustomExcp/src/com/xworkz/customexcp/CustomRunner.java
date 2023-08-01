package com.xworkz.customexcp;

import com.xworkz.customexcp.custom.InvalidAgeException;
import com.xworkz.customexcp.data.CustomClass;

public class CustomRunner {

	public static void main(String[] args) {
		
		try {
			CustomClass.age(13);
		} catch (InvalidAgeException e) {
			e.printStackTrace();
		}

	}

}
