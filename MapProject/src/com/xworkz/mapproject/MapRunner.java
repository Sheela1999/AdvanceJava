package com.xworkz.mapproject;

import java.util.HashMap;

public class MapRunner {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Available");
		map.put(2, "Not Available");
		map.put(3, "Available");
		map.put(4, "Available");
		map.put(5, "Not Available");

		System.out.println(map.put(3, "Available"));

		System.out.println(map);

	}

}
