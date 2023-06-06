package com.xworkz.fridgeproject.dto;

import com.xworkz.fridgeproject.constants.FridgeType;

public class FridgeDto {

	private String brand;
	private int price;
	private String color;
	private FridgeType type;
	private int capacityInLitres;
	private String starRating;

	public FridgeDto() {
		System.out.println("Default Constructor");
	}

	public FridgeDto(String brand, int price, String color, FridgeType type, int capacityInLitres, String starRating) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.type = type;
		this.capacityInLitres = capacityInLitres;
		this.starRating = starRating;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public FridgeType getType() {
		return type;
	}

	public void setType(FridgeType type) {
		this.type = type;
	}

	public int getCapacityInLitres() {
		return capacityInLitres;
	}

	public void setCapacityInLitres(int capacityInLitres) {
		this.capacityInLitres = capacityInLitres;
	}

	public String getStarRating() {
		return starRating;
	}

	public void setStarRating(String starRating) {
		this.starRating = starRating;
	}

	@Override
	public String toString() {
		return "FridgeDto [brand=" + brand + ", price=" + price + ", color=" + color + ", type=" + type
				+ ", capacityInLitres=" + capacityInLitres + ", starRating=" + starRating + "]";
	}

}
