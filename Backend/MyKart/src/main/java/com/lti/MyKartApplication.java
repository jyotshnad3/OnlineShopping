package com.lti;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@SpringBootApplication
public class MyKartApplication {

	public static void main(String[] args) {
		System.out.print(false);
		SpringApplication.run(MyKartApplication.class, args);
	}

	@SuppressWarnings("deprecation")
    @Bean
    public WebMvcConfigurer corsConfigurer() {
          return new WebMvcConfigurerAdapter() {
             @Override
             public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/api/rest").allowedOrigins("http://localhost:4200");
             }
          };
       }

}
