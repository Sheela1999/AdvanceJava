package com.xworkz.indeed;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadIndeedRunner {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/indeed", "root", "Xworkzodc@123");
			// System.out.println(con);

			String query = "select * from jobseeker_info";

			Statement stm = con.createStatement();

			ResultSet set = stm.executeQuery(query);
			System.out.println(set);

			if (set != null) {
				while (set.next()) {
					System.out.println(set.getInt(1) + " " + set.getString(2) + " " + set.getString(3) + " "
							+ set.getInt(4) + " " + set.getLong(5) + " " + set.getString(6) + " " + set.getInt(7) + " "
							+ set.getString(8) + " " + set.getString(9) + " " + set.getDate(10));
				}
			}

			con.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
