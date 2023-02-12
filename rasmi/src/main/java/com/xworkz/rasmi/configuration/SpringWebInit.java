package com.xworkz.rasmi.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWebInit extends AbstractAnnotationConfigDispatcherServletInitializer
implements WebMvcConfigurer 
{
	

	@Override
	protected Class<?>[] getRootConfigClasses() {
	System.out.println("Running getRootConfigClasses in server");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses");
		Class[] configClass= {SpringBeanCongiguration.class};
		System.out.println("configClass");
		return configClass;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Runninng getServletMappings");
		String[] s= {"/Rashmi"};
		return s;
	}
@Override
public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
System.out.println("Running server");
	WebMvcConfigurer.super.configureDefaultServletHandling(configurer);
}
}
