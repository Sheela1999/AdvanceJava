package com.xworkz.novel.dto;

public class NovelDto {
	
	private int id;
	private String name;
	private String author;
	private String publishedOn;
	
	public NovelDto() {
		super();
	}

	public NovelDto(int id, String name, String author, String publishedOn) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
		this.publishedOn = publishedOn;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishedOn() {
		return publishedOn;
	}

	public void setPublishedOn(String publishedOn) {
		this.publishedOn = publishedOn;
	}

	@Override
	public String toString() {
		return "NovelDto [id=" + id + ", name=" + name + ", author=" + author + ", publishedOn=" + publishedOn + "]";
	}	

}
