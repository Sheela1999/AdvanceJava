package com.xworkz.mobile.service;

import java.util.HashMap;

import com.xworkz.mobile.dao.MobileDaoImpl;
import com.xworkz.mobile.dto.MobileDto;

public class MobileServiceImpl implements MobileService {
	
	MobileDaoImpl dao = new MobileDaoImpl();

	@Override
	public boolean save(String key, MobileDto dto) {
		if(key != null) {
			if(dto != null) {
				if(dto.getBrand() != null && dto.getBrand().length()>3 && dto.getColor() != null) {
					System.out.println("Dto is Validated");
					return dao.save(key, dto);
				}
			}
		}
		return false;
	}

	@Override
	public MobileDto findByBrand(String brand) {
		if(brand != null) {
			 MobileDto dto = dao.findByBrand(brand);
			 return dto; 
		}
		return null;
	}

	@Override
	public boolean updateByPrice(int price, String color) {
		if(price>5000) {
			if(color != null) {
				dao.updateByPrice(price, color);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean deleteByBrand(String brand) {
		if(brand != null) {
			return dao.deleteByBrand(brand);
		}
		return false;
	}

	@Override
	public HashMap<String, MobileDto> readAll() {
		return dao.readAll();
	}

}
