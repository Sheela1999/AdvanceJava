package com.xworkz.hirect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HirectRunner {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class Found");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/feb20", "root", "Xworkzodc@123");

			String query = "insert into resume_info values(4, 'Gowri', 'BCA', 'Python', 'gowramma@gmail.com')";

			Statement stm = con.createStatement();

			int exe = stm.executeUpdate(query);
			System.out.println("effected rows:" + exe);

			con.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
