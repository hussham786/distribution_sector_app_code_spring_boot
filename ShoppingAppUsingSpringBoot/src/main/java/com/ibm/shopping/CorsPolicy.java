package com.ibm.shopping;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class CorsPolicy extends WebMvcConfigurerAdapter {
	@Override
	public void addCorsMappings(CorsRegistry r) {
		r.addMapping("/**").allowedMethods("*").allowedOrigins("*");
	}
}
