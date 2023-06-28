package com.xworkz.eventorganizations.service;

import com.xworkz.eventorganizations.dto.EventOrgnDTO;
import com.xworkz.eventorganizations.repository.EventOrgnRepositoryImpl;

public class EventOrgnServiceImpl implements EventOrgnService {
	
	EventOrgnRepositoryImpl repo = new EventOrgnRepositoryImpl();

	@Override
	public boolean save(EventOrgnDTO dto) {
		System.out.println("saved");
		if (dto != null) {
			if (dto.getEventName() != null && dto.getEmailId() != null && dto.getLocation() != null
					&& dto.getOrgnName() != null && dto.getOrganizedBy() != null && dto.getExpectedPeople() > 200) {
				repo.save(dto);
			}
		}
		return true;
	}

	@Override
	public boolean updateById(int budget, int id) {
		System.out.println("budget updated");
		if (budget > 50000) {
			if (id != 0) {
				repo.updateById(budget, id);
			}
		}
		return false;
	}

	@Override
	public boolean updateByName(String location, String name) {
		System.out.println("location is updated using name");
		if (location != null) {
			if (name != null) {
				repo.updateByName(location, name);
			}
		}
		return false;
	}

	@Override
	public boolean update(EventOrgnDTO dtos, int id) {
		if (dtos != null) {
			if (id != 0) {
				repo.update(dtos, id);
			}
		}

		return false;
	}

	@Override
	public boolean updateByEmaiId(int people, String email) {
		if (people > 200) {
			if (email != null) {
				repo.updateByEmaiId(people, email);
			}
		}
		return false;
	}

	@Override
	public boolean updateByFields(String organizedBy, int totalEvents, long phoneNo, String orgnName, String time,
			String name) {
		if(organizedBy != null && orgnName != null && time != null && name != null) {
			if(totalEvents > 200) {
				repo.updateByFields(organizedBy, totalEvents, phoneNo, orgnName, time, name);
			}
		}
		return false;
		
	}

}
