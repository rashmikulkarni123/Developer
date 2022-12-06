package com.xwoorkz.parentclass;

public abstract class Person extends Object {
String name;
private String location;
private double DOB;
private long pno;
private String gender;
String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public double getDOB() {
	return DOB;
}
public void setDOB(double dOB) {
	DOB = dOB;
}
public long getPno() {
	return pno;
}
public void setPno(long pno) {
	this.pno = pno;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
}
