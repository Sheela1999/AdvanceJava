package com.xworkz.studentproject.dao;

import java.util.HashMap;

import com.xworkz.studentproject.dto.StudentDto;

public class StudentDaoImpl implements StudentDao {

	HashMap<Integer, StudentDto> map = new HashMap<Integer, StudentDto>();

	@Override
	public boolean save(Integer key, StudentDto dto) {
		map.put(key, dto);
		System.out.println("Dto is saved");
		return true;
	}

	@Override
	public StudentDto find(Integer key) {
		StudentDto s = map.get(key);
		return s;
	}

	@Override
	public boolean delete(Integer key) {
		map.remove(key);
		return true;
	}

	@Override
	public HashMap<Integer, StudentDto> readAll() {
		return map;

	}

}
