package com.xworkz.spring.type;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Season {
private String name;
private String StartMonth;
private double Duration;
public String getName() {
	return name;
}
@Value("winter")
public void setName(String name) {
	this.name = name;
}
public String getStartMonth() {
	return StartMonth;
}
@Value("oct")
public void setStartMonth(String startMonth) {
	StartMonth = startMonth;
}
public double getDuration() {
	return Duration;
}
@Value("4")
public void setDuration(double duration) {
	Duration = duration;
}

}
