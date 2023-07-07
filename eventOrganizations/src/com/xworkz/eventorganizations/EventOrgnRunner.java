package com.xworkz.eventorganizations;

import com.xworkz.eventorganizations.dto.EventOrgnDTO;
import com.xworkz.eventorganizations.service.EventOrgnService;
import com.xworkz.eventorganizations.service.EventOrgnServiceImpl;

public class EventOrgnRunner {

	public static void main(String[] args) {

		EventOrgnDTO dto = new EventOrgnDTO();

		dto.setId(2);
		dto.setEventName("MarryMe");
		dto.setOrgnName("Wedding Hall");
		dto.setOrganizedBy("Sheela");
		dto.setDate("11-11-2024");
		dto.setTime("6 AM");
		dto.setBudget(300000);
		dto.setEventCategory("Marraige");
		dto.setEventDuration("18 hours");
		dto.setExpectedPeople(800);
		dto.setRank(10);
		dto.setLocation("Belagavi");
		dto.setEmailId("marry@gmail.com");
		dto.setPhoneNo(2890654420l);
		dto.setTotalEvents(500);

		EventOrgnService service = new EventOrgnServiceImpl();

		// service.save(dto);

		boolean up = service.update(dto);
		System.out.println(up);

		// service.updateById(70000, 1);

		// service.updateByName("Electronic City", "Birthday party");

		// service.updateByEmaiId(1500, "wonder@gmail.com");

		// service.updateByFields("Shanaya", 300, 3567890123l, "CorporateEvent", "10
		// AM", "Seminar");

	}

}
