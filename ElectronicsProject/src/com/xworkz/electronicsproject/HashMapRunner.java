package com.xworkz.electronicsproject;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapRunner {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<String, String>();

		map.put("Sheela", "Belagavi");
		map.put("Pallavi", "Shivmoga");
		map.put("Ruhi", "Ananthpuram");
		map.put("Nikitha", "Shivmogaa");
		map.put("Priynka", "Gangavati");
		map.put("Aishwarya", "Hubli");
		map.put("Naveen", "Bangalore");
		map.put("Vivek", "Karkala");
		map.put("Manya", "Manglore");

		System.out.println(map.get("Ruhi"));
		System.out.println(map.get("Pallavi"));

		System.out.println("--------------------------------------------------------------------");

		Set<String> set = map.keySet();

		for (String str : set) {
			System.out.println(map.get(str));

		}

	}

}
