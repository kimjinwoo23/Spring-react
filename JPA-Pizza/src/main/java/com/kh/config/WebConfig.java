package com.kh.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{

	@Override
	
	public void addCorsMappings(CorsRegistry registry) {
		registry.addMapping("/**") //front포트로가져오는 api url 주소 허용
		.allowedOrigins("http://localhost:3000")
		.allowedMethods("GET","POST","PUT","DELETE","OPTIONS")
		.allowCredentials(true);
	}
	
}
