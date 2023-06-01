package com.xworkz.bagproject.dao;

import java.util.LinkedList;

import com.xworkz.bagproject.dto.BagDto;

public interface BagDao {
	
	public boolean save(BagDto dto);
	public BagDto find(int price);
	public boolean update(String bagBrand, String color);
	public boolean delete(String type);
	public LinkedList<BagDto> readAll();

}
