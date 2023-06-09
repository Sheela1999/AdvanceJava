package com.xworkz.studentproject.dao;

import java.util.HashMap;

import com.xworkz.studentproject.dto.StudentDto;

public interface StudentDao {

	public boolean save(Integer key, StudentDto dto);

	public StudentDto find(Integer key);

	public boolean delete(Integer key);

	public HashMap<Integer, StudentDto> readAll();

}
