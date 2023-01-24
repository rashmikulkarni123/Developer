package com.xworkz.Thing;

import org.springframework.stereotype.Component;

@Component
public class Camera {
	private Battery battery;
private Lens lens;
public Lens getLens() {
	return lens;
	}
public Battery getBattery() {
	return battery;
}
public Camera() {
	System.out.println("Running camera");
}
}
