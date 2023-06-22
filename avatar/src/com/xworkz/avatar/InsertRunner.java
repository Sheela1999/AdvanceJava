package com.xworkz.avatar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertRunner {

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

			String quary = "insert into avatar_info values(10,'HanryChampion',28,'5 April','France',true,5,'Scraem','Avatar','Kiri')";

			Statement statment = connect.createStatement();

			int value = statment.executeUpdate(quary);
			System.out.println("effected row: " + value);

			connect.close();

			System.out.println("Connection closed");

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
