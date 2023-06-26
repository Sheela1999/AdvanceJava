package com.xworkz.eventorganization;

import com.xworkz.eventorganization.dto.EventOrgnDTO;
import com.xworkz.eventorganization.service.EventOrgnService;
import com.xworkz.eventorganization.service.EventOrgnServiceImpl;

public class EventOrgnRunner {

	public static void main(String[] args) {

		EventOrgnDTO dto = new EventOrgnDTO();

		dto.setId(2);
		dto.setEventName("Marraige Fun");
		dto.setOrgnName("WeddingDhamaka");
		dto.setOrganizedBy("Aishu");
		dto.setDate("25-09-2022");
		dto.setTime("5 AM");
		dto.setBudget(200000);
		dto.setEventCategory("Family Func");
		dto.setEventDuration("12 Hours");
		dto.setExpectedPeople(900);
		dto.setRank(20);
		dto.setLocation("Jayanagara");
		dto.setEmailId("wedding@gmail.com");
		dto.setPhoneNo(3890654421l);
		dto.setTotalEvents(90);

		EventOrgnService service = new EventOrgnServiceImpl();

		// service.save(dto);

		service.update(dto, 2);

		//service.updateById(60000, 1);

		//service.updateByName("Vijayanagara", "Marraige");
		
		//service.updateByEmaiId(800, "wonder@gmail.com");
		
		//service.updateByFields("Shriya", 200, 4567890123l, "CorpoEvent", "12 AM", "Seminar");
	}

}
