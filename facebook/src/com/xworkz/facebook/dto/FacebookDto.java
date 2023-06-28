package com.xworkz.facebook.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class FacebookDto {

	private int id;
	@NotBlank
	@NotEmpty
	@Size(min = 3, max = 50)
	private String firstName;
	@NotBlank
	@NotEmpty
	@Size(min = 3, max = 50)
	private String lastName;
	@NotBlank
	@NotEmpty
	private String dateOfBirth;
	@NotBlank
	@NotEmpty
	@Email
	private String email;
	private Long phoneNumber;
	@NotBlank
	@NotEmpty
	private String gender;
	@NotBlank
	@NotEmpty
	@Size(min = 8, max = 16)
	private String password;

	public FacebookDto() {
		System.out.println("Default constructor");
	}

	public FacebookDto(int id, String firstName, String lastName, String dateOfBirth, String email, Long phoneNumber,
			String gender, String password) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.gender = gender;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "FacebookDto [firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth=" + dateOfBirth
				+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", gender=" + gender + ", password=" + password
				+ "]";
	}

}
