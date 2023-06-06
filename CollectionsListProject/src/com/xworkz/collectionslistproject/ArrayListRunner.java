package com.xworkz.collectionslistproject;

import java.util.ArrayList;

public class ArrayListRunner {

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();

		// add
		list.add("Belagavi");
		list.add("Bengalore");
		list.add("BTM");
		list.add("Manglore");
		list.add("Mysore");
		list.add("Gadag");
		list.add("Kalburgi");
		list.add("Bidar");
		list.add("Raychur");
		list.add("Yadhgiri");
		list.add("Dharwad");
		list.add("Hubli");
		list.add("Davangere");
		list.add("Ramnagara");
		list.add("Shivmoga");
		list.add("Udupi");
		list.add("Tumkur");
		list.add("Hasan");
		list.add("Vijayanagara");
		list.add("Bagalkote");

		// Remove
		System.out.println("------------REMOVE--------------------------------------");
		System.out.println(list.remove("Ramnagara"));
		System.out.println(list.remove("BTM"));
		System.out.println(list.remove("Gadag"));
		System.out.println(list.remove("Udupi"));
		System.out.println(list.remove("Yadhgiri"));

		// Add elements using index
		list.add(0, "Vijaypura");
		list.add(1, "Ballari");
		list.add(2, "Kolar");
		list.add(3, "Haveri");
		list.add(4, "Jayanagara");

		// get
		System.out.println("---------------GET----------------------------------");
		list.get(1);
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(5));
		System.out.println(list.get(7));
		System.out.println(list.get(9));
		System.out.println(list.get(11));
		System.out.println(list.get(13));
		System.out.println(list.get(12));
		System.out.println(list.get(8));
		System.out.println(list.get(0));

		// using indexOf methods
		System.out.println("---------------------IndexOf----------------------------------------");
		System.out.println(list.indexOf("Kolar"));
		System.out.println(list.indexOf("Haveree"));

		// using set
		System.out.println("-------------SET-----------------------------------");
		System.out.println(list.set(13, "Hubballi"));
		System.out.println(list.set(5, "Belgaum"));
		System.out.println(list.set(0, "Electronic City"));

		// using toArray
		System.out.println("------------------ToArray-------------------");
		Object[] str = list.toArray();
		for (int sysout = 0; sysout < str.length; sysout++) {
			System.out.println(str[sysout]);
		}
		System.out.println(str);

		System.out.println("----------------------------------------------------------");
		for (String s : list) {
			System.out.println(s);
		}
		System.out.println("------------ToString--------------------------------------------------------");
		System.out.println(list.toString());

		System.out.println("--------------------ADD-----------------------------------------------------");
		System.out.println(list);

	}

}
