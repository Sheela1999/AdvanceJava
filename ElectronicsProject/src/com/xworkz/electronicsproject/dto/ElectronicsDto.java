package com.xworkz.electronicsproject.dto;

public class ElectronicsDto {

	private String brand;
	private int price;
	private int launchDate;
	private float ratings;
	private String color;
	private float warranty;

	public ElectronicsDto() {
		System.out.println("no args constructor");
	}

	public ElectronicsDto(String brand, int price, int launchDate, float ratings, String color, float warranty) {
		super();
		this.brand = brand;
		this.price = price;
		this.launchDate = launchDate;
		this.ratings = ratings;
		this.color = color;
		this.warranty = warranty;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getLaunchDate() {
		return launchDate;
	}

	public void setLaunchDate(int launchDate) {
		this.launchDate = launchDate;
	}

	public float getRatings() {
		return ratings;
	}

	public void setRatings(float ratings) {
		this.ratings = ratings;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getWarranty() {
		return warranty;
	}

	public void setWarranty(float warranty) {
		this.warranty = warranty;
	}

	@Override
	public String toString() {
		return "ElectronicsDto [brand=" + brand + ", price=" + price + ", launchDate=" + launchDate + ", ratings="
				+ ratings + ", color=" + color + ", warranty=" + warranty + "]";
	}

}
