package com.xworkz.linkedIn.service;

import com.xworkz.linkedIn.dto.LinkedInDto;

public interface LinkedInService {

	public boolean save(LinkedInDto dto);

	public boolean updateByEmail(String account, String email);

	public boolean readByEmail(int regCountries, String email);

	public boolean readAll();

	public boolean deleteByIdAndEmail(String founder, int id, String email);

	public boolean readByIdAndEmail(String cEOName, int id, String emailId);

}
