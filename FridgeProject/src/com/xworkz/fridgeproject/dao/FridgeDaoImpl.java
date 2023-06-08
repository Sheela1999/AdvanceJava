package com.xworkz.fridgeproject.dao;

import java.util.HashMap;

import com.xworkz.fridgeproject.dto.FridgeDto;

public class FridgeDaoImpl implements FridgeDao {

	HashMap<Integer, FridgeDto> map = new HashMap<Integer, FridgeDto>();

	@Override
	public boolean save(Integer id, FridgeDto dto) {
		map.put(id, dto);
		System.out.println("Fridge dto is saved");
		return true;
	}

	@Override
	public FridgeDto find(Integer key) {
		FridgeDto foundDto = map.get(key);
		System.out.println("Key found");
		return foundDto;
	}

	@Override
	public boolean update(Integer key, String color) {
		FridgeDto res = map.get(key);
		res.setColor(color);
		System.out.println("color is updated");
		System.out.println(map.get(key));

		return true;
	}

	@Override
	public boolean delete(Integer key) {
		map.remove(key);
		System.out.println("Key is deleted");
		System.out.println(map.get(key));
		return true;

	}

	@Override
	public HashMap<Integer, FridgeDto> readAll() {
		return map;
	}

}
