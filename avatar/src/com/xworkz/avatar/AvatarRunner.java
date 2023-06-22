package com.xworkz.avatar;

import com.xworkz.avatar.dto.AvatarDTO;
import com.xworkz.avatar.service.AvatarService;
import com.xworkz.avatar.service.AvatarServiceImpl;

public class AvatarRunner {

	public static void main(String[] args) {
		
		AvatarDTO dto = new AvatarDTO();
		
		dto.setId(13);
		dto.setActors("Nikitha");
		dto.setAge(22);
		dto.setDateOfbirth("June 10");
		dto.setNationality("Shivmoga");
		dto.setMarriageStatus(false);
		dto.setTotalMovies(1);
		dto.setFirstMovie("AnyOneCanReadYourMind");
		dto.setLastMovie("MyNameWithYou");
		dto.setCharName("Actress");
		
		AvatarService service = new AvatarServiceImpl();
		
		//service.validateAndSave(dto);
		service.update(dto, 13);
		

	}

}
