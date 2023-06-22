package com.xworkz.electronicgadgets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GadgetsRunner {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class Found");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/electronics", "root",
					"Xworkzodc@123");

			String query = "insert into electronicgadgets_info values(20, 'SmartPhone', 'Vivo', 19000, 'Peach', 2, '90%', 1606, '128GB', '#9832')";

			Statement stm = con.createStatement();

			int exe = stm.executeUpdate(query);
			System.out.println("effected rows:" + exe);

			con.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
