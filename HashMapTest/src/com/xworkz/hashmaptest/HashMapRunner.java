package com.xworkz.hashmaptest;

import java.util.HashMap;

public class HashMapRunner {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(1, "Electronics");
		map.put(2, "Network Analysis");
		map.put(3, "Signals and System");
		map.put(4, "Digital Electronocs");
		map.put(5, "Microcontrollers");
		map.put(6, "Analog Electronocs");
		
		System.out.println(map);
		
		System.out.println("-------------------------------------------");
		
		for(int i=1; i<=6; i++) {
			System.out.println(map.get(i));
		}

	}

}
