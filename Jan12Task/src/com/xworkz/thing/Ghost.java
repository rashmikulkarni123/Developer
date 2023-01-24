package com.xworkz.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Ghost {
private String name;
private String gender;
private String address;
private String fatherName;
private boolean dead;
private boolean getAfraid;
private int years;
@Autowired
public Ghost(@Qualifier("nameOfghost")String name, 
		@Qualifier("ghostGender")String gender, String address, String fatherName, boolean dead, boolean getAfraid,
		int years) {
	super();
	this.name = name;
	this.gender = gender;
	this.address = address;
	this.fatherName = fatherName;
	this.dead = dead;
	this.getAfraid = getAfraid;
	this.years = years;
}

}
