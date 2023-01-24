package com.xworkz.Thing;

import org.springframework.stereotype.Component;

@Component
public class Director {
private Producer producer;
private Experience experience;
private CameraMan cameraman;
public Producer getProducer() {
	return producer;
}
public CameraMan getCameraman() {
	return cameraman;
}
public Experience getExperience() {
	return experience;
}
public Director() {
	System.out.println("running director");
}
}
