package com.xworkz.Thing;

import org.springframework.stereotype.Component;

@Component
public class Diesel implements Fuel {

	@Override
	public void consume() {
		System.out.println("running desil and fuel data");
		
	}

}
