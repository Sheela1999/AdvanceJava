package com.xworkz.avatar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadRunner {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/avatar", "root",
					"Xworkzodc@123");
			System.out.println(connect);
			System.out.println("Database is connected");

			String quary = "Select*from avatar_info";

			Statement stament = connect.createStatement();
			ResultSet set = stament.executeQuery(quary);
			if (set != null) {
				while (set.next()) {
					System.out.println(
							set.getInt(1) + "  " + set.getString(2) + "  " + set.getInt(3) + "  " + set.getString(4)
									+ "  " + set.getString(5) + "  " + set.getBoolean(6) + "  " + set.getInt(7) + "  "
									+ set.getString(8) + "  " + set.getString(9) + "  " + set.getString(10));
				}
			}

			connect.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
