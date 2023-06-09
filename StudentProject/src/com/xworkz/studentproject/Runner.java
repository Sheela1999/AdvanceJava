package com.xworkz.studentproject;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.studentproject.dto.StudentDto;

public class Runner {

	public static void main(String[] args) {

		List<StudentDto> list = Arrays.asList(new StudentDto("Manya T", 20231000567l, 16, "SSLC", "BTM"),
				new StudentDto("Avanish", 2022156789l, 18, "PUC", "Belagavi"),
				new StudentDto("Sheela", 20201609568l, 20, "B.E", "Moodbidre"),
				new StudentDto("Pallavi", 20211000567l, 19, "BSc", "Shivmoga"));

		// System.out.println(list);

		Comparator<StudentDto> comp = new Comparator<StudentDto>() {

			@Override
			public int compare(StudentDto o1, StudentDto o2) {
				if (o1.getAge() < o2.getAge()) {
					return 1;
				} else {
					return -1;
				}

			}

		};

		Collections.sort(list, comp);
		for (StudentDto str : list) {
			System.out.println(str);

		}

	}

}
