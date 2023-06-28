package com.xworkz.linkedinone;

import java.sql.Date;

import com.xworkz.linkedinone.dto.LinkedInDto;
import com.xworkz.linkedinone.service.LinkedInService;
import com.xworkz.linkedinone.service.LinkedInServiceImpl;

public class LinkedInRunner {

	public static void main(String[] args) {

		LinkedInDto dto = new LinkedInDto();

		Date date = new Date(11, 05, 2003);

		dto.setId(1);
		dto.setcEO(" Ryan Roslansky");
		dto.setFounders(" Reid Hoffman");
		dto.setParentOrganization("Microsoft Corporation");
		dto.setHeadquarters("California, United States");
		dto.setMembers(1910000000);
		dto.setLaunchDate(date);
		dto.setTypesOfPeople("The Careerist");
		dto.setUseOfLinkedIn("Job Search");
		dto.setDownloadingWebsite("Playstore");
		dto.setLearningSkills("Certification Course");
		dto.setRegCountries(200);
		dto.setSubsidiaries("Glint Inc");
		dto.setLinkedInAccount("Sheela");
		dto.setTypeOfAds("Corporate");
		dto.setEmailId("sheela@gamil.com");

		LinkedInService service = new LinkedInServiceImpl();

		 //service.save(dto);

		 service.readByEmail("sheela@gamil.com");

		 //service.readByIdAndEmail("Ashish", 6, "mahalinked@gamil.com");

		 //service.updateByEmail("Aish", "sheelalinked@gamil.com");

		//service.deleteByIdAndEmail("Reid Hoffman", 2, "sheelalinked@gamil.com");

		 //service.readAll();

	}

}
