package com.xworkz.linkedIn.repository;

import com.xworkz.linkedIn.dto.LinkedInDto;

public interface LinkedInRepository {

	public boolean save(LinkedInDto dto);

	public boolean updateByEmail(String account, String email);

	public boolean readByEmail(int regCountries, String email);

	public boolean readAll();

	public boolean deleteByIdAndEmail(String founder, int id, String email);

	public boolean readByIdAndEmail(String cEOName, int id, String emailId);

}
