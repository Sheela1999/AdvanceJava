package com.xworkz.nation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class NationRunner {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class Found");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nation", "root", "Xworkzodc@123");

			String query = "insert into nation_info values(20, 'Angola', 'Joao Manuel', 'Giant Sable Antelope', 8649798, 'WELWITSCHIA', 'Football', 'red-crested turaco', 3678921, 'President of the Republic')";

			Statement stm = con.createStatement();

			int exe = stm.executeUpdate(query);
			System.out.println("effected rows:" + exe);

			con.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
