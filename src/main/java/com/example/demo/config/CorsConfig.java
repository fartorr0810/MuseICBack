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
				.allowedOrigins("https://fartorr0810.github.io/MueveteSevilla/")
				.allowedHeaders("GET", "POST","Content-Type","X-Requested-With",
						"accept"
						,"Origin","Access-Control-Request-Method","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				registry.addMapping("/auth/login")
				.allowedOrigins("https://fartorr0810.github.io/MueveteSevilla/")
				.allowedHeaders("GET", "POST", "Content-Type","X-Requested-With",
						"accept"
						,"Origin","Access-Control-Request-Method","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				registry.addMapping("/user/**")
				.allowedOrigins("https://fartorr0810.github.io/MueveteSevilla/")
				.allowedHeaders("GET", "POST", "PUT", "DELETE","Content-Type","X-Requested-With",
						"accept","Authorization"
						,"Origin","Access-Control-Request-Method","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				registry.addMapping("/comentario")
				.allowedOrigins("https://fartorr0810.github.io/MueveteSevilla/")
				.allowedHeaders("GET","POST","Content-Type","X-Requested-With",
						"accept","Authorization"
						,"Origin","Access-Control-Request-Method","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				registry.addMapping("/patinete")
				.allowedOrigins("https://fartorr0810.github.io/MueveteSevilla/")
				.allowedHeaders("GET", "POST", "PUT", "DELETE","Content-Type","X-Requested-With",
						"accept","Authorization"
						,"Origin","Access-Control-Request-Method","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				registry.addMapping("/alquiler/**")
				.allowedOrigins("https://fartorr0810.github.io/MueveteSevilla/")
				.allowedHeaders("GET", "POST", "PUT", "DELETE","Content-Type","X-Requested-With",
						"accept","Authorization"
						,"Origin","Access-Control-Request-Method","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				registry.addMapping("/calcular-alquiler")
				.allowedOrigins("https://fartorr0810.github.io/MueveteSevilla/")
				.allowedHeaders("POST","Content-Type","X-Requested-With",
						"accept","Authorization"
						,"Origin","Access-Control-Request-Method","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				registry.addMapping("/subida")
				.allowedOrigins("https://fartorr0810.github.io/MueveteSevilla/")
				.allowedHeaders("POST","Content-Type","X-Requested-With",
						"accept","Authorization"
						,"Origin","Access-Control-Request-Method","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
				registry.addMapping("/comprobar-email")
				.allowedOrigins("https://fartorr0810.github.io/MueveteSevilla/")
				.allowedHeaders("POST","Content-Type","X-Requested-With",
						"accept","Authorization"
						,"Origin","Access-Control-Request-Method","Access-Control-Request-Headers")
				.exposedHeaders("Access-Control-Allow-Origin","Access-Control-Allow-Credentials");
			}
		};
	}


}
