package de.aclue.demodependencyinjection01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import de.aclue.demodependencyinjection01.model.Order;
import de.aclue.demodependencyinjection01.service.NewsletterService;
import de.aclue.demodependencyinjection01.service.OrderService;

@SpringBootApplication
public class DemoDependencyInjection01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoDependencyInjection01Application.class, args);
		
		OrderService orderService = context.getBean(OrderService.class);
		long customerId = 123l;
		Order order = orderService.createOrder("3 Bananen", 123L);
		System.out.println(order);
		
		NewsletterService newsletterService = context.getBean(NewsletterService.class);
		newsletterService.sendNewsletter(customerId);
	}

}
