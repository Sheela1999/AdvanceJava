package com.xworkz.facebook.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.facebook.dto.FacebookDto;

public class FacebookRepositoryImpl implements FacebookRepository {

	@Override
	public boolean save(FacebookDto dto) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook", "root", "Xworkzodc@123");
		System.out.println(connection);
		
		String query = "insert into reg_info values(?,?,?,?,?,?,?,?)";
		
		PreparedStatement statement = connection.prepareStatement(query);
		
		statement.setInt(1, dto.getId());
		statement.setString(2, dto.getFirstName());
		statement.setString(3, dto.getLastName());
		statement.setString(4, dto.getDateOfBirth());
		statement.setString(5, dto.getEmail());
		statement.setLong(6, dto.getPhoneNumber());
		statement.setString(7, dto.getGender());
		statement.setString(8, dto.getPassword());
		
		int i = statement.executeUpdate();
		System.out.println("effected rows:" +i);
		
        connection.close();
		
		if(i>0) {
			System.out.println("records inserted");
		}else {
			System.out.println("records are inserted");
		}
		
		return false;
	}

	@Override
	public boolean update(FacebookDto dto, int id) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook", "root", "Xworkzodc@123");
		
		String query = "update reg_info set firstName=?,lastName=?,dateOfBirth=?,email=?,phoneNumber=?,gender=?,password=? where id=?";
		
		PreparedStatement statement = connection.prepareStatement(query);
		
		statement.setString(1, dto.getFirstName());
		statement.setString(2, dto.getLastName());
		statement.setString(3, dto.getDateOfBirth());
		statement.setString(4, dto.getEmail());
		statement.setLong(5, dto.getPhoneNumber());
		statement.setString(6, dto.getGender());
		statement.setString(7, dto.getPassword());
		statement.setInt(8, id);
		
		int i = statement.executeUpdate();
		System.out.println("effected rows:" +i);
		
		if(i>0) {
			System.out.println("records updated");
		}else {
			System.out.println("records are updated");
		}
		
		connection.close();
		
		return false;
	}

	@Override
	public boolean readAll() throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook", "root", "Xworkzodc@123");
		
		String query = "select * from reg_info";
		
		PreparedStatement statement = connection.prepareStatement(query);
		
		ResultSet set = statement.executeQuery();
		
		if(set != null) {
			while(set.next()) {
				System.out.println(set.getInt(1) + " " + set.getString(2) + " " + set.getString(3) + " " + set.getString(4) 
				+ " " + set.getString(5) + " " + set.getLong(6) + " " +set.getString(7) + " " + set.getString(8));
			}
		}
		
		connection.close();
		
		return false;
	}

	@Override
	public boolean delete(int id) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook", "root", "Xworkzodc@123");
		
		String query = "delete from reg_info where id=?";
		
		PreparedStatement statement = connection.prepareStatement(query);
		
		statement.setInt(1, id);
		
		int i = statement.executeUpdate();
		System.out.println("effected rows:" +i);
		
		connection.close();
		
		return false;
	}

	@Override
	public boolean updateByEmail(String firstName, String email) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook", "root", "Xworkzodc@123");
		
		String query = "update reg_info set firstName=? where email=?";
		
		PreparedStatement statement = connection.prepareStatement(query);
		
		statement.setString(1, firstName);
		statement.setString(2, email);
		
		int i = statement.executeUpdate();
		System.out.println("effected rows:" +i);
		
		connection.close();
		
		if(i>0) {
			System.out.println("records updated");
		}else {
			System.out.println("records are updated");
		}
		connection.close();
		return false;
	}

	@Override
	public boolean readByEmail(String email) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook", "root", "Xworkzodc@123");
		
		String query = "select * from reg_info where email=?";
		
		PreparedStatement statement = connection.prepareStatement(query);
		
		statement.setString(1, email);
		
		ResultSet set = statement.executeQuery();
		
		if(set != null) {
			while(set.next()) {
				System.out.println(set.getInt(1) + " " + set.getString(2) + " " + set.getString(3) + " " + set.getString(4) 
				+ " " + set.getString(5) + " " + set.getLong(6) + " " +set.getString(7) + " " + set.getString(8));
			}
		}
		
		connection.close();
		return false;
	}

	@Override
	public boolean deleteByEmail(String email) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/facebook", "root", "Xworkzodc@123");
		
		String query = "delete from reg_info where email=?";
		
		PreparedStatement statement = connection.prepareStatement(query);
		
		statement.setString(1, email);
		
		int i = statement.executeUpdate();
		System.out.println("effected rows:" +i);
		
		connection.close();
		
		return false;
	}

}
