package com.xworkz.fridgeproject.dao;

import java.util.HashMap;

import com.xworkz.fridgeproject.dto.FridgeDto;

public interface FridgeDao {

	public boolean save(Integer id, FridgeDto dto);

	public FridgeDto find(Integer key);

	public boolean update(Integer key, String color);

	public boolean delete(Integer key);
	
	public HashMap<Integer, FridgeDto> readAll();

}
