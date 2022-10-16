package com.apress.practicalvaadin.ch02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application extends SpringBootServletInitializer {
	
	public static ConfigurableApplicationContext springContext;

	public static void main(final String[] args) {
		SpringApplication application = new SpringApplication(Application.class);
		
		springContext = application.run(args);
	}
	
	public static <B> B getBean(final Class<B> type) {
		return springContext.getBean(type);
	}
}
