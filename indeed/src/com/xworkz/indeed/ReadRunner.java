package com.xworkz.indeed;

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
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/indeed", "root",
					"Xworkzodc@123");
			System.out.println(connect);
			System.out.println("Driver is Connected");

			String quary = "Select * from jobseeker_info where id = 1 or name ='Aishu' or qualification = 'Bsc' ";

			Statement statment = connect.createStatement();
			ResultSet set = statment.executeQuery(quary);

			if (set != null) {
				while (set.next()) {
					System.out.println(set.getInt(1) + " " + set.getString(2) + " " + set.getString(3) + " "
							+ set.getInt(4) + " " + set.getLong(5) + " " + set.getString(6) + " " + set.getInt(7) + " "
							+ set.getString(8) + " " + set.getString(9) + " " + set.getDate(10));
				}
			}
			connect.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
