package com.edimoto.spring4.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by edicson on 6/2/17.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication().withUser("edicsonm@gmail.com").password("bigfoot69").roles("USER", "ADMIN");
        auth.inMemoryAuthentication().withUser("michelle.earle@hotmail.com").password("bigfoot69").roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.logout()
                .logoutUrl("/logout")
                .invalidateHttpSession(true)
                .and()
                .formLogin()
                .loginPage("/login").usernameParameter("userName").passwordParameter("password")
                .defaultSuccessUrl("/main")
                .and().httpBasic()
                .and().rememberMe().rememberMeParameter("remember_me").tokenValiditySeconds(2419200).key("spittrKey")
                .and().authorizeRequests()
                .antMatchers("/main/**").hasRole("USER")
                .antMatchers("/admin/**").hasRole("ADMIN")
                .antMatchers("/spittles/**").authenticated()
                .antMatchers("/spitter/**").authenticated()
                .antMatchers("/logout").access("isAuthenticated()")
                .anyRequest().permitAll();
    }
}
