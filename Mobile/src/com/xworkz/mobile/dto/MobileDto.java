package com.xworkz.mobile.dto;

public class MobileDto {

	private String brand;
	private int price;
	private String color;
	private byte ram;
	private long modelNum;

	public MobileDto() {
		System.out.println("No args Constructor");
	}

	public MobileDto(String brand, int price, String color, byte ram, long modelNum) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
		this.ram = ram;
		this.modelNum = modelNum;
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

	public byte getRam() {
		return ram;
	}

	public void setRam(byte ram) {
		this.ram = ram;
	}

	public long getModelNum() {
		return modelNum;
	}

	public void setModelNum(long modelNum) {
		this.modelNum = modelNum;
	}

	@Override
	public String toString() {
		return "MobileDto [brand=" + brand + ", price=" + price + ", color=" + color + ", ram=" + ram + ", modelNum="
				+ modelNum + "]";
	}

}
