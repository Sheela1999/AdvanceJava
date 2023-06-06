package com.xworkz.setproject;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetRunner {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();

		set.add("Rose");
		set.add("Jasmine");
		set.add("Lotus");
		set.add("Lily");
		set.add("Marigold");

		for (String str : set) {
			System.out.println(str);
		}

		System.out.println("------------LinkedHashSet-------------------------------------");

		LinkedHashSet<Object> lsh = new LinkedHashSet<Object>();

		lsh.add('L');
		lsh.add('O');
		lsh.add('T');
		lsh.add('U');
		lsh.add('S');

		for (Object obj : lsh) {
			System.out.println(obj);
		}

	}

}
