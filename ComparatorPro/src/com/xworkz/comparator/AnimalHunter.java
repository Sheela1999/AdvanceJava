package com.xworkz.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnimalHunter {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Lion");
		list.add("Monkey");
		list.add("cat");
		list.add("Fox");
		list.add("Donkey");
		
		Comparator<String> comp = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if(o1.length()>o2.length()) {
					return 1;
				}
				{
					return -1;
				}
			}
		};

		Collections.sort(list, comp);
		for (String str : list) {
			System.out.println(str);
		}
	}

}
