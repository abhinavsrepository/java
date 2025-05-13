package com.app.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import com.cdac.entities.User;

import lombok.AllArgsConstructor;

@Configuration // configuration class - equivalent to bean configuration xml
@EnableWebSecurity // enable spring security
@EnableMethodSecurity // enables require handling
@AllArgsConstructor
public class SecurityConfiguraton {
	private final PasswordEncoder passwordEncoder;

	// configure spring bean to add in memory implementation of userdetailsService

	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails user1 = User.builder().username("Rama kher").password(passwordEncoder.encode("123456"))
				.authorities("ROLE_USER").build();

		return new InMemoryUserDetailsManager(user1);
	}

	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
		http.csrf(csrf->csrf.disable())//disable CSRF token generation
		.authorizeHttpRequests()->request.anyRequest().authenticated()
.httpBasic(Customizer.withDefaults())	;

	return http.build();
			}
 
}
