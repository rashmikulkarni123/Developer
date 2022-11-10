package com.xworkz.copy.boot;

import com.xworkz.copy.Thing.Jacket;
import com.xworkz.copy.Thing.JacketModify;

public class JacketRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jacket jack=new Jacket();
		
		System.out.println("--------------old values-------------");
		System.out.println(jack.getBrand());
		System.out.println(jack.getType());
		System.out.println(jack.getBrandOwner());
		System.out.println(jack.getColour());
		System.out.println(jack.getPrice());
		System.out.println(jack.isClothQuality());
		System.out.println(jack.getQuantity());
		System.out.println(jack.getManufactureDate());
		System.out.println(jack.getManufactureCountry());
		System.out.println(jack.getSize());
		System.out.println(jack.getFounder());
		
		System.out.println("----------------Modified values------------------");
		JacketModify modify = new JacketModify();
		modify.useJacket(jack);
		
	}


	}


