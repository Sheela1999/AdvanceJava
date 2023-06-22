package com.xworkz.indeed;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class IndeedRunner {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/indeed", "root", "Xworkzodc@123");
			System.out.println(con);

			String query = "insert into jobseeker_info values(10, 'Sathish G', 'BE', 25, 7290890692, 'satish@gmail.com', 2022, 'Spring', 'TN', '2003-02-20')";

			Statement stm = con.createStatement();

			int i = stm.executeUpdate(query);
			System.out.println("effected rows:" + i);

			con.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
