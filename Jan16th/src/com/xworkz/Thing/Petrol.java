package com.xworkz.Thing;

import org.springframework.stereotype.Component;

@Component
public class Petrol implements Fuel {
private Fuel fuel;
	@Override
	public void consume() {
	System.out.println("running");
	}
	

}
