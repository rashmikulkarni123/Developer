package com.xworkz.Thing;

import org.springframework.stereotype.Component;

@Component
public class Company {
private Location location;

public Location getLocation() {
	return location;
}

public void setLocation(Location location) {
	this.location = location;
}
}
