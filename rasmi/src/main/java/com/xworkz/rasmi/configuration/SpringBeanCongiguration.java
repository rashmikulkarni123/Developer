package com.xworkz.rasmi.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz")
public class SpringBeanCongiguration {
	 
 public SpringBeanCongiguration() {
	 System.out.println("Running Springconfiguration in server");
 }
}
