package com.xworkz.facebook.service;

import java.sql.SQLException;

import com.xworkz.facebook.dto.FacebookDto;

public interface FacebookService {

	public boolean save(FacebookDto dto) throws ClassNotFoundException, SQLException;

	public boolean update(FacebookDto dto, int id) throws ClassNotFoundException, SQLException;

	public boolean readAll() throws ClassNotFoundException, SQLException;

	public boolean delete(int id) throws ClassNotFoundException, SQLException;

	public boolean updateByEmail(String firstName, String email) throws ClassNotFoundException, SQLException;

	public boolean readByEmail(String email) throws ClassNotFoundException, SQLException;

	public boolean deleteByEmail(String email) throws ClassNotFoundException, SQLException;

}
