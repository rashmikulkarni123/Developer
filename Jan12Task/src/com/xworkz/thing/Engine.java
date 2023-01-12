package com.xworkz.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Engine {
private String name;
private String type;
@Autowired
private int number;
@Autowired
private double version;
private String company;
@Autowired
private boolean strokes;
public Engine(String name, String type, String company) {
	super();
	this.name = name;
	this.type = type;
	this.company = company;
}
}
