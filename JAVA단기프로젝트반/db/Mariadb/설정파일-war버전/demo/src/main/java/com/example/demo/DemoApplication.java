package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class DemoApplication {
	@Bean
	public InternalResourceViewResolver resolver() {
		InternalResourceViewResolver resolver
				= new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
