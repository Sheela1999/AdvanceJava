package com.xworkz.linkedinone.service;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ValidatorFactory;

import com.xworkz.linkedinone.dto.LinkedInDto;
import com.xworkz.linkedinone.repository.LinkedInRepositoryImpl;

public class LinkedInServiceImpl implements LinkedInService {
	
	LinkedInRepositoryImpl repo = new LinkedInRepositoryImpl();

	@Override
	public boolean save(LinkedInDto dto) {
		System.out.println("saved..");
		
		ValidatorFactory factory = javax.validation.Validation.buildDefaultValidatorFactory();
		javax.validation.Validator validator = factory.getValidator();
		 Set<ConstraintViolation<LinkedInDto>> violation =validator.validate(dto);
		
		if (violation.isEmpty()) {
			boolean save = repo.save(dto);
			System.out.println(save);
		}else {
			System.out.println("Error");
			System.out.println(violation);
		}
		return false;
	}

	@Override
	public boolean updateByEmail(String account, String email) {
		System.out.println("updated by email");
		if (account != null) {
			if (email != null) {
				repo.updateByEmail(account, email);
			}
		}
		return false;
	}

	@Override
	public boolean readByEmail(String email) {
		//System.out.println("read by email");
			if (email != null) {
				repo.readByEmail(email);
			}
		return false;
	}

	@Override
	public boolean readAll() {
		boolean read = repo.readAll();
		System.out.println(read);
		return true;
	}

	@Override
	public boolean deleteByIdAndEmail(String founder, int id, String email) {
		if (founder != null) {
			if (id > 0) {
				if (email != null) {
					repo.deleteByIdAndEmail(founder, id, email);
				}
			}
		}
		return false;
	}

	@Override
	public boolean readByIdAndEmail(String cEOName, int id, String emailId) {
		if (cEOName != null) {
			if (id > 0) {
				if (emailId != null) {
					repo.readByIdAndEmail(cEOName, id, emailId);
				}
			}
		}
		return false;
	}


}
