package com.xworkz.eventorganizations.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.eventorganizations.dto.EventOrgnDTO;

public class EventOrgnRepositoryImpl implements EventOrgnRepository {

	@Override
	public boolean save(EventOrgnDTO dto) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_orgn", "root",
					"Xworkzodc@123");

			String query = "insert into events_info values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

			PreparedStatement stm = con.prepareStatement(query);

			stm.setInt(1, dto.getId());
			stm.setString(2, dto.getEventName());
			stm.setString(3, dto.getOrgnName());
			stm.setString(4, dto.getOrganizedBy());
			stm.setString(5, dto.getDate());
			stm.setString(6, dto.getTime());
			stm.setInt(7, dto.getBudget());
			stm.setString(8, dto.getEventCategory());
			stm.setString(9, dto.getEventDuration());
			stm.setInt(10, dto.getExpectedPeople());
			stm.setInt(11, dto.getRank());
			stm.setString(12, dto.getLocation());
			stm.setString(13, dto.getEmailId());
			stm.setLong(14, dto.getPhoneNo());
			stm.setInt(15, dto.getTotalEvents());

			int i = stm.executeUpdate();
			System.out.println("effected rows:" + i);

			con.close();

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
	public boolean updateById(int budget, int id) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_orgn", "root",
					"Xworkzodc@123");

			String query = "update events_info set budget=? where id = ? ";

			PreparedStatement stm = con.prepareStatement(query);

			stm.setInt(1, budget);
			stm.setInt(2, id);

			int i = stm.executeUpdate();
			System.out.println("effected rows:" + i);

			con.close();

			if (i > 0) {
				System.out.println("records updated");
			} else {
				System.out.println("records are not updated");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return false;

	}

	@Override
	public boolean updateByName(String location, String name) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_orgn", "root",
					"Xworkzodc@123");

			String query = "update events_info set location = ? where eventName = ?";

			PreparedStatement stm = con.prepareStatement(query);

			stm.setString(1, location);
			stm.setString(2, name);

			int i = stm.executeUpdate();
			System.out.println("effected rows:" + i);

			con.close();

			if (i > 0) {
				System.out.println("records updated");
			} else {
				System.out.println("records are not updated");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean update(EventOrgnDTO dtos, int id) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_orgn", "root",
					"Xworkzodc@123");

			String query = "update events_info set eventName=?, orgnName=?, organizedBy=?, date=?, time=?, budget=?, eventCategory=?, eventDuration=?, expectedPeople=?, rank=?, location=?, emailId=?, phoneNo=?, totalEvents=? where id=?";

			PreparedStatement stm = con.prepareStatement(query);

			stm.setString(1, dtos.getEventName());
			stm.setString(2, dtos.getOrgnName());
			stm.setString(3, dtos.getOrganizedBy());
			stm.setString(4, dtos.getDate());
			stm.setString(5, dtos.getTime());
			stm.setInt(6, dtos.getBudget());
			stm.setString(7, dtos.getEventCategory());
			stm.setString(8, dtos.getEventDuration());
			stm.setInt(9, dtos.getExpectedPeople());
			stm.setInt(10, dtos.getRank());
			stm.setString(11, dtos.getLocation());
			stm.setString(12, dtos.getEmailId());
			stm.setLong(13, dtos.getPhoneNo());
			stm.setInt(14, dtos.getTotalEvents());
			stm.setInt(15, id);

			int i = stm.executeUpdate();
			System.out.println("effected rows:" + i);

			con.close();

			if (i > 0) {
				System.out.println("records updated");
			} else {
				System.out.println("records are not updated");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean updateByEmaiId(int people, String email) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_orgn", "root",
					"Xworkzodc@123");

			String query = "update events_info set expectedPeople=? where emailId=? ";

			PreparedStatement stm = con.prepareStatement(query);

			stm.setInt(1, people);
			stm.setString(2, email);

			int i = stm.executeUpdate();
			System.out.println("effected rows:" + i);

			con.close();

			if (i > 0) {
				System.out.println("records updated");
			} else {
				System.out.println("records are not updated");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean updateByFields(String organizedBy, int totalEvents, long phoneNo, String orgnName, String time,
			String name) {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/event_orgn", "root",
					"Xworkzodc@123");
			System.out.println(con);

			String query = "update events_info set organizedBy = ?,totalEvents = ?,phoneNo = ?,orgnName = ?,time = ? where eventName = ?";

			PreparedStatement statement = con.prepareStatement(query);

			statement.setString(1, organizedBy);
			statement.setInt(2, totalEvents);
			statement.setLong(3, phoneNo);
			statement.setString(4, orgnName);
			statement.setString(5, time);
			statement.setString(6, name);

			int i = statement.executeUpdate();
			System.out.println("effected rows:" + i);

			con.close();

			if (i > 0) {
				System.out.println("records updated");
			} else {
				System.out.println("records are not updated");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return false;
	}

}
