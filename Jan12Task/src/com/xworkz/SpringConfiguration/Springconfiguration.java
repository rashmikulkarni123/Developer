package com.xworkz.SpringConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.xworkz")
public class Springconfiguration {
	//newspaper
	@Bean
	public int id() {
		return 1 ;
	}
	@Bean
	public String nameofnewspaper() {
		return "vjayavani";
	}
	@Bean
	public String ownername() {
		return "vijay sankeshwar";
	}
	@Bean
	public String language() {
		return "kannada";
	}
	@Bean
	public double Price() {
		return 5.0d;
}
	//engine
	
	@Bean
	public String nameOfEngine() {
		return "bs6";
		}
	@Bean
	public String typeOfEngine() {
		return "petrol";
	}
	@Bean
	public int number() {
		return 1;
	}
	@Bean
	public double version() {
		return 1.1;
	}
	@Bean
	public String company() {
		return "honda";
	}
	@Bean
	public boolean strokes() {
		return true;
	}
	//snake
	@Bean
	public String SnakeName() {
		return "indianKirt";
	}
	@Bean
	public float length() {
		return 5.2f;
	}
	@Bean
	public String color() {
		return "green";
	}
	@Bean
	public String typeOfSnake() {
		return "indian";
	}
	
	@Bean
	public boolean poisonous() {
		return true;
	}
	
	@Bean
	public String nameOfghost() {
		return"abc";
	}
	
	@Bean
	public String ghostGender() {
		return "male";
	}
	
	@Bean
	public String address() {
		return "america";
	}
	
	@Bean
	public String fatherName() {
		return "xyz";
	}
	
	@Bean
	public boolean dead() {
		return true;
	}
	
	@Bean
	public boolean getAfraid() {
		return false;
	}
	
	@Bean
	public int years() {
     return 4;
	}	
}