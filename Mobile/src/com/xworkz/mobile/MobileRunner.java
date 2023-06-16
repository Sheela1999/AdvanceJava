package com.xworkz.mobile;

import java.util.HashMap;
import java.util.Set;

import com.xworkz.mobile.dto.MobileDto;
import com.xworkz.mobile.service.MobileService;
import com.xworkz.mobile.service.MobileServiceImpl;

public class MobileRunner {

	public static void main(String[] args) {
		
		MobileDto dtos = new MobileDto("Vivo", 8100, "White", (byte) 2, 1606l);
		
		MobileDto dto1 = new MobileDto("Samsung", 12000, "Pastel Lime", (byte) 8, 1908l);
		
		MobileDto dto2 = new MobileDto("Redmi", 18500, "Black", (byte) 4, 1992l);
		
		MobileDto dto3 = new MobileDto("OnePlus", 22000, "Chromatic Grey", (byte) 12, 1567l);
		
		MobileService service = new MobileServiceImpl();
		
		service.save("One", dtos);
		service.save("Two", dto1);
		service.save("Three", dto2);
		service.save("Four", dto3);
		
		System.out.println("--------------------Find-----------------------------------------");
		MobileDto foundData = service.findByBrand("Redmi");
		System.out.println(foundData);
		
		System.out.println("--------------------------------Updated-----------------------------");
		boolean updatedData = service.updateByPrice(8100, "Grey");
		System.out.println(updatedData);
		
		System.out.println("----------------------Deleted----------------------------");
		boolean dltdData = service.deleteByBrand("OnePlus");
		System.out.println(dltdData);
		
		System.out.println("--------------------ReadAll--------------------------------------------------");
		HashMap<String, MobileDto> readData = service.readAll();
		
		Set<String> set = readData.keySet();
		
		for (String str : set) {
			System.out.println(readData.get(str));
		}

	}

}
