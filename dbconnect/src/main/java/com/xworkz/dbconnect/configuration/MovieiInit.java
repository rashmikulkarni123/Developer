package com.xworkz.dbconnect.configuration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;


public class MovieiInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("running getRootConfigClasses................");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		 Class [] c= {MovieConfiguration.class};
		return c;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Running mapping");
		String[] s= {"/"};
		return s;
	}
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("running configureDefaultServletHandling...........................");
	configurer.enable();
	}
 
}
