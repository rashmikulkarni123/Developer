package com.xworkz.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class NewsPaper {
	@Value("1")
private int id;
private String name;
private String ownername;
@Value("kannada")
private String language;
private double price;
@Autowired
public NewsPaper (@Qualifier("nameofnewspaper") String name,
		@Qualifier("ownername") String ownername)  {
	super();
	this.name = name;
	this.ownername = ownername;
}
public double getPrice() {
	return price;
}
@Value("5")
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "NewsPaper [id=" + id + ", name=" + name + ", ownername=" + ownername + ", language=" + language + ", price="
			+ price + "]";
}

}
