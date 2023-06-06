package com.xworkz.fridgeproject.service;

import com.xworkz.fridgeproject.dto.FridgeDto;

public interface FridgeService {

	public boolean save(Integer id, FridgeDto dto);

	public FridgeDto find(Integer key);

	public boolean update(Integer Key, String color);

	public boolean delete(Integer key);

}
