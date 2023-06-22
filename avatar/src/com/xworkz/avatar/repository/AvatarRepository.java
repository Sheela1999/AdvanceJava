package com.xworkz.avatar.repository;

import com.xworkz.avatar.dto.AvatarDTO;

public interface AvatarRepository {
	
	public boolean save(AvatarDTO dto);
	//boolean update(String skills);
	//boolean update(String skills, int id);
	boolean update(AvatarDTO dto, int id);
	

}
