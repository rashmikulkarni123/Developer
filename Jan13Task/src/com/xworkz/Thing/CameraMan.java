package com.xworkz.Thing;

import org.springframework.stereotype.Component;

@Component
public class CameraMan {
private Camera camera;
public Camera getCamera() {
	return camera;
}
public CameraMan() {
	System.out.println("Running camera man");
}
}
