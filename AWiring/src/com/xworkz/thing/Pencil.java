package com.xworkz.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pencil {
	@Autowired
	@Qualifier("name4")
private String name;
	@Autowired
	@Qualifier("type")
private String type;
	@Autowired
private double price;
	@Autowired
	@Qualifier("color")
private String color;
	@Autowired
	@Qualifier("sharp")
private boolean sharp;
	@Autowired
private boolean stolen;
	@Autowired
private String size;
	@Override
	public String toString() {
		return "Pencil [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", sharp=" + sharp
				+ ", stolen=" + stolen + ", size=" + size + "]";
	}
}
