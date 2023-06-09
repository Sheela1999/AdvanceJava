package com.xworkz.studentproject;

import java.util.HashMap;
import java.util.Set;

import com.xworkz.studentproject.dao.StudentDao;
import com.xworkz.studentproject.dao.StudentDaoImpl;
import com.xworkz.studentproject.dto.StudentDto;

public class StudentRunner {

	public static void main(String[] args) {

		StudentDto dtos = new StudentDto("Manya T", 20231000567l, 16, "SSLC", "BTM");
		StudentDto dtos1 = new StudentDto("Avanish", 2022156789l, 18, "PUC", "Belagavi");
		StudentDto dtos2 = new StudentDto("Sheela", 20201609568l, 20, "B.E", "Moodbidre");
		StudentDto dtos3 = new StudentDto("Pallavi", 20211000567l, 19, "BSc", "Shivmoga");

		StudentDao daos = new StudentDaoImpl();

		daos.save(1, dtos);
		daos.save(2, dtos1);
		daos.save(3, dtos2);
		daos.save(4, dtos3);

		System.out.println("---------------------------------FOUND---------------------------------");
		StudentDto found = daos.find(3);
		System.out.println(found);

		System.out.println("--------------------------Delete------------------------------------");
		boolean dlt = daos.delete(2);
		System.out.println(dlt);

		System.out.println("-----------------Read-----------------------------------------");
		HashMap<Integer, StudentDto> read = daos.readAll();

		Set<Integer> set = read.keySet();
		// System.out.println(set);

		for (Integer integer : set) {
			System.out.println(read.get(integer));

		}

//		Comparator<StudentDto> comp = new Comparator<StudentDto>() {
//
//			@Override
//			public int compare(StudentDto o1, StudentDto o2) {
//				if (o1.getAge() > o2.getAge()) {
//					return 1;
//				} else {
//					return -1;
//				}
//
//			}
//
//		};
//		System.out.println();sort is not possible bcz of map
	}
}
