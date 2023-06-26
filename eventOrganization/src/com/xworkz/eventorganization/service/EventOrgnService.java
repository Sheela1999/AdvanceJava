package com.xworkz.eventorganization.service;

import com.xworkz.eventorganization.dto.EventOrgnDTO;

public interface EventOrgnService {

	boolean save(EventOrgnDTO dto);
	boolean updateById(int budget, int id);
	boolean updateByName(String location,String name);
	boolean update(EventOrgnDTO dtos, int id);
	boolean updateByEmaiId(int people ,String email);
	boolean updateByFields(String organizedBy, int totalEvents, long phoneNo, String orgnName, String time, String name);
	
}
