package de.aclue.demodependencyinjection01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import de.aclue.demodependencyinjection01.service.CustomerService;
import de.aclue.demodependencyinjection01.service.NewsletterService;
import de.aclue.demodependencyinjection01.service.OrderService;

@Configuration
public class ApplicationConfig {

	@Bean
	OrderService orderService() {
		return new OrderService(customerService());
	}

	@Bean
	NewsletterService newsletterService() {
		return new NewsletterService(customerService());
	}

	@Bean
	CustomerService customerService() {
		return new CustomerService();
	}
	
}
