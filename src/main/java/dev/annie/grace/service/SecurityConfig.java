package dev.annie.grace.service;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

        @Bean
        public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
            http
                    .csrf().disable()
                    .authorizeHttpRequests(authorizeRequests ->
                            authorizeRequests
                                    .requestMatchers("/userForm").permitAll()
                                    .requestMatchers("/saveUser").permitAll()
                                    .requestMatchers("/").permitAll()
                                    .requestMatchers("/editUser/{id}").permitAll()
                                    .requestMatchers("/updateUser").permitAll()
                                    .requestMatchers("/deleteUser/{id}").permitAll()
                                    .anyRequest().authenticated()
                    )
                    .formLogin(formLogin ->
                            formLogin
                                    .loginPage("/login")
                                    .permitAll()
                    )
                    .logout(logout ->
                            logout
                                    .logoutUrl("/logout")
                                    .permitAll()
                    );
            return http.build();
        }
}
