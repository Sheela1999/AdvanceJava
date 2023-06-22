package com.xworkz.hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HospitalRunner {

	public static void main(String[] args) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("class found");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root",
					"Xworkzodc@123");
			// System.out.println(con);

			String query1 = "insert into hospital_info values(1, 'jayadeva', 'BTM', 'Specialty Hospital',1500, 100, 500000000, 'OPD', 'Defibrillation', 'Dr.Sheela G')";
			String query2 = "insert into hospital_info values(2, 'KLEs', 'Belagavi', 'Surgical Hospitals',1000, 200, 600000000, 'SD', 'Ventilator', 'Dr.Prabhakar kore')";
			String query3 = "insert into hospital_info values(3, 'Manipal', 'udupi', 'Psychiatric Hospitals',1200, 300, 500000000, 'SemiUrgent', 'Electrocardiography', 'Dr.Manish B')";
			String query4 = "insert into hospital_info values(4, 'Dhanvanthari', 'JKD', 'Specialty Hospital',500, 400, 100000000, 'RD', 'Stethoscopes', 'Dr.Vinayak')";
			String query5 = "insert into hospital_info values(5, 'SDM', 'Dharwad', 'Teaching Hospitals',1200, 200, 200000000, 'OPD', 'nfusion pump', 'Dr.Satish G')";
			String query6 = "insert into hospital_info values(6, 'jaideva', 'Gulburga', 'Surgical Hospital',1000, 100, 300000000, 'OT', 'Anaesthetic machine', 'Dr.Shilpa H')";
			String query7 = "insert into hospital_info values(7, 'Asur', 'Shivmoga', 'Psychiatric Hospital',800, 200, 400000000, 'Xray', 'Pulse oximetry', 'Dr.Shree G')";
			String query8 = "insert into hospital_info values(8, 'Patil', 'Harugeri', 'Clinic',2500, 300, 500000000, 'Nursing', 'Sphygmomanometer', 'Dr.Mani')";
			String query9 = "insert into hospital_info values(9, 'Govt hospital', 'Mugalkhod', 'Specialty Hospital',1500, 150, 800000000, 'OPD', 'Medical diagnosis', 'Dr.Riya')";
			String query10 = "insert into hospital_info values(10, 'Hukkeri', 'Terdal', 'Psychiatric Hospital',500, 50, 50000000, 'Xray', 'Microscope', 'Dr.Balu')";
			String query11 = "insert into hospital_info values(11, 'jayadeva', 'Bommanalli', 'Specialty Hospital',1500, 100, 500000000, 'OPD', 'Defibrillation', 'Dr.Pallavi')";
			String query12 = "insert into hospital_info values(12, 'Victoriya', 'Belagavi', 'Surgical Hospitals',1000, 200, 1600000000, 'SD', 'Ventilator', 'Dr. Parimala')";
			String query13 = "insert into hospital_info values(13, 'Marigold', 'udupi', 'Psychiatric Hospitals',1200, 300, 400000000, 'SemiUrgent', 'Electrocardiography', 'Dr.Nikitha')";
			String query14 = "insert into hospital_info values(14, 'Dhamani', 'JKD', 'Specialty Hospital',500, 400, 900000000, 'RD', 'Oxygen concentrator', 'Dr. Vinu')";
			String query15 = "insert into hospital_info values(15, 'SDM', 'Dharwad', 'Teaching Hospitals',1200, 200, 1200000000, 'OPD', 'nfusion pump', 'Dr.Satish')";
			String query16 = "insert into hospital_info values(16, 'jaiShiv', 'Gulburga', 'Surgical Hospital',1000, 100, 300000000, 'OT', 'Anaesthetic machine', 'Dr.Mouna N')";
			String query17 = "insert into hospital_info values(17, 'Smile', 'Shivmoga', 'Dental Hospital',800, 200, 400000000, 'Xray', 'Pulse oximetry', 'Dr.Leesa')";
			String query18 = "insert into hospital_info values(18, 'Odeyar', 'Harugeri', 'Clinic',2500, 300, 50000000, 'Nursing', 'Sphygmomanometer', 'Dr.Soumya')";
			String query19 = "insert into hospital_info values(19, 'Govt hospital', 'Hassan', 'Dental Hospital',1500, 150, 800000000, 'OPD', 'Autoclave', 'Dr.Shannu')";
			String query20 = "insert into hospital_info values(20, 'Tanya', 'Hubli', 'SkinCare Hospital',500, 50, 70000000, 'Xray', 'Microscope', 'Dr.Bavani')";

			Statement stm = con.createStatement();

			int i1 = stm.executeUpdate(query1);
			System.out.println("effected rows:" + i1);
			int i2 = stm.executeUpdate(query2);
			System.out.println("effected rows:" + i2);
			int i3 = stm.executeUpdate(query3);
			System.out.println("effected rows:" + i3);
			int i4 = stm.executeUpdate(query4);
			System.out.println("effected rows:" + i4);
			int i5 = stm.executeUpdate(query5);
			System.out.println("effected rows:" + i5);
			int i6 = stm.executeUpdate(query6);
			System.out.println("effected rows:" + i6);
			int i7 = stm.executeUpdate(query7);
			System.out.println("effected rows:" + i7);
			int i8 = stm.executeUpdate(query8);
			System.out.println("effected rows:" + i8);
			int i9 = stm.executeUpdate(query9);
			System.out.println("effected rows:" + i9);
			int i10 = stm.executeUpdate(query10);
			System.out.println("effected rows:" + i10);
			int i11 = stm.executeUpdate(query11);
			System.out.println("effected rows:" + i11);
			int i12 = stm.executeUpdate(query12);
			System.out.println("effected rows:" + i12);
			int i13 = stm.executeUpdate(query13);
			System.out.println("effected rows:" + i13);
			int i14 = stm.executeUpdate(query14);
			System.out.println("effected rows:" + i14);
			int i15 = stm.executeUpdate(query15);
			System.out.println("effected rows:" + i15);
			int i16 = stm.executeUpdate(query16);
			System.out.println("effected rows:" + i16);
			int i17 = stm.executeUpdate(query17);
			System.out.println("effected rows:" + i17);
			int i18 = stm.executeUpdate(query18);
			System.out.println("effected rows:" + i18);
			int i19 = stm.executeUpdate(query19);
			System.out.println("effected rows:" + i19);
			int i20 = stm.executeUpdate(query20);
			System.out.println("effected rows:" + i20);

			if (i1 > 0) {
				System.out.println("inserted Successfully");
			} else {
				System.out.println("not inserted");
			}

			con.close();

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

}
