package com.xworkz.linkedIn;

import java.sql.Date;

import com.xworkz.linkedIn.dto.LinkedInDto;
import com.xworkz.linkedIn.service.LinkedInService;
import com.xworkz.linkedIn.service.LinkedInServiceImpl;

public class LinkedInRunner {

	public static void main(String[] args) {
		
		LinkedInDto dto = new LinkedInDto();
		
		Date date = new Date(23, 05, 2003) ;
		
		dto.setId(4);
		dto.setcEO("Nikitha");
		dto.setFounders("Manoy");
		dto.setParentOrganization("Microsoft Corporation");
		dto.setHeadquarters("M Sunnyvale");
		dto.setMembers(1910000000);
		dto.setLaunchDate(date);
		dto.setTypesOfPeople("");
		dto.setUseOfLinkedIn("Explore Knowledge");
		dto.setDownloadingWebsite("Playstore");
		dto.setLearningSkills("internship on Embedded");
		dto.setRegCountries(210);
		dto.setSubsidiaries("Linked Inc");
		dto.setLinkedInAccount("Pallavi");
		dto.setTypeOfAds("Corporate");
		dto.setEmailId("pallavilinked@gamil.com");
		
		LinkedInService service = new LinkedInServiceImpl();
		
		//service.save(dto);
		
		//service.readByEmail(1, "sheelalinked@gamil.com");
		
		//service.readByIdAndEmail("Ryan Roslansky", 1, "sheelalinked@gamil.com");
		
		//service.updateByEmail("Maha", "sheelalinked@gamil.com");
		
		service.deleteByIdAndEmail("Reid Hoffman", 2, "sheelalinked@gamil.com");
		
		//service.readAll();

	}

}
