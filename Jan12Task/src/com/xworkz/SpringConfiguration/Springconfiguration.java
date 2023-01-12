package com.xworkz.SpringConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan("com.xworkz.Runnner")
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
		return 5;

}
}