package com.example.FoodMap.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import static com.example.FoodMap.security.ApplicationUserRole.*;

//@Configuration
//@EnableWebSecurity
public class ApplicationSecurity extends WebSecurityConfigurerAdapter {
 
    /*private final PasswordEncoder passwordEncoder;

    @Autowired
    public ApplicationSecurity(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers("/", "index", "/css/*", "/js/*").permitAll()
                .antMatchers("/api/**").hasRole(REVIEWER.name())
                .anyRequest()
                .authenticated()
                .and()
                .formLogin()
                .loginPage("/login").permitAll();
    }

    @Override
    @Bean
    protected UserDetailsService userDetailsService() {
        UserDetails jim =  User.builder()
                .username("jim")
                .password(passwordEncoder.encode("password"))
                .roles(REVIEWER.name())
                .build();

        UserDetails jam =  User.builder()
                .username("jam")
                .password(passwordEncoder.encode("password"))
                .roles(ADMIN.name())
                .build();

        return new InMemoryUserDetailsManager(
            jim,
            jam
        );
    }*/

}
