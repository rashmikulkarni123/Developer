package com.xworkz.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Snake {
private String name;
@Autowired
private float length;
@Autowired
private String color;
private String type;
private boolean poisonous;
@Autowired
public Snake(@Qualifier("SnakeName")String name,
		@Qualifier("typeOfSnake")String type,
		@Qualifier("poisonous")boolean poisionous) {
	super();
	this.name = name;
	this.type = type;
	this.poisonous = poisonous;
}
@Override
public String toString() {
	return "Snake [name=" + name + ", lenght=" + length + ", color=" + color + ", type=" + type + ", poisionous="
			+ poisonous + "]";
}

}
