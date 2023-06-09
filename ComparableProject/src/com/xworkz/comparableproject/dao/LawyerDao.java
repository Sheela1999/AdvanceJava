package com.xworkz.comparableproject.dao;

import java.util.Comparator;

import com.xworkz.comparableproject.dto.LawyerDto;

public interface LawyerDao {

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

	Comparator<LawyerDto> comp1 = new Comparator<LawyerDto>() {

		@Override
		public int compare(LawyerDto o1, LawyerDto o2) {
			if (o1.getSalary() < o2.getSalary()) {
				return 1;
			} else {
				return -1;
			}
		}
	};

}
