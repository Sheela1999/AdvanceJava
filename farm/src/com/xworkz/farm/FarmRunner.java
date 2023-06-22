package com.xworkz.farm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FarmRunner {

	public static void main(String[] args) {

		try {
			// loading the driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class found");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		try {
			// connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/crops", "root", "Xworkzodc@123");

			// writing Query
			String query = "insert into crop_info values(3, 'Corn', 'BTM')";

			// creating statement object
			Statement stm = con.createStatement();

			// executing statement to get the result
			// boolean insert = stm.execute(query);

			int i = stm.executeUpdate(query);
			System.out.println("effected rows:" + i);

			// System.out.println(insert);

			// close the connection
			con.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
