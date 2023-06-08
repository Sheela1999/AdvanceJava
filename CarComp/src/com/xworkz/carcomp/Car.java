package com.xworkz.carcomp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Car {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		list.add("Audi");
		list.add("Maruthi Suzuki");
		list.add("Tata Motors");
		list.add("Mahindra");
		list.add("Hyundai");
		list.add("kia");
		list.add("Honda City");
		list.add("Renault");
		list.add("Skoda");
		list.add("Nissan");
		list.add("Ford");
		list.add("Kia Motors");
		list.add("Marcedes Benz");
		list.add("Force Motors");
		list.add("Eeco");
		list.add("Toyota");
		list.add("Honda");
		list.add("BMW");
		list.add("Tata Nexon");
		list.add("Lexus");

		System.out.println(list);

		Comparator<String> comp = new Comparator<String>() {

			@Override
			public int compare(String arg0, String arg1) {
				if (arg0.length() > arg1.length()) {
					return 1;
				} else {
					return -1;
				}
			}

		};

		Collections.sort(list);
		Collections.sort(list, comp);
		for (String str : list) {
			System.out.println(str);
		}

	}

}
