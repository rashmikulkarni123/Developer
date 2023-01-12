package com.xworkz.spring.type;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Rocket {
@Value("india")
private String country;
@Value("chandrayana")
private String name;
@Value("12000")
private String budget;
public Rocket() {
	System.out.println("generating spring.....");
	
}
public String getBudget() {
	return budget;
}
public String getCountry() {
	return country;
}
public String getName() {
	return name;
}
}
