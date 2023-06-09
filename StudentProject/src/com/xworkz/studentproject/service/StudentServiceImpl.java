package com.xworkz.studentproject.service;

import java.util.HashMap;

import com.xworkz.studentproject.dao.StudentDaoImpl;
import com.xworkz.studentproject.dto.StudentDto;

public class StudentServiceImpl implements StudentService {

	StudentDaoImpl dao = new StudentDaoImpl();

	@Override
	public boolean save(Integer key, StudentDto dto) {
		if (dto != null) {
			if (dto.getName() != null) {
				if (dto.getName().length() > 3) {
					if (dto.getAge() > 15) {
						System.out.println("save method is Validated");
						dao.save(key, dto);
					}
					System.out.println("Age is not valid");
					return false;
				}
				System.out.println("name is valid");
				return false;
			}
			System.out.println("name is null");
			return false;
		}
		System.out.println("dto is null");
		return false;
	}

	@Override
	public StudentDto find(Integer key) {
		if (key != 0) {
			return dao.find(key);
		}
		return null;
	}

	@Override
	public boolean delete(Integer key) {
		if (key != 0) {
			return dao.delete(key);
		}
		return false;
	}

	@Override
	public HashMap<Integer, StudentDto> readAll() {
		return dao.readAll();
	}

}
