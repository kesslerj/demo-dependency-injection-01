package de.aclue.demodependencyinjection01.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import de.aclue.demodependencyinjection01.service.CustomerService;
import de.aclue.demodependencyinjection01.service.NewsletterService;
import de.aclue.demodependencyinjection01.service.OrderService;

/*
 * Alternative ApplicationConfig, using "kind of autowiring" instead of calling other methods in the config.
 * 
 */
@Configuration
public class ApplicationConfig2 {

	@Bean
	OrderService orderService(CustomerService customerService) {
		return new OrderService(customerService);
	}

	@Bean
	NewsletterService newsletterService(CustomerService customerService) {
		return new NewsletterService(customerService);
	}

	@Bean
	CustomerService customerService() {
		return new CustomerService();
	}
	
}
