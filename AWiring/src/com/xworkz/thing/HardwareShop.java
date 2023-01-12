package com.xworkz.thing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HardwareShop {
	@Autowired
private int id;
@Autowired
@Qualifier("name")
private String name;
@Autowired
@Qualifier("gstno")
private int gstno;
@Autowired
@Qualifier("ownername")
private String ownername;
@Autowired
@Qualifier("address")
private String address;
@Override
public String toString() {
	return "HardwareShop [id=" + id + ", name=" + name + ", gstno=" + gstno + ", ownername=" + ownername + ", address="
			+ address + "]";
}

}
