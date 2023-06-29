package com.xworkz.functionalinterfacewithlambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaRunner {

	public static void main(String[] args) {
		
		SingleParameter single = (num) -> {
			System.out.println(num);
			System.out.println("lambda expression..");
		};
		
		single.expression(10);
		
		MultiplePara multiple = (brand, price, type) -> {
			System.out.println(brand);
			System.out.println(price);
			return type;
		};
		
		String result = multiple.watch("Sonata", 800, "SmartWatch");
        System.out.println(result);
        
        List<String> list = new ArrayList<String>();
        
        list.add("Sheep");
        list.add("Cat");
        list.add("Horse");
        list.add("Fox");
        list.add("Lion");
        list.add("Tiger");
        
       MyComparator comp = (o1, o2) -> {
    	   
    	   if(o1.length() > o2.length()) {
    		   return 1;
    	   }
    	   else {
    		   return -1;
    	   }
       };
       
       Collections.sort(list, comp);
       
       list.forEach((str) -> {
    	   System.out.println(str);});

	}

}
