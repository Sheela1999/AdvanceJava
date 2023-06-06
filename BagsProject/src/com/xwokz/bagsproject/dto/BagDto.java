package com.xwokz.bagsproject.dto;

public class BagDto {

	private String bagBrand;
	private int price;
	private String type;
	private String color;

	public BagDto() {
		System.out.println("Default constructor");
	}

	public BagDto(String bagBrand, int price, String type, String color) {
		super();
		this.bagBrand = bagBrand;
		this.price = price;
		this.type = type;
		this.color = color;
	}

	public String getBagBrand() {
		return bagBrand;
	}

	public void setBagBrand(String bagBrand) {
		this.bagBrand = bagBrand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "BagDto [bagBrand=" + bagBrand + ", price=" + price + ", type=" + type + ", color=" + color + "]";
	}

}
