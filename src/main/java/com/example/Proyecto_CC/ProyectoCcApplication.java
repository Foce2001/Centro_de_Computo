package com.example.Proyecto_CC;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ProyectoCcApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoCcApplication.class, args);
	}
        @Configuration
public class WebConfig implements WebMvcConfigurer {

                @Override
                public void addCorsMappings(CorsRegistry registry) {
                    registry.addMapping("/**")
                            .allowedOrigins("localhost:4200")
                            .allowCredentials(true)
                            .allowedHeaders("Origin","Authorization","Content-Type")
                            .allowedMethods("GET","POST","PUT","DELETE");   
        }
    }
        
}