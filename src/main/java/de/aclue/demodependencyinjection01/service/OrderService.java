package de.aclue.demodependencyinjection01.service;

import de.aclue.demodependencyinjection01.model.Order;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class OrderService {
	
	private final CustomerService customerService;
	
	public Order createOrder(String content, Long userId) {
		return new Order(content, customerService.findCustomer(userId));
	}
	
}
