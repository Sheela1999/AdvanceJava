package com.xworkz.eventorganizations.dto;

public class EventOrgnDTO {

	private int id;
	private String eventName;
	private String orgnName;
	private String organizedBy;
	private String date;
	private String time;
	private int budget;
	private String eventCategory;
	private String eventDuration;
	private int expectedPeople;
	private int rank;
	private String location;
	private String emailId;
	private long phoneNo;
	private int totalEvents;

	public EventOrgnDTO() {
		System.out.println("No args Constructor");
	}

	public EventOrgnDTO(int id, String eventName, String orgnName, String organizedBy, String date, String time,
			int budget, String eventCategory, String eventDuration, int expectedPeople, int rank, String location,
			String emailId, long phoneNo, int totalEvents) {
		super();
		this.id = id;
		this.eventName = eventName;
		this.orgnName = orgnName;
		this.organizedBy = organizedBy;
		this.date = date;
		this.time = time;
		this.budget = budget;
		this.eventCategory = eventCategory;
		this.eventDuration = eventDuration;
		this.expectedPeople = expectedPeople;
		this.rank = rank;
		this.location = location;
		this.emailId = emailId;
		this.phoneNo = phoneNo;
		this.totalEvents = totalEvents;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getOrgnName() {
		return orgnName;
	}

	public void setOrgnName(String orgnName) {
		this.orgnName = orgnName;
	}

	public String getOrganizedBy() {
		return organizedBy;
	}

	public void setOrganizedBy(String organizedBy) {
		this.organizedBy = organizedBy;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public String getEventCategory() {
		return eventCategory;
	}

	public void setEventCategory(String eventCategory) {
		this.eventCategory = eventCategory;
	}

	public String getEventDuration() {
		return eventDuration;
	}

	public void setEventDuration(String eventDuration) {
		this.eventDuration = eventDuration;
	}

	public int getExpectedPeople() {
		return expectedPeople;
	}

	public void setExpectedPeople(int expectedPeople) {
		this.expectedPeople = expectedPeople;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public int getTotalEvents() {
		return totalEvents;
	}

	public void setTotalEvents(int totalEvents) {
		this.totalEvents = totalEvents;
	}

	@Override
	public String toString() {
		return "EventOrgnDTO [id=" + id + ", eventName=" + eventName + ", orgnName=" + orgnName + ", organizedBy="
				+ organizedBy + ", date=" + date + ", time=" + time + ", budget=" + budget + ", eventCategory="
				+ eventCategory + ", eventDuration=" + eventDuration + ", expectedPeople=" + expectedPeople + ", rank="
				+ rank + ", location=" + location + ", emailId=" + emailId + ", phoneNo=" + phoneNo + ", totalEvents="
				+ totalEvents + "]";
	}

}
