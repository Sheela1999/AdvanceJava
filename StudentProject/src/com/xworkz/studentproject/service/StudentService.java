package com.xworkz.studentproject.service;

import java.util.HashMap;

import com.xworkz.studentproject.dto.StudentDto;

public interface StudentService {

	public boolean save(Integer key, StudentDto dto);

	public StudentDto find(Integer key);

	public boolean delete(Integer key);

	public HashMap<Integer, StudentDto> readAll();

}
