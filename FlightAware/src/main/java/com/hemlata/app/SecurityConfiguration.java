package com.hemlata.app;
import org.springframework.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfiguration{
	@SuppressWarnings("deprecation")
	protected void configure(HttpSecurity http)throws Exception{
		http.authorizeRequests()
		.requestMatchers("/").permitAll()
		.requestMatchers("/Register").permitAll()
		.requestMatchers("/Login").permitAll()
		.requestMatchers("/home").permitAll();
		
	}
}

