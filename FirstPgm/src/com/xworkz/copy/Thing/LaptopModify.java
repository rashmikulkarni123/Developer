package com.xworkz.copy.Thing;

public class LaptopModify {
public void useLaptop(Laptop laptop) {
		
	laptop.setBrand("hcl");
		System.out.println("modified brand :"+laptop.getBrand());
		laptop.setType("leather");
		System.out.println("modified type :"+laptop.getType());
		laptop.setBrandOwner("stefan");
		System.out.println("modified brand owner :"+laptop.getBrandOwner());
		laptop.setColour("brown");
		System.out.println("modified colour :"+laptop.getColour());
		laptop.setFounder("Erling");
		System.out.println("modified expiry date :"+laptop.getFounder());
		laptop.setSize('M');
		System.out.println("modified size :"+laptop.getSize());
		laptop.setManufactureCountry("swedish");
		System.out.println("modified manufacture country :"+laptop.getManufactureCountry());
		laptop.setManufactureDate("2021-01-11");
		System.out.println("modified manufacture date :"+laptop.getManufactureDate());
		laptop.setPrice(1500);
		System.out.println("modified price :"+laptop.getPrice());
		laptop.setClothQuality(true);
		System.out.println("modified quality :"+laptop.isClothQuality());
		laptop.setQuantity(10);
		System.out.println("modified quantity :"+laptop.getQuantity());
		}
}
