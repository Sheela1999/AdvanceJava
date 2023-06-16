package com.xworkz.mobile.service;

import java.util.HashMap;

import com.xworkz.mobile.dto.MobileDto;

public interface MobileService {
	
	public boolean save(String key, MobileDto dto);
	
	public MobileDto findByBrand(String brand); 
	
	public boolean updateByPrice(int price, String color);
	
	public boolean deleteByBrand(String brand);
	
	public HashMap<String, MobileDto> readAll();

}
