package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {
	
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/auth/register")
				.allowedOrigins("https://musebackend.herokuapp.com/")
				.allowedHeaders("GET", "POST","Content-Type","X-Requested-With",
						"accept"
						,"Origin","Access-Control-Request-Method","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				registry.addMapping("/auth/login")
				.allowedOrigins("https://musebackend.herokuapp.com/")
				.allowedHeaders("GET", "POST", "Content-Type","X-Requested-With",
						"accept"
						,"Origin","Access-Control-Request-Method","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				registry.addMapping("/user/**")
				.allowedOrigins("https://musebackend.herokuapp.com/")
				.allowedHeaders("GET", "POST", "PUT", "DELETE","Content-Type","X-Requested-With",
						"accept","Authorization"
						,"Origin","Access-Control-Request-Method","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				registry.addMapping("/comentario")
				.allowedOrigins("https://musebackend.herokuapp.com/")
				.allowedHeaders("GET","POST","Content-Type","X-Requested-With",
						"accept","Authorization"
						,"Origin","Access-Control-Request-Method","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				registry.addMapping("/patinete")
				.allowedOrigins("https://musebackend.herokuapp.com/")
				.allowedHeaders("GET", "POST", "PUT", "DELETE","Content-Type","X-Requested-With",
						"accept","Authorization"
						,"Origin","Access-Control-Request-Method","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				registry.addMapping("/alquiler/**")
				.allowedOrigins("https://musebackend.herokuapp.com/")
				.allowedHeaders("GET", "POST", "PUT", "DELETE","Content-Type","X-Requested-With",
						"accept","Authorization"
						,"Origin","Access-Control-Request-Method","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				registry.addMapping("/calcular-alquiler")
				.allowedOrigins("https://musebackend.herokuapp.com/")
				.allowedHeaders("POST","Content-Type","X-Requested-With",
						"accept","Authorization"
						,"Origin","Access-Control-Request-Method","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				registry.addMapping("/subida")
				.allowedOrigins("https://musebackend.herokuapp.com/")
				.allowedHeaders("POST","Content-Type","X-Requested-With",
						"accept","Authorization"
						,"Origin","Access-Control-Request-Method","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				registry.addMapping("/comprobar-email")
				.allowedOrigins("https://musebackend.herokuapp.com/")
				.allowedHeaders("POST","Content-Type","X-Requested-With",
						"accept","Authorization"
						,"Origin","Access-Control-Request-Method","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
			}
		};
	}


}
