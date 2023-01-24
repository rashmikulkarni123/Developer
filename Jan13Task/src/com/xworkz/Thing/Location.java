package com.xworkz.Thing;

import org.springframework.stereotype.Component;

@Component
public class Location {
private Area area;


public Area getArea() {
	return area;
}

public void setArea(Area area) {
	this.area = area;
}
}
