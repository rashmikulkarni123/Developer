package com.xworkz.spring.boot;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.spring.configure.SpringConfig;

public class RashmiRunner {
public static void main(String[] args) {
	ApplicationContext r=new AnnotationConfigApplicationContext(SpringConfig.class);
}
}
