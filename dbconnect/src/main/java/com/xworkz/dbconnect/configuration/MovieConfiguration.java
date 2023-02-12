package com.xworkz.dbconnect.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.xworkz")

public class MovieConfiguration {
	public MovieConfiguration() {
		System.out.println("Running Movie in Server");
	}
	@Bean
	public ViewResolver viewResolver() {
		System.out.println("Running view resolver");
		return new InternalResourceViewResolver("/",".jsp");
	}
	@Bean
	public LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean()
	{
		System.out.println("Running localContainer in server");
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		return bean;
	}
}
