package com.xworkz.eventorganizations.repository;

import com.xworkz.eventorganizations.dto.EventOrgnDTO;

public interface EventOrgnRepository {

	boolean save(EventOrgnDTO dto);

	boolean updateById(int budget, int id);

	boolean updateByName(String location, String name);

	boolean update(EventOrgnDTO dtos, int id);

	boolean updateByEmaiId(int people, String email);

	boolean updateByFields(String organizedBy, int totalEvents, long phoneNo, String orgnName, String time,
			String name);

}
