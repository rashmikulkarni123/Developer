package com.xworkz.Runner;


import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.SpringConfiguration.Springconfiguration;
import com.xworkz.thing.Engine;
import com.xworkz.thing.NewsPaper;
import com.xworkz.thing.Snake;

public class Jan12Runner {

	public static void main(String[] args) {
		ApplicationContext z = new AnnotationConfigApplicationContext(Springconfiguration.class);
		System.out.println(Arrays.toString(z.getBeanDefinitionNames()));

		System.err.println("data of Newspaper");
		NewsPaper a = z.getBean(NewsPaper.class);
		System.out.println(a);
		
		System.err.println("data of Engine");
		Engine b = z.getBean(Engine.class);
		System.out.println(b);
		
		System.err.println("data of snake");
		Snake c = z.getBean(Snake.class);
		System.out.println(c);
		
		
	}

}
