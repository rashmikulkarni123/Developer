package com.xworkz.spring.type;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Actor {
private String name;
private String Language;
private double age;
public String getName() {
	return name;
}
@Value("Punneet")
public void setName(String name) {
	this.name = name;
}
public String getLanguage() {
	return Language;
}
@Value("Kannada")
public void setLanguage(String language) {
	Language = language;
}
public double getAge() {
	return age;
}
@Value("48")
public void setAge(double age) {
	this.age = age;
}
}
