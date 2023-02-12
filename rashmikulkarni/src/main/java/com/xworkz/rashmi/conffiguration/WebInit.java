package com.xworkz.rashmi.conffiguration;

import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



public class WebInit extends AbstractAnnotationConfigDispatcherServletInitializer implements WebMvcConfigurer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("created getrootconfigclasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("Running getServletConfigClasses");
		Class[] configClass= {RashmiConfiguration.class};
		System.out.println("configClass");
		return configClass;
		
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("Runninng getServletMappings");
		String[] s= {"/"};
		return s;
	}
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		System.out.println("Running server");
			configurer.enable();
		}
}
