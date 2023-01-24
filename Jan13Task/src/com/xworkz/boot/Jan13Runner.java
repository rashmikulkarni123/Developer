package com.xworkz.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.Thing.Movie;
import com.xworkz.configuration.SpringConfiguration;



public class Jan13Runner {
	public static void main(String[] args) {		
	
	ApplicationContext c = new AnnotationConfigApplicationContext(SpringConfiguration.class);
	System.out.println(Arrays.toString(c.getBeanDefinitionNames()));
	
	System.err.println("data of Newspaper");
Movie a = c.getBean(Movie.class);
	System.out.println(a.getDirector().getCameraman().getCamera().getBattery().getCapacity());
	
}
}