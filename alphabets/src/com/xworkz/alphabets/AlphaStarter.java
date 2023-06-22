package com.xworkz.alphabets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class AlphaStarter {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class Found");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/alpha", "root", "Xworkzodc@123");

			// String query = "insert into alpha_info values(1, 'A', 'a', 'Z', 26, 'b', 'A',
			// 65, 97, 'S')";
			// String query = "insert into alpha_info values(2, 'B', 'b', 'Y', 25, 'c', 'E',
			// 66, 98, 'A')";
			// String query = "insert into alpha_info values(3, 'C', 'c', 'X', 24, 'd', 'I',
			// 67, 99, 'P')";
			// String query = "insert into alpha_info values(4, 'D', 'd', 'W', 23, 'f', 'O',
			// 68, 100, 'N')";
			String query = "insert into alpha_info values(5, 'E', 'e', 'V', 22, 'g', 'U', 69, 101, 'G')";
			String query6 = "insert into alpha_info values(6, 'F', 'f', 'U', 21, 'h', 'A', 70, 102, 'U')";
			String query7 = "insert into alpha_info values(7, 'G', 'g', 'T', 20, 'j', 'E', 71, 103, 'N')";
			String query8 = "insert into alpha_info values(8, 'H', 'h', 'S', 19, 'k', 'I', 72, 104, 'S')";
			String query9 = "insert into alpha_info values(9, 'I', 'i', 'R', 18, 'l', 'O', 73, 105, 'P')";
			String query10 = "insert into alpha_info values(10, 'J', 'j', 'Q', 17, 'm', 'U', 74, 106, 'N')";
			String query11 = "insert into alpha_info values(11, 'K', 'k', 'P', 16, 'm', 'A', 75, 107, 'M')";
			String query12 = "insert into alpha_info values(12, 'L', 'l', 'O', 15, 'p', 'E', 76, 108, 'W')";
			String query13 = "insert into alpha_info values(13, 'M', 'm', 'N', 14, 'q', 'I', 78, 109, 'V')";
			String query14 = "insert into alpha_info values(14, 'N', 'n', 'M', 13, 'r', 'O', 79, 110, 'U')";
			String query15 = "insert into alpha_info values(15, 'O', 'o', 'L', 12, 's', 'U', 80, 111, 'T')";
			String query16 = "insert into alpha_info values(16, 'p', 'p', 'k', 11, 't', 'A', 81, 112, 'S')";
			String query17 = "insert into alpha_info values(17, 'Q', 'q', 'J', 10, 'v', 'E', 82, 113, 'R')";
			String query18 = "insert into alpha_info values(18, 'R', 'r', 'I', 9, 'w', 'I', 83, 115, 'Q')";
			String query19 = "insert into alpha_info values(19, 'S', 's', 'H', 8, 'x', 'O', 84, 116, 'P')";
			String query20 = "insert into alpha_info values(20, 'T', 't', 'G', 7, 'y', 'U', 85, 117, 'Z')";

			Statement stm = con.createStatement();

			int exe = stm.executeUpdate(query);
			System.out.println("effected rows:" + exe);
			int exe6 = stm.executeUpdate(query6);
			System.out.println("effected rows:" + exe6);
			int exe7 = stm.executeUpdate(query7);
			System.out.println("effected rows:" + exe7);
			int exe8 = stm.executeUpdate(query8);
			System.out.println("effected rows:" + exe8);
			int exe9 = stm.executeUpdate(query9);
			System.out.println("effected rows:" + exe9);
			int exe10 = stm.executeUpdate(query10);
			System.out.println("effected rows:" + exe10);
			int exe11 = stm.executeUpdate(query11);
			System.out.println("effected rows:" + exe11);
			int exe12 = stm.executeUpdate(query12);
			System.out.println("effected rows:" + exe12);
			int exe13 = stm.executeUpdate(query13);
			System.out.println("effected rows:" + exe13);
			int exe14 = stm.executeUpdate(query14);
			System.out.println("effected rows:" + exe14);
			int exe15 = stm.executeUpdate(query15);
			System.out.println("effected rows:" + exe15);
			int exe16 = stm.executeUpdate(query16);
			System.out.println("effected rows:" + exe16);
			int exe17 = stm.executeUpdate(query17);
			System.out.println("effected rows:" + exe17);
			int exe18 = stm.executeUpdate(query18);
			System.out.println("effected rows:" + exe18);
			int exe19 = stm.executeUpdate(query19);
			System.out.println("effected rows:" + exe19);
			int exe20 = stm.executeUpdate(query20);
			System.out.println("effected rows:" + exe20);

			con.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
