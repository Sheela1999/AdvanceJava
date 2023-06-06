package com.xworkz.fridgeproject.service;

import com.xworkz.fridgeproject.dao.FridgeDaoImpl;
import com.xworkz.fridgeproject.dto.FridgeDto;

public class FridgeServiceImpl implements FridgeService {

	FridgeDaoImpl dao = new FridgeDaoImpl();

	@Override
	public boolean save(Integer id, FridgeDto dto) {
		if (dto != null) {
			if (dto.getBrand() != null) {
				if (dto.getPrice() > 10000) {
					if (dto.getCapacityInLitres() > 100) {
						System.out.println("Validated and sent to dao");
						dao.save(id, dto);
						return true;
					}
					System.out.println("give capacity is more than 100");
					return false;
				}
				System.out.println("give price is more than 10000");
				return false;
			}
			System.out.println("brand is null");
			return false;
		}
		System.out.println("dto is null");
		return false;
	}

	@Override
	public FridgeDto find(Integer key) {
		if (key != 0) {
			System.out.println("Key is Validated");
			return dao.find(key);
		}
		System.out.println("key is 0");
		return null;
	}

	@Override
	public boolean update(Integer key, String color) {
		if (key != 0) {
			if (color != null && color.length() > 3) {
				System.out.println("validated color");
				dao.update(key, color);
				return true;
			}
			System.out.println("color is null and not valid");
			return false;
		}
		System.out.println("key is not valid");
		return false;
	}

	@Override
	public boolean delete(Integer key) {
		if (key != 0) {
			System.out.println("key is valid");
			dao.delete(key);
			return true;
		}
		System.out.println("key is not valid");
		return false;

	}

}
