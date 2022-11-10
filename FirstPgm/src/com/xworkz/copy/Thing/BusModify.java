package com.xworkz.copy.Thing;

public class BusModify {
public void useBus(Bus bus) {
		
		bus.setBrand("SRS");
		System.out.println("modified brand :"+bus.getBrand());
		bus.setType("Sleeper");
		System.out.println("modified type :"+bus.getType());
		bus.setBrandOwner("sitting");
		System.out.println("modified brand owner :"+bus.getBrandOwner());
		bus.setColour("brown");
		System.out.println("modified colour :"+bus.getColour());
		bus.setFounder("abcd");
		System.out.println("modified expiry date :"+bus.getFounder());
		bus.setSize('s');
		System.out.println("modified size :"+bus.getSize());
		bus.setManufactureCountry("swedish");
		System.out.println("modified manufacture country :"+bus.getManufactureCountry());
		bus.setManufactureDate("2021-01-11");
		System.out.println("modified manufacture date :"+bus.getManufactureDate());
		bus.setPrice(1500);
		System.out.println("modified price :"+bus.getPrice());
		bus.setbusQuality(true);
		System.out.println("modified quality :"+bus.busQuality());
		bus.setQuantity(10);
		System.out.println("modified quantity :"+bus.getQuantity());
		}
	}

