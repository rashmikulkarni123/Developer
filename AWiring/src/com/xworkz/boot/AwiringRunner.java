package com.xworkz.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.SpringConfiguration.SpringConfigrations;
import com.xworkz.thing.HardwareShop;
import com.xworkz.thing.Pg;
import com.xworkz.thing.Rubber;
import com.xworkz.thing.Software;
import com.xworkz.thing.SoftwareEngineer;

public class AwiringRunner {

	public static void main(String[] args) {

		ApplicationContext wire = new AnnotationConfigApplicationContext(SpringConfigrations.class);
		System.out.println(Arrays.toString(wire.getBeanDefinitionNames()));

		System.err.println("data of HardwareShop");
		HardwareShop things = wire.getBean(HardwareShop.class);
		System.out.println(things);

		System.err.println("data of Software");
		Software application = wire.getBean(Software.class);
		System.out.println(application);

		System.err.println("data of software engineer");
		SoftwareEngineer soft = wire.getBean(SoftwareEngineer.class);
		System.out.println(soft);

		System.err.println("data of rubber");
		Rubber eraser = wire.getBean(Rubber.class);
		System.out.println(eraser);

		System.err.println("data of pg");
		Pg hostel = wire.getBean(Pg.class);
		System.out.println(hostel);
	}

}
