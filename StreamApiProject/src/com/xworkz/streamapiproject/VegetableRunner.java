package com.xworkz.streamapiproject;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VegetableRunner {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		
		list.add("Carrot");
		list.add("Potato");
		list.add("Cabbage");
		list.add("TOMATO");
		list.add("Cauliflower");
		list.add("Spinach");
		list.add("Asparagus");
		list.add("Brinjal");
		list.add("PEAS");
		list.add("Celery");
		list.add("Bitter gourd");
		list.add("Beans");
		list.add("Pumpkin");
		list.add("Cucumber");
		list.add("beetroot");
		list.add("Mushroom");
		list.add("Capsicum");
		list.add("Radish");
		list.add("Lady’s finger");
		list.add("Bottle Gourd");
		
		Stream<String> stream = list.stream();
		
		System.out.println(stream);
		
		stream.forEach((s) -> {System.out.println(s);});
		
		System.out.println("----------------------------------i----------------------------------------------");
		
		List<String> stream1 = list.stream().filter((veg) -> veg.contains("i")).collect(Collectors.toList());
		
		stream1.forEach((str) -> {System.out.println(str);});
		
		System.out.println("--------------------------------notSpace-------------------------------------------");
		
		Stream<String> emptySpace = list.stream();
        List<String> emptySpaces = emptySpace.filter((veg) -> !veg.contains(" ")).collect(Collectors.toList());
		
        emptySpaces.forEach((str) -> {System.out.println(str);});
        
        System.out.println("----------------------------------Capital Letters---------------------------------");
        
        List<String> capitalData = list.stream().filter((cap) -> cap.startsWith("A") || cap.contains("B") || cap.contains("C") || cap.contains("D") 
        		|| cap.contains("E")|| cap.contains("F") || cap.contains("G") || cap.contains("H") || cap.contains("I") || cap.contains("J")
        		|| cap.contains("K") || cap.contains("L")|| cap.contains("M") || cap.contains("N") || cap.contains("O") || cap.contains("P") 
        		|| cap.contains("Q") || cap.contains("R") || cap.contains("S")|| cap.contains("T") || cap.contains("U") || cap.contains("V") 
        		|| cap.contains("W") || cap.contains("X") || cap.contains("Y") || cap.contains("Z")).collect(Collectors.toList());
		
        capitalData.forEach((str) -> {System.out.println(str);});
		
		System.out.println("-------------------------------Map-----------------------------------------------");
		
        List<Object> mapData = list.stream().map((low) ->low.toLowerCase()).collect(Collectors.toList());
		
        mapData.forEach((md) -> {System.out.println(md);});
		
		System.out.println("-------------------------------Sorted--------------------------------------------");
		
        List<String> sortedList = list.stream().sorted().collect(Collectors.toList());
        
        System.out.println(sortedList);
		
        sortedList.forEach((sl) -> {System.out.println(sl);});

	}

}
