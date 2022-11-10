package com.xworkz.copy.Thing;

public class Bus {
	private String brand="Rajhamsa";
	private String type="sleeper";
	private String brandOwner="karnataka government";
	private String manufactureCountry="karnataka";
	private double price=1250000;
	private String manufactureDate="2016-10-07";
	private String founder="Mechanical engineer";
	private boolean busQuality=true;
	private int quantity=1;
	private char size ='S';
	private String colour="White";
	
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
	void setbusQuality(boolean busQuality) {
		this.busQuality = busQuality;
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
	public boolean isClothQuality() {
		return busQuality;
	}
	public int getQuantity() {
		return quantity;
	}
	public char getSize() {
		return size;
	}
	public String getColour() {
		return colour;
	}
}
