package de.aclue.demodependencyinjection01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.aclue.demodependencyinjection01.model.Order;
import de.aclue.demodependencyinjection01.service.CustomerService;
import de.aclue.demodependencyinjection01.service.NewsletterService;
import de.aclue.demodependencyinjection01.service.OrderService;

@SpringBootApplication
public class DemoDependencyInjection01Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoDependencyInjection01Application.class, args);
		
		CustomerService customerService = new CustomerService();
		OrderService orderService = new OrderService(customerService);
		long customerId = 123l;
		Order order = orderService.createOrder("3 Bananen", customerId);
		System.out.println(order);
		
		NewsletterService newsletterService = new NewsletterService(customerService);
		newsletterService.sendNewsletter(customerId);
	}

}
