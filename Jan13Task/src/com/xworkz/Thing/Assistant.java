package com.xworkz.Thing;

import org.springframework.stereotype.Component;

@Component
public class Assistant {
private Company company;

public Company getCompany() {
	return company;
}

public void setCompany(Company company) {
	this.company = company;
}
}
