package com.xworkz.avatar.service;

import com.xworkz.avatar.dto.AvatarDTO;
import com.xworkz.avatar.repository.AvatarRepositoryImpl;

public class AvatarServiceImpl implements AvatarService {

	AvatarRepositoryImpl repo = new AvatarRepositoryImpl();
	
	@Override
	public boolean validateAndSave(AvatarDTO dto) {
		System.out.println("validated and saved");
		repo.save(dto);
		return true;
	}

	@Override
	public boolean update(AvatarDTO dto, int id) {
		System.out.println("update dto");
		if(dto != null) {
			if(id != 0) {
				repo.update(dto, id);
			}
		}
		return false;
	}

	
	


}
