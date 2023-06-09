package com.xworkz.comparableproject;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.comparableproject.dto.LawyerDto;

public class LawyerRunner {

	public static void main(String[] args) {

		List<LawyerDto> list = Arrays.asList(new LawyerDto("Vinay Sharma", 29, "LLB", "Advocate", 40000),
				new LawyerDto("Asha M", 40, "BA LLB", "Senior Advocate", 140000),
				new LawyerDto("manish V", 25, "BBA LLB", "Advocate", 50000),
				new LawyerDto("Tanya S", 50, "BSc LLB", "Judge", 240000));

		// ArrayList<LawyerDto> list = new ArrayList<LawyerDto>();

//		LawyerDto dto = new LawyerDto("Vinay Sharma", 29, "LLB", "Advocate", 40000);
//		LawyerDto dto1 = new LawyerDto("Asha M", 40, "BA LLB", "Senior Advocate", 140000);
//		LawyerDto dto2 = new LawyerDto("manish V", 25, "BBA LLB", "Advocate", 50000);
//		LawyerDto dto3 = new LawyerDto("Tanya S", 50, "BSc LLB", "Judge", 240000);
//		
//		list.add(dto);
//		list.add(dto1);
//		list.add(dto2);
//		list.add(dto3);

		System.out.println(list);
		
		Comparator<LawyerDto> comp = new Comparator<LawyerDto>() {

			@Override
			public int compare(LawyerDto o1, LawyerDto o2) {
				if (o1.getName().length() > o2.getName().length()) {
					return 1;
				} else {
					return -1;
				}

			}
		};

		System.out.println("----------------------------------------------------------------------------");
		//Collections.sort(list,comp); for comparator
		Collections.sort(list); // for comparable
		for (LawyerDto dto : list) {
			System.out.println(dto);
		}

	}

}
