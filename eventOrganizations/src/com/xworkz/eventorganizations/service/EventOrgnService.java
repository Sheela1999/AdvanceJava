package com.xworkz.eventorganizations.service;

import com.xworkz.eventorganizations.dto.EventOrgnDTO;

public interface EventOrgnService {

	boolean save(EventOrgnDTO dto);

	boolean updateById(int budget, int id);

	boolean updateByName(String location, String name);

	boolean update(EventOrgnDTO dto);

	boolean updateByEmaiId(int people, String email);

	boolean updateByFields(String organizedBy, int totalEvents, long phoneNo, String orgnName, String time,
			String name);

}
