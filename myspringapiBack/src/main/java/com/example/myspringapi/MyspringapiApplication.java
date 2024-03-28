package com.example.myspringapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class MyspringapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyspringapiApplication.class, args);
	}


	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedOrigins("http://localhost:3000") // Remplacez avec l'URL de votre application Angular
						.allowedMethods("GET", "POST", "PUT", "DELETE")
						.allowedHeaders("Origin", "Content-Type", "Authorization")
						.allowCredentials(true);
			}
		};
	}

}
