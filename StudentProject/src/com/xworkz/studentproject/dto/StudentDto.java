package com.xworkz.studentproject.dto;

public class StudentDto implements Comparable<StudentDto> {

	private String name;
	private long registrationNumber;
	private int age;
	private String qualification;
	private String place;

	public StudentDto() {
		System.out.println("No args Constructor");
	}

	public StudentDto(String name, long registrationNumber, int age, String qualification, String place) {
		super();
		this.name = name;
		this.registrationNumber = registrationNumber;
		this.age = age;
		this.qualification = qualification;
		this.place = place;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(long registrationNumber) {
		this.registrationNumber = registrationNumber;
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

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "StudentDto [name=" + name + ", registrationNumber=" + registrationNumber + ", age=" + age
				+ ", qualification=" + qualification + ", place=" + place + "]";
	}

	@Override
	public int compareTo(StudentDto o) {
		if (age > o.getAge()) {
			return 1;
		} else {
			return -1;
		}
	}

}
