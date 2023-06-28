package com.xworkz.linkedinone.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.linkedinone.dto.LinkedInDto;

public class LinkedInRepositoryImpl implements LinkedInRepository {

	@Override
	public boolean save(LinkedInDto dto) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/linkedin", "root",
					"Xworkzodc@123");

			String query = "insert into linkedin_info values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setInt(1, dto.getId());
			statement.setString(2, dto.getcEO());
			statement.setString(3, dto.getFounders());
			statement.setString(4, dto.getParentOrganization());
			statement.setString(5, dto.getHeadquarters());
			statement.setLong(6, dto.getMembers());
			statement.setDate(7, dto.getLaunchDate());
			statement.setString(8, dto.getTypesOfPeople());
			statement.setString(9, dto.getUseOfLinkedIn());
			statement.setString(10, dto.getDownloadingWebsite());
			statement.setString(11, dto.getLearningSkills());
			statement.setInt(12, dto.getRegCountries());
			statement.setString(13, dto.getSubsidiaries());
			statement.setString(14, dto.getLinkedInAccount());
			statement.setString(15, dto.getTypeOfAds());
			statement.setString(16, dto.getEmailId());

			int i = statement.executeUpdate();
			System.out.println("effected rows:" + i);

			connection.close();

			if (i > 0) {
				System.out.println("records inserted");
			} else {
				System.out.println("records are not inserted");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateByEmail(String account, String email) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/linkedin", "root",
					"Xworkzodc@123");

			String query = "update linkedin_info set linkedInAccount = ? where emailId = ?";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, account);
			statement.setString(2, email);

			int i = statement.executeUpdate();
			System.out.println("effected rows:" + i);

			connection.close();

			if (i > 0) {
				System.out.println("record updated");
			} else {
				System.out.println("record not updated");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean readByEmail(String email) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/linkedin", "root",
					"Xworkzodc@123");

			String query = "select * from linkedin_info where emailId=?";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, email);

			ResultSet result = statement.executeQuery();

			if (result != null) {
				while (result.next()) {
					System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString(3) + " "
							+ result.getString(4) + " " + result.getString(5) + " " + result.getLong(6) + " "
							+ result.getDate(7) + " " + result.getString(8) + " " + result.getString(9) + " "
							+ result.getString(10) + " " + result.getString(11) + " " + result.getInt(12) + " "
							+ result.getString(13) + " " + result.getString(14) + " " + result.getString(15) + " "
							+ result.getString(16));
				}
			}

			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean readAll() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/linkedin", "root",
					"Xworkzodc@123");

			String query = "select * from linkedin_info";

			PreparedStatement statement = connection.prepareStatement(query);

			ResultSet result = statement.executeQuery();

			if (result != null) {
				while (result.next()) {
					System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString(3) + " "
							+ result.getString(4) + " " + result.getString(5) + " " + result.getLong(6) + " "
							+ result.getDate(7) + " " + result.getString(8) + " " + result.getString(9) + " "
							+ result.getString(10) + " " + result.getString(11) + " " + result.getInt(12) + " "
							+ result.getString(13) + " " + result.getString(14) + " " + result.getString(15) + " "
							+ result.getString(16));
				}
			}

			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean deleteByIdAndEmail(String founder, int id, String email) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/linkedin", "root",
					"Xworkzodc@123");

			String query = "delete from linkedin_info where founders = ? OR id = ? OR emailId = ?";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, founder);
			statement.setInt(2, id);
			statement.setString(3, email);

			int i = statement.executeUpdate();
			System.out.println("effected rows:" + i);

			connection.close();

			if (i > 0) {
				System.out.println("record deleted");
			} else {
				System.out.println("record not deleted");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean readByIdAndEmail(String cEOName, int id, String emailId) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/linkedin", "root",
					"Xworkzodc@123");

			String query = "select * from linkedin_info where cEO = ? OR id = ? OR emailId = ?";

			PreparedStatement statement = connection.prepareStatement(query);

			statement.setString(1, cEOName);
			statement.setInt(2, id);
			statement.setString(3, emailId);

			ResultSet result = statement.executeQuery();

			if (result != null) {
				while (result.next()) {
					System.out.println(result.getInt(1) + " " + result.getString(2) + " " + result.getString(3) + " "
							+ result.getString(4) + " " + result.getString(5) + " " + result.getLong(6) + " "
							+ result.getDate(7) + " " + result.getString(8) + " " + result.getString(9) + " "
							+ result.getString(10) + " " + result.getString(11) + " " + result.getInt(12) + " "
							+ result.getString(13) + " " + result.getString(14) + " " + result.getString(15) + " "
							+ result.getString(16));
				}
			}

			connection.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}