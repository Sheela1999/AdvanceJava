package com.xworkz.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExampleRunner {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class Found");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/example", "root",
					"Xworkzodc@123");
			System.out.println(con);

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
