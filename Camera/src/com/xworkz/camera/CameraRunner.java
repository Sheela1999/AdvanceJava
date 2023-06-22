package com.xworkz.camera;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CameraRunner {

	public static void main(String[] args) {

		System.out.println("Hii...");

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
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
