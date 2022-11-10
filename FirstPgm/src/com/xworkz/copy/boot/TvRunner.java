package com.xworkz.copy.boot;

import com.xworkz.copy.Thing.Tv;
import com.xworkz.copy.Thing.TvModify;

public class TvRunner {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv tvv=new Tv();
		
		System.out.println("--------------old values-------------");
		System.out.println(tvv.getBrand());
		System.out.println(tvv.getType());
		System.out.println(tvv.getBrandOwner());
		System.out.println(tvv.getColour());
		System.out.println(tvv.getPrice());
		System.out.println(tvv.istvQuality());
		System.out.println(tvv.getQuantity());
		System.out.println(tvv.getManufactureDate());
		System.out.println(tvv.getManufactureCountry());
		System.out.println(tvv.getSize());
		System.out.println(tvv.getFounder());
		
		System.out.println("----------------Modified values------------------");
		TvModify modify = new TvModify();
		modify.useTv(tvv);
		
	}


}