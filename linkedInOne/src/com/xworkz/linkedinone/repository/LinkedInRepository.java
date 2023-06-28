package com.xworkz.linkedinone.repository;

import com.xworkz.linkedinone.dto.LinkedInDto;

public interface LinkedInRepository {
	
	public boolean save(LinkedInDto dto);

	public boolean updateByEmail(String account, String email);

	public boolean readByEmail(String email);

	public boolean readAll();

	public boolean deleteByIdAndEmail(String founder, int id, String email);

	public boolean readByIdAndEmail(String cEOName, int id, String emailId);

}
