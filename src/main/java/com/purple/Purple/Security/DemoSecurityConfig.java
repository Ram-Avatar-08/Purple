package com.purple.Purple.Security;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class DemoSecurityConfig {

    
    @Bean
    public UserDetailsManager UserDetailsManager(DataSource dataSource){

        //  UserDetails john=User.builder().username("john@12").password("{noop}123").roles("CUSTOMER").build();


        return new JdbcUserDetailsManager(dataSource);
        // return new InMemoryUserDetailsManager(john);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        http.authorizeHttpRequests(configurer->
        configurer.requestMatchers("/").hasAnyRole("CUSTOMER","ADMIN","SELLER")
        .requestMatchers("/admin/**").hasRole("ADMIN")
        .requestMatchers("/seller/**").hasRole("SELLER")
        .anyRequest().authenticated())
        .formLogin(form ->
        form
            .loginPage("/Mylogin")
            .loginProcessingUrl("/authenticateTheUser")
            .permitAll())
        .logout(logout-> logout.permitAll())
        .exceptionHandling(configurer->
        configurer.accessDeniedPage("/access-denied"));
        
        return http.build();

    }


}
