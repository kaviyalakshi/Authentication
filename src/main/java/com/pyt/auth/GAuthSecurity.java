package com.pyt.auth;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableOAuth2Client;

@EnableOAuth2Client
@Configuration
public class GAuthSecurity extends WebSecurityConfigurerAdapter  {
	
@Override
protected void configure(HttpSecurity http) throws Exception {
    http
            .csrf()
                .disable()
            .antMatcher("/**")
            .authorizeRequests()
            .antMatchers("/", "/index.html")
                    .permitAll()
                .anyRequest()
                    .authenticated();
    }
}

