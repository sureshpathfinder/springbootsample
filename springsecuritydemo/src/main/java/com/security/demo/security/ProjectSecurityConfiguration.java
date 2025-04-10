package com.security.demo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjectSecurityConfiguration {
    @Bean
    SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(requests ->
                requests.requestMatchers("/welcome").permitAll()
                .requestMatchers("/next/test").permitAll());
       // http.formLogin(flx-> flx.disable());
        http.formLogin(Customizer.withDefaults());
        http.httpBasic(Customizer.withDefaults());
        return (SecurityFilterChain)http.build();
    }
}
