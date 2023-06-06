package com.xworkz.fridgeproject.dao;

import com.xworkz.fridgeproject.dto.FridgeDto;

public interface FridgeDao {

	public boolean save(Integer id, FridgeDto dto);

	public FridgeDto find(Integer key);

	public boolean update(Integer key, String color);

	public boolean delete(Integer key);

}
