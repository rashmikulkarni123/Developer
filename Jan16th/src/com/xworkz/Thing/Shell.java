package com.xworkz.Thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Shell implements PetrolBunk{
	@Autowired
	@Qualifier("petrol")
	private Fuel fuel;
	
	public Shell() {
		System.out.println("running shell");
		
	}

	@Override
	public void purchase() {
	fuel.consume();
		
	}
	

}
