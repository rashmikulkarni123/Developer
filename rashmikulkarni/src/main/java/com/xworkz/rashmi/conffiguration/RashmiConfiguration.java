package com.xworkz.rashmi.conffiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.xworkz.rashmi")
public class RashmiConfiguration {
 public RashmiConfiguration() {
	 System.out.println("created rashmiConfiguration");
 }
}
