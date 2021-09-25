/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kodigo.codemasters.config;


import org.springframework.http.HttpStatus;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

/**
 *
 * @author JoseM
 */

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
     
    private final String[] allowedControllers = new String[]{
            "/newappointment",
            "/",
            "/index",
            "/error",
            "/login",
            "/sign-up",
            "/webjars/**",
            "/css/**",
            "/js/**",
            "/img/**"
        };;
    
    
    
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        SimpleUrlAuthenticationFailureHandler handler = new SimpleUrlAuthenticationFailureHandler("/");
        
        http.antMatcher("/**")
                .authorizeRequests(a -> a
                        .antMatchers(allowedControllers).permitAll()
                        .anyRequest().authenticated()
                )
                .logout(l -> l
                    .logoutSuccessUrl("/").permitAll()
                )
                .csrf(c -> c
                   .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
                )
                .exceptionHandling(e -> e
                        .authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED))
                )
                .oauth2Login(o -> o
                        .failureHandler((request, response, exception) -> {
                            request.getSession().setAttribute("error.message", exception.getMessage());
                            handler.onAuthenticationFailure(request, response, exception);
                        })
                );
    }

}
