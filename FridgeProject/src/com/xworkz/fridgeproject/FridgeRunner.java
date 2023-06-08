package com.xworkz.fridgeproject;

import java.util.HashMap;
import java.util.Set;

import com.xworkz.fridgeproject.constants.FridgeType;
import com.xworkz.fridgeproject.dto.FridgeDto;
import com.xworkz.fridgeproject.service.FridgeService;
import com.xworkz.fridgeproject.service.FridgeServiceImpl;

public class FridgeRunner {

	public static void main(String[] args) {

		FridgeDto dto = new FridgeDto("Bosch", 32000, "Royal Blue", FridgeType.DOUBLE_DOOR_REF, 263, "3 Star");
		FridgeDto dto1 = new FridgeDto("Samsung", 20000, "Grey", FridgeType.SINGLE_DOOR_REF, 215, "4 Star");
		FridgeDto dto2 = new FridgeDto("Whirlpool", 27000, "Alpha Steel", FridgeType.MULTI_DOOR_REF, 240, "5 Star");
		FridgeDto dto3 = new FridgeDto("Haier", 33000, "Red", FridgeType.FRENCH_DOOR_REF, 263, "4 Star");

		FridgeService ser = new FridgeServiceImpl();

		ser.save(1, dto);
		ser.save(2, dto1);
		ser.save(3, dto2);
		ser.save(4, dto3);

		System.out.println("--------------------------------Find--------------------------------------");

		FridgeDto found = ser.find(3);
		System.out.println(found);

		System.out.println("---------------------Update------------------------------------------------");
		boolean updated = ser.update(4, "Spiral Glass Black");
		System.out.println(updated);

		System.out.println("-------------------------------Delete--------------------------------------");
		boolean dlt = ser.delete(2);
		System.out.println(dlt);

		System.out.println("-----------------------------READ---------------------------------------");
		HashMap<Integer, FridgeDto> res = ser.readAll();

//		Set<Entry<Integer, FridgeDto>> set = res.entrySet();
//
//		for (Entry<Integer, FridgeDto> entry : set) {
//			System.out.println(entry);
//		}
		
		Set<Integer> set = res.keySet();
		
		for(Integer in : set) {
			System.out.println(res.get(in));
		}

	}

}
