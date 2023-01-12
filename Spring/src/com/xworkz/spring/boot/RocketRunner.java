package com.xworkz.spring.boot;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.xworkz.spring.configure.SpringConfig;
import com.xworkz.spring.type.Actor;
import com.xworkz.spring.type.Rocket;
import com.xworkz.spring.type.Season;

public class RocketRunner {

	public static void main(String[] args) {
		ApplicationContext r=new AnnotationConfigApplicationContext(SpringConfig.class);
		System.out.println(Arrays.toString(r.getBeanDefinitionNames()));
Rocket a=r.getBean(Rocket.class);
System.out.println(a.getBudget());
System.out.println(a.getCountry());
System.out.println(a.getName());
	Season b=r.getBean(Season.class);
	System.out.println(b.getDuration());
	System.out.println(b.getName());
	System.out.println(b.getStartMonth());
	Actor c=r.getBean(Actor.class);
	System.out.println(c.getName());
	System.out.println(c.getAge());
	System.out.println(c.getLanguage());


	}
}
