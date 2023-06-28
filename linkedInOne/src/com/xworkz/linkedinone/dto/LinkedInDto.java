package com.xworkz.linkedinone.dto;

import java.sql.Date;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class LinkedInDto {

	private int id;
	@NotBlank
	@NotEmpty
	@Size(min = 3, max = 15)
	private String cEO;
	private String founders;
	private String parentOrganization;
	private String headquarters;
	private long members;
	private Date launchDate;
	private String typesOfPeople;
	private String useOfLinkedIn;
	private String downloadingWebsite;
	private String learningSkills;
	private int regCountries;
	private String subsidiaries;
	private String linkedInAccount;
	private String typeOfAds;
	@NotBlank
	@NotEmpty
	@Email(message = "email is not valid")
	private String emailId;

	public LinkedInDto() {
		System.out.println("Default Constructor");
	}

	public LinkedInDto(int id, String cEO, String founders, String parentOrganization, String headquarters,
			long members, Date launchDate, String typesOfPeople, String useOfLinkedIn, String downloadingWebsite,
			String learningSkills, int regCountries, String subsidiaries, String linkedInAccount, String typeOfAds,
			String emailId) {
		super();
		this.id = id;
		this.cEO = cEO;
		this.founders = founders;
		this.parentOrganization = parentOrganization;
		this.headquarters = headquarters;
		this.members = members;
		this.launchDate = launchDate;
		this.typesOfPeople = typesOfPeople;
		this.useOfLinkedIn = useOfLinkedIn;
		this.downloadingWebsite = downloadingWebsite;
		this.learningSkills = learningSkills;
		this.regCountries = regCountries;
		this.subsidiaries = subsidiaries;
		this.linkedInAccount = linkedInAccount;
		this.typeOfAds = typeOfAds;
		this.emailId = emailId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getcEO() {
		return cEO;
	}

	public void setcEO(String cEO) {
		this.cEO = cEO;
	}

	public String getFounders() {
		return founders;
	}

	public void setFounders(String founders) {
		this.founders = founders;
	}

	public String getParentOrganization() {
		return parentOrganization;
	}

	public void setParentOrganization(String parentOrganization) {
		this.parentOrganization = parentOrganization;
	}

	public String getHeadquarters() {
		return headquarters;
	}

	public void setHeadquarters(String headquarters) {
		this.headquarters = headquarters;
	}

	public long getMembers() {
		return members;
	}

	public void setMembers(long members) {
		this.members = members;
	}

	public Date getLaunchDate() {
		return launchDate;
	}

	public void setLaunchDate(Date launchDate) {
		this.launchDate = launchDate;
	}

	public String getTypesOfPeople() {
		return typesOfPeople;
	}

	public void setTypesOfPeople(String typesOfPeople) {
		this.typesOfPeople = typesOfPeople;
	}

	public String getUseOfLinkedIn() {
		return useOfLinkedIn;
	}

	public void setUseOfLinkedIn(String useOfLinkedIn) {
		this.useOfLinkedIn = useOfLinkedIn;
	}

	public String getDownloadingWebsite() {
		return downloadingWebsite;
	}

	public void setDownloadingWebsite(String downloadingWebsite) {
		this.downloadingWebsite = downloadingWebsite;
	}

	public String getLearningSkills() {
		return learningSkills;
	}

	public void setLearningSkills(String learningSkills) {
		this.learningSkills = learningSkills;
	}

	public int getRegCountries() {
		return regCountries;
	}

	public void setRegCountries(int regCountries) {
		this.regCountries = regCountries;
	}

	public String getSubsidiaries() {
		return subsidiaries;
	}

	public void setSubsidiaries(String subsidiaries) {
		this.subsidiaries = subsidiaries;
	}

	public String getLinkedInAccount() {
		return linkedInAccount;
	}

	public void setLinkedInAccount(String linkedInAccount) {
		this.linkedInAccount = linkedInAccount;
	}

	public String getTypeOfAds() {
		return typeOfAds;
	}

	public void setTypeOfAds(String typeOfAds) {
		this.typeOfAds = typeOfAds;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "LinkedInDto [id=" + id + ", cEO=" + cEO + ", founders=" + founders + ", parentOrganization="
				+ parentOrganization + ", headquarters=" + headquarters + ", members=" + members + ", launchDate="
				+ launchDate + ", typesOfPeople=" + typesOfPeople + ", useOfLinkedIn=" + useOfLinkedIn
				+ ", downloadingWebsite=" + downloadingWebsite + ", learningSkills=" + learningSkills
				+ ", regCountries=" + regCountries + ", subsidiaries=" + subsidiaries + ", linkedInAccount="
				+ linkedInAccount + ", typeOfAds=" + typeOfAds + ", emailId=" + emailId + "]";
	}

}
