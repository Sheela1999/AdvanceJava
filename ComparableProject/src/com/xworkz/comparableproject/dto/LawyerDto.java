package com.xworkz.comparableproject.dto;

import com.xworkz.comparableproject.dao.LawyerDao;

public class LawyerDto implements Comparable<LawyerDto>, LawyerDao {

	private String name;
	private int age;
	private String qualification;
	private String designation;
	private int salary;

	public LawyerDto() {
		System.out.println("No args Constructor");
	}

	public LawyerDto(String name, int age, String qualification, String designation, int salary) {
		super();
		this.name = name;
		this.age = age;
		this.qualification = qualification;
		this.designation = designation;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Lawyer [name=" + name + ", age=" + age + ", qualification=" + qualification + ", designation="
				+ designation + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(LawyerDto o) {
		if (age > o.getAge()) {
			return 1;
		} else {
			return -1;
		}
	}

	// we can't run this method
	public int compareTo1(LawyerDto o) {
		if (designation.length() < o.getDesignation().length()) {
			return 1;
		} else {
			return -1;
		}
	}

}
