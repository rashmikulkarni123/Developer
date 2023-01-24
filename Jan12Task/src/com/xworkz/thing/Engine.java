
package com.xworkz.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
private String name;
private String type;
@Value ("2")
private int number;
@Value ("1.1")
private double version;
private String company;
private boolean strokes;
@Autowired
public Engine( @Qualifier("nameOfEngine") String name,
		@Qualifier("typeOfEngine") String type,
		@Qualifier("company") String company) {
	super();
	this.name = name;
	this.type = type;
	this.company = company;
	
}
public boolean getStrokes() {
	return strokes;
}
@Value("true")
public void setStrokes(boolean strokes) {
	this.strokes = strokes;
}
}














