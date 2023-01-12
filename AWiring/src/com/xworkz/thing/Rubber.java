package com.xworkz.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Rubber {
	@Autowired
	@Qualifier("name1")
private String name;
	@Autowired
	@Qualifier("type1")
private String type;
	@Autowired
	@Qualifier("price1")
private int price;
	@Autowired
	@Qualifier("color1")
private String color;
	@Autowired
	@Qualifier("sharp1")
private boolean sharp;
	@Autowired
	@Qualifier("stolen1")
private boolean stolen;
@Autowired
@Qualifier("size1")
private String size;
@Override
public String toString() {
	return "Rubber [name=" + name + ", type=" + type + ", price=" + price + ", color=" + color + ", sharp=" + sharp
			+ ", stolen=" + stolen + ", size=" + size + "]";
}


}
