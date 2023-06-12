package com.xworkz.electronicsproject.util;

import java.util.Comparator;

import com.xworkz.electronicsproject.dto.ElectronicsDto;

public class SortByDateComp implements Comparator<ElectronicsDto> {

	@Override
	public int compare(ElectronicsDto o1, ElectronicsDto o2) {
		if (o1.getLaunchDate() < o2.getLaunchDate()) {
			return 1;
		} else {
			return -1;
		}
	};

}
