package com.xworkz.electronicsproject;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.xworkz.electronicsproject.dto.ElectronicsDto;
import com.xworkz.electronicsproject.util.SortByDateComp;
import com.xworkz.electronicsproject.util.SortByPriceComp;
import com.xworkz.electronicsproject.util.SortByWarrantyComp;

public class ElectronicsRunner {

	public static void main(String[] args) {

		ElectronicsDto dto1 = new ElectronicsDto("Smart WaterFlosser", 3250, 27, 4.5f, "Black", 2.1f);

		ElectronicsDto dto2 = new ElectronicsDto("Apple Watch SE", 28400, 16, 4.3f, "Midnight", 0.5f);

		ElectronicsDto dto3 = new ElectronicsDto("HP wireless Printer", 80000, 5, 4.0f, "white", 3.0f);

		ElectronicsDto dto4 = new ElectronicsDto("Philips VaccumCleaner", 8999, 1, 3.4f, "Blue", 2.5f);

		ElectronicsDto dto5 = new ElectronicsDto("Samsung Earbuds", 16990, 10, 4.4f, "Bora Purple", 2.0f);

		ElectronicsDto dto6 = new ElectronicsDto("Haier Refrigerator", 64990, 31, 4.5f, "Inox Steel", 1.5f);

		ElectronicsDto dto7 = new ElectronicsDto("Whirlpool AC", 38990, 2, 2.7f, "White", 0.9f);

		ElectronicsDto dto8 = new ElectronicsDto("LG MiCrowave Oven", 21250, 28, 3.5f, "Black", 1.0f);

		ElectronicsDto dto9 = new ElectronicsDto("Sony Smart OLED Tv", 124990, 20, 4.8f, "Gray", 1.3f);

		ElectronicsDto dto10 = new ElectronicsDto("Echo Dot SmartSpeaker", 2999, 15, 3.5f, "Balck With Blue", 0.6f);

		List<ElectronicsDto> list = Arrays.asList(dto1, dto2, dto3, dto4, dto5, dto6, dto7, dto8, dto9, dto10);

		SortByPriceComp comp = new SortByPriceComp();

		SortByWarrantyComp comp1 = new SortByWarrantyComp();

		SortByDateComp comp2 = new SortByDateComp();

		Collections.sort(list, comp2);

		for (ElectronicsDto dtos : list) {
			System.out.println(dtos);
		}

	}

}
