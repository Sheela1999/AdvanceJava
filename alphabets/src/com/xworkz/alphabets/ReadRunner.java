package com.xworkz.alphabets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadRunner {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class found");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		try {
			String query = "select * from alpha_info where id = 15";
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/alpha", "root",
					"Xworkzodc@123");

			Statement statement = connection.createStatement();

			ResultSet result = statement.executeQuery(query);
			System.out.println(result);

			if (result != null) {
				while (result.next()) {
					System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString(3) + " "
							+ result.getString(4) + " " + result.getInt(5) + " " + result.getString(6) + " "
							+ result.getString(7) + " " + result.getInt(8) + " " + result.getInt(9) + " "
							+ result.getString(10));
				}
			}

			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
