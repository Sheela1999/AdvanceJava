package com.xworkz.avatar.dto;

public class AvatarDTO {

	private int id;
	private String actors;
	private int age;
	private String dateOfbirth;
	private String nationality;
	private boolean marriageStatus;
	private int totalMovies;
	private String firstMovie;
	private String lastMovie;
	private String charName;

	public AvatarDTO() {
		System.out.println("No args Constructor");
	}

	public AvatarDTO(int id, String actors, int age, String dateOfbirth, String nationality, boolean marriageStatus,
			int totalMovies, String firstMovie, String lastMovie, String charName) {
		super();
		this.id = id;
		this.actors = actors;
		this.age = age;
		this.dateOfbirth = dateOfbirth;
		this.nationality = nationality;
		this.marriageStatus = marriageStatus;
		this.totalMovies = totalMovies;
		this.firstMovie = firstMovie;
		this.lastMovie = lastMovie;
		this.charName = charName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getActors() {
		return actors;
	}

	public void setActors(String actors) {
		this.actors = actors;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDateOfbirth() {
		return dateOfbirth;
	}

	public void setDateOfbirth(String dateOfbirth) {
		this.dateOfbirth = dateOfbirth;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public boolean isMarriageStatus() {
		return marriageStatus;
	}

	public void setMarriageStatus(boolean marriageStatus) {
		this.marriageStatus = marriageStatus;
	}

	public int getTotalMovies() {
		return totalMovies;
	}

	public void setTotalMovies(int totalMovies) {
		this.totalMovies = totalMovies;
	}

	public String getFirstMovie() {
		return firstMovie;
	}

	public void setFirstMovie(String firstMovie) {
		this.firstMovie = firstMovie;
	}

	public String getLastMovie() {
		return lastMovie;
	}

	public void setLastMovie(String lastMovie) {
		this.lastMovie = lastMovie;
	}

	public String getCharName() {
		return charName;
	}

	public void setCharName(String charName) {
		this.charName = charName;
	}

	@Override
	public String toString() {
		return "AvatarDTO [id=" + id + ", actors=" + actors + ", age=" + age + ", dateOfbirth=" + dateOfbirth
				+ ", nationality=" + nationality + ", marriageStatus=" + marriageStatus + ", totalMovies=" + totalMovies
				+ ", firstMovie=" + firstMovie + ", lastMovie=" + lastMovie + ", charName=" + charName + "]";
	}

}
