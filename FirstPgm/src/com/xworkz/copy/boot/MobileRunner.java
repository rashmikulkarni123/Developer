package com.xworkz.copy.boot;

import com.xworkz.copy.Thing.Mobile;
import com.xworkz.copy.Thing.MobileModify;

public class MobileRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile cell=new Mobile();
		
		System.out.println("--------------old values-------------");
		System.out.println(cell.getBrand());
		System.out.println(cell.getType());
		System.out.println(cell.getBrandOwner());
		System.out.println(cell.getColour());
		System.out.println(cell.getPrice());
		System.out.println(cell.isClothQuality());
		System.out.println(cell.getQuantity());
		System.out.println(cell.getManufactureDate());
		System.out.println(cell.getManufactureCountry());
		System.out.println(cell.getSize());
		System.out.println(cell.getFounder());
		
		System.out.println("----------------Modified values------------------");
		MobileModify modify = new MsobileModify();
		modify.useMobile(cell);
		
	}


	}


