package com.xworkz.copy.boot;

import com.xworkz.copy.Thing.Jacket;
import com.xworkz.copy.Thing.JacketModify;

public class BusRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus car=new Bus();
		
		System.out.println("--------------old values-------------");
		System.out.println(car.getBrand());
		System.out.println(car.getType());
		System.out.println(car.getBrandOwner());
		System.out.println(car.getColour());
		System.out.println(car.getPrice());
		System.out.println(car.isClothQuality());
		System.out.println(car.getQuantity());
		System.out.println(car.getManufactureDate());
		System.out.println(car.getManufactureCountry());
		System.out.println(car.getSize());
		System.out.println(car.getFounder());
		
		System.out.println("----------------Modified values------------------");
		BusModify modify = new busModify();
		modify.useJacket(car);
		
	}



}
