package com.xworkz.facebook.service;

import java.sql.SQLException;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.facebook.dto.FacebookDto;
import com.xworkz.facebook.repository.FacebookRepositoryImpl;

public class FacebookServiceImpl implements FacebookService {

	FacebookRepositoryImpl repo = new FacebookRepositoryImpl();

	@Override
	public boolean save(FacebookDto dto) throws ClassNotFoundException, SQLException {
		System.out.println("saved...");

		if(dto.getPhoneNumber()>0 && dto.getPhoneNumber()>=10) {

			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator validator = factory.getValidator();
			Set<ConstraintViolation<FacebookDto>> violation = validator.validate(dto);

			if (violation.isEmpty()) {
				boolean save = repo.save(dto);
                System.out.println(save);
			} 
		else {
				System.out.println("Error");
				System.out.println(violation);
			}
		}
		else {
			System.out.println("phone no is not valid");
		}
		return false;
	}

	@Override
	public boolean update(FacebookDto dto, int id) throws ClassNotFoundException, SQLException {

		System.out.println("Updated...");

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<FacebookDto>> violation = validator.validate(dto);

		if (violation.isEmpty()) {
			boolean update = repo.update(dto, id);
			System.out.println(update);
		} else {
			System.out.println("Error");
			System.out.println(violation);
		}

		return false;
	}

	@Override
	public boolean readAll() throws ClassNotFoundException, SQLException {

		boolean read = repo.readAll();
		System.out.println(read);

		return false;
	}

	@Override
	public boolean delete(int id) throws ClassNotFoundException, SQLException {

		boolean dlt = repo.delete(id);
		System.out.println(dlt);

		return false;
	}

	@Override
	public boolean updateByEmail(String firstName, String email) throws ClassNotFoundException, SQLException {
		
		System.out.println("Updated by email");

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();
		Set<ConstraintViolation<String>> violation = validator.validateProperty(firstName, email);

		if (violation.isEmpty()) {
			boolean updated = repo.updateByEmail(firstName, email);
			System.out.println(updated);
		} else {
			System.out.println("Error");
			System.out.println(violation);
		}
		
		return false;
	}

	@Override
	public boolean readByEmail(String email) throws ClassNotFoundException, SQLException {
		repo.readByEmail(email);
		return true;
	}

	@Override
	public boolean deleteByEmail(String email) throws ClassNotFoundException, SQLException {
		repo.deleteByEmail(email);
		return true;
	}

}
