package com.xworkz.copy.Thing;

public class MobileModify {
public void useMobile(Mobile mobile) {
		
	mobile.setBrand("oppo");
		System.out.println("modified brand :"+mobile.getBrand());
		mobile.setType("keypad");
		System.out.println("modified type :"+mobile.getType());
		mobile.setBrandOwner("shubham");
		System.out.println("modified brand owner :"+mobile.getBrandOwner());
		mobile.setColour("brown");
		System.out.println("modified colour :"+mobile.getColour());
		mobile.setFounder("Erling");
		System.out.println("modified expiry date :"+mobile.getFounder());
		mobile.setSize('M');
		System.out.println("modified size :"+mobile.getSize());
		mobile.setManufactureCountry("swedish");
		System.out.println("modified manufacture country :"+mobile.getManufactureCountry());
		mobile.setManufactureDate("2021-01-11");
		System.out.println("modified manufacture date :"+mobile.getManufactureDate());
		mobile.setPrice(1500);
		System.out.println("modified price :"+mobile.getPrice());
		mobile.setClothQuality(true);
		System.out.println("modified quality :"+mobile.isClothQuality());
		mobile.setQuantity(10);
		System.out.println("modified quantity :"+mobile.getQuantity());
		}
}
