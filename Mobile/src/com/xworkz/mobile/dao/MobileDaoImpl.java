package com.xworkz.mobile.dao;

import java.util.HashMap;
import java.util.Set;

import com.xworkz.mobile.dto.MobileDto;

public class MobileDaoImpl implements MobileDao {
	
	HashMap<String, MobileDto> map = new HashMap<String, MobileDto>();

	@Override
	public boolean save(String key, MobileDto dto) {
		map.put(key, dto);
		System.out.println("dto is saved");
		return true;
	}

	@Override
	public MobileDto findByBrand(String brand) {
		Set<String> set = map.keySet();
		for (String str : set) {
			MobileDto found = map.get(str);
			if(found.getBrand().equals(brand))
			return found;
		}
		return null;
	}

	@Override
	public boolean updateByPrice(int price, String color) {
		Set<String> set = map.keySet();
		
		for(String key : set) {
			MobileDto dto = map.get(key);
			if(dto.getPrice()==price) {
				dto.setColor(color);
				System.out.println("Color is updated");
				return true;
			}
		}
		System.out.println("Color is not updated");
		return false;
		
	}

	@Override
	public boolean deleteByBrand(String brand) {
		Set<String> set = map.keySet();
		for(String key : set) {
			MobileDto dto =map.get(key);
			if(dto.getBrand().equals(brand)) {
				map.remove(key);
				System.out.println("Brand is deleted");
				return true;
			}
		}
		System.out.println("Brand is not deleted");
		return false;
	}

	@Override
	public HashMap<String, MobileDto> readAll() {
		return map;
	}

}
