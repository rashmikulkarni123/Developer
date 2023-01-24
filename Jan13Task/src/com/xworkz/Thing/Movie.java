package com.xworkz.Thing;

import org.springframework.stereotype.Component;

@Component
public class Movie {
private Director director;
public Director getDirector() {
	return director;
}
public Movie() {
System.out.println("Running movie");
}
}
