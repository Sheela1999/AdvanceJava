package com.xworkz.home;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HomeRunner {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class Found");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/home", "root", "Xworkzodc@123");

			String query = "insert into home_info values(20, 'SahsraNilaya', 'Ballari', 120, 'Karnataka', 6, 'India', 'Shilpa', 'KGF', 'Ballari')";

			Statement stm = con.createStatement();

			int exe = stm.executeUpdate(query);
			System.out.println("effected rows:" + exe);

			con.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
