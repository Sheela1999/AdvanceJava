package com.xworkz.functionalinterfacewithlambda;

import java.util.Comparator;
@FunctionalInterface
public interface MyComparator extends Comparator<String> {
	
	public int compare(String o1, String o2);

}
