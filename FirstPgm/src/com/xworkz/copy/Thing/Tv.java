package com.xworkz.copy.Thing;

public class Tv {
	private String brand="Samsung";
	private String type="wall";
	private String brandOwner="Abcd";
	private String manufactureCountry="chaina";
	private double price=19500;
	private String manufactureDate="2016-10-07";
	private String founder="xyz";
	private boolean tvQuality=true;
	private int quantity=3;
	private char size ='M';
	private String colour="black";
	
	void setBrand(String brand) {
		this.brand = brand;
	}
	void setType(String type) {
		this.type = type;
	}
	void setBrandOwner(String brandOwner) {
		this.brandOwner = brandOwner;
	}
	void setManufactureCountry(String manufactureCountry) {
		this.manufactureCountry = manufactureCountry;
	}
	void setPrice(double price) {
		this.price = price;
	}
	void setManufactureDate(String manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	void setFounder(String founder) {
		this.founder = founder;
	}
	void setClothQuality(boolean tvQuality) {
		this.tvQuality =tvQuality;
	}
	void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	void setSize(char size) {
		this.size = size;
	}
	void setColour(String colour) {
		this.colour = colour;
	}
	public String getBrand() {
		return brand;
	}
	public String getType() {
		return type;
	}
	public String getBrandOwner() {
		return brandOwner;
	}
	public String getManufactureCountry() {
		return manufactureCountry;
	}
	public double getPrice() {
		return price;
	}
	public String getManufactureDate() {
		return manufactureDate;
	}
	public String getFounder() {
		return founder;
	}
	public boolean istvQuality() {
		return tvQuality;
	}
	public int getQuantity() {
		return quantity;
	}
	public char getSize() {
		return size;
	}
}

