package com.xworkz.avatar.service;

import com.xworkz.avatar.dto.AvatarDTO;

public interface AvatarService {
	
	 public boolean validateAndSave(AvatarDTO dto);
	 
	 boolean update(AvatarDTO dto, int id);
		 

}
