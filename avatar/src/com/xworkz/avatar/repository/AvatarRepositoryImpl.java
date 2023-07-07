package com.xworkz.avatar.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.avatar.dto.AvatarDTO;

public class AvatarRepositoryImpl implements AvatarRepository {

	@Override
	public boolean save(AvatarDTO dto) {
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				
				e.printStackTrace();
			}
			
			try {
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/avatar", "root", "Xworkzodc@123");
				
	            String query = "insert into avatar_info values(?,?,?,?,?,?,?,?,?,?)";
	            System.out.println(query);
	            
	            PreparedStatement stm = con.prepareStatement(query);
	            System.out.println("before executing:" + stm);
	            
	            stm.setInt(1, dto.getId());
	            stm.setString(2, dto.getActors());
	            stm.setInt(3, dto.getAge());
	            stm.setString(4, dto.getDateOfbirth());
	            stm.setString(5, dto.getNationality());
	            stm.setBoolean(6, dto.isMarriageStatus());
	            stm.setInt(7, dto.getTotalMovies());
	            stm.setString(8, dto.getFirstMovie());
	            stm.setString(9, dto.getLastMovie());
	            stm.setString(10, dto.getCharName());
	            
	            int i = stm.executeUpdate();
	            System.out.println("after executing:" + stm);
	            
	            con.commit();
	            con.close();
	            
	            if(i>0) {
	            	System.out.println("records inserted");
	            }
	            else {
	            	System.out.println("records are not inserted");
	            }
	            
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		
		return false;
	}

	@Override
	public boolean update(AvatarDTO dto, int id) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/avatar", "root", "Xworkzodc@123");
			
			String query = "update avatar_info set actors = ?, age = ?, dateOfBirth =?, nationality=?, marriageStatus=?, totalMovies=?, firstMovie=?, lastMovie=?, charName=? where id = ?";
			
			PreparedStatement pstm = con.prepareStatement(query);
			
			pstm.setString(1, dto.getActors());
			pstm.setInt(2, dto.getAge());
			pstm.setString(3, dto.getDateOfbirth());
			pstm.setString(4, dto.getNationality());
			pstm.setBoolean(5, dto.isMarriageStatus());
			pstm.setInt(6, dto.getTotalMovies());
			pstm.setString(7, dto.getFirstMovie());
			pstm.setString(8, dto.getLastMovie());
			pstm.setString(9, dto.getCharName());
			pstm.setInt(10, id);
			
			
			 int i = pstm.executeUpdate();
	            System.out.println("effected rows:" + i);
	            
	            con.close();
			 
            if(i>0) {
            	System.out.println("record updated");
            }
            else {
            	System.out.println("record not updated");
            }
            con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

 
	

}
