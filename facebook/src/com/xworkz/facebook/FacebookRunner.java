package com.xworkz.facebook;

import java.sql.SQLException;

import com.xworkz.facebook.dto.FacebookDto;
import com.xworkz.facebook.service.FacebookService;
import com.xworkz.facebook.service.FacebookServiceImpl;

public class FacebookRunner {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		FacebookDto dto = new FacebookDto();
		
		dto.setId(7);
		dto.setFirstName("Aishu");
		dto.setLastName("Naik");
		dto.setDateOfBirth("13-09-1999");
		dto.setEmail("aishu@gmail.com");
		dto.setPhoneNumber(4834567890l);
		dto.setGender("Female");
		dto.setPassword("aish@1234567");
		
		FacebookService service = new FacebookServiceImpl();
		
		//boolean saved = service.save(dto);
		//System.out.println(saved);
		
		service.update(dto, 1);
		
		//service.readAll();
		//service.delete(3);
		
		//service.updateByEmail("SheelaG", "sheela@gmail.com");
		
		//service.readByEmail("pallavi@gmail.com");
		
		//service.deleteByEmail("pallavi@gmail.com");

	}

}
