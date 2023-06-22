package com.xworkz.electronicgadgets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ReadGadgets {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class found");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		try {
			String query = "select * from electronicgadgets_info where id = 10";
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/electronics", "root",
					"Xworkzodc@123");

			Statement statement = connection.createStatement();

			ResultSet result = statement.executeQuery(query);
			System.out.println(result);

			if (result != null) {
				while (result.next()) {
					System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString(3) + " "
							+ result.getInt(4) + " " + result.getString(5) + " " + result.getInt(6) + " "
							+ result.getString(7) + " " + result.getInt(8) + " " + result.getString(9) + " "
							+ result.getString(10));
				}
			}

			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
