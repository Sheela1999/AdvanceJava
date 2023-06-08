package com.xworkz.maptypes;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Birds {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> lMap = new LinkedHashMap<Integer, String>();

		lMap.put(1, "Parrot");
		lMap.put(2, "Peacock");
		lMap.put(3, "Swans");
		lMap.put(4, "Duck");
		lMap.put(5, "Sparrow");

		for(int i=0; i<=5; i++) {
			System.out.println(lMap.get(i));
		}
		
		

		System.out.println(lMap.get(2));
		System.out.println(lMap.size());
		System.out.println(lMap.remove(1));
		System.out.println(lMap.clone());// same array one more time
		System.out.println(lMap.containsValue("Duck"));// value present - true
		System.out.println(lMap.containsValue("spar"));// value is not present - false
		System.out.println(lMap.containsKey(3));
		System.out.println(lMap.isEmpty());

		System.out.println(lMap);

		System.out.println("---------------TreeMap--------------------------------------------------");

		TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();

		tMap.put(1, "Ostrich");
		tMap.put(5, "Eagle");
		tMap.put(4, "Kingfisher");
		tMap.put(2, "Heron");
		tMap.put(3, "Nightingale");

		for(int j=0; j<=5; j++) {
			System.out.println(tMap.get(j));
		}

		System.out.println("-------------Methods---------------------------------");
		
		System.out.println(tMap.clone());
		System.out.println(tMap.getOrDefault(3, null));
		System.out.println(tMap.replace(2, "Duck"));
		System.out.println(tMap.toString());
		System.out.println(tMap.ceilingEntry(5));
		System.out.println(tMap.firstEntry());
		System.out.println(tMap.pollFirstEntry());
		System.out.println(tMap.firstKey());// having least char
		System.out.println(tMap.floorEntry(4));
		System.out.println(tMap.lastKey());
		System.out.println(tMap.comparator());

	}

}
