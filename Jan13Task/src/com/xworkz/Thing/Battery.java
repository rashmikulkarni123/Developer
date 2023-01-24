package com.xworkz.Thing;

import org.springframework.stereotype.Component;

@Component
public class Battery {
private Capacity capacity;
public Capacity getCapacity() {
	return capacity;
}
public Battery() {
	System.out.println("running battry const");

}
}
