package com.andresproyecto.ecommerce_spring.service;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringBootSecurity {

	private final UserDetailsService userDetailService;

	public SpringBootSecurity(UserDetailsService userDetailService) {
		this.userDetailService = userDetailService;
	}

	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http.csrf(csrf -> csrf.disable())
				.authorizeHttpRequests(auth -> auth
						.requestMatchers("/administrador/**", "/productos/**").hasRole("ADMIN")
						.anyRequest().permitAll()
				)
				.formLogin(form -> form
						.loginPage("/usuario/login")
						.permitAll()
						.defaultSuccessUrl("/usuario/acceder")
				)
				.logout(logout -> logout
						.logoutUrl("/logout")
						.permitAll()
				);
		return http.build();
	}

	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
		return authConfig.getAuthenticationManager();
	}
}
