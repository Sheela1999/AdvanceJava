package com.xworkz.novel;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.novel.dto.NovelDto;

public class NovelReader {
    
	private static Credentials credentials;
	
	public static void main(String[] args) {
		NovelDto dto = new NovelDto(1, "Wise and OtherWise", "Sudha Murhty", "2005");
		NovelDto dto1 = new NovelDto(2, "It Happens For a Reason", "Preethi Shenoy", "2018");
		
//		boolean saving = save(dto1);
//		System.out.println(saving);
		
		boolean deleted = deleteByName("Wise and OtherWise");
        System.out.println(deleted);
	}
	
	public static boolean save(NovelDto dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection connection = DriverManager.getConnection(Credentials.URL.name, Credentials.USER.name, Credentials.PASSWORD.name);
			String query = "insert into novel_info values(?,?,?,?)";
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getName());
			statement.setString(3, dto.getAuthor());
			statement.setString(4, dto.getPublishedOn());
			
            int i = statement.executeUpdate();
			System.out.println("effected rows" + i);
			
			if(i>0) {
				System.out.println("data inserted");
			}else {
				System.out.println("data not inserted");
			}
			connection.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return true;
	}
	
	public static boolean deleteByName(String name) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			Connection connection = DriverManager.getConnection(Credentials.URL.name, Credentials.USER.name, Credentials.PASSWORD.name);
			String query = "delete from novel_info where name=?";
			
			PreparedStatement stm = connection.prepareStatement(query);
			stm.setString(1, name);
			
			int i = stm.executeUpdate();
			System.out.println("effected rows" + i);
			

			if(i>0) {
				System.out.println("data deleted");
			}else {
				System.out.println("data not deleted");
			}
			connection.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return true;
		
	}


}
