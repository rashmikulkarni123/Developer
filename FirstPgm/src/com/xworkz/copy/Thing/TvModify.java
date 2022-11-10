package com.xworkz.copy.Thing;

public class TvModify {
public void useTv(Tv tv) {
		
		tv.setBrand("LG SOFT");
		System.out.println("modified brand :"+tv.getBrand());
		tv.setType("table");
		System.out.println("modified type :"+tv.getType());
		tv.setBrandOwner("Rohan");
		System.out.println("modified brand owner :"+tv.getBrandOwner());
		tv.setColour("black");
		System.out.println("modified colour :"+tv.getColour());
		tv.setFounder("human");
		System.out.println("modified expiry date :"+tv.getFounder());
		tv.setSize('M');
		System.out.println("modified size :"+tv.getSize());
		tv.setManufactureCountry("swedish");
		System.out.println("modified manufacture country :"+tv.getManufactureCountry());
		tv.setManufactureDate("2021-01-11");
		System.out.println("modified manufacture date :"+tv.getManufactureDate());
		tv.setPrice(19000);
		System.out.println("modified price :"+tv.getPrice());
		tv.setClothQuality(true);
		System.out.println("modified quality :"+tv.istvQuality());
		tv.setQuantity(10);
		System.out.println("modified quantity :"+tv.getQuantity());
		}
	}



