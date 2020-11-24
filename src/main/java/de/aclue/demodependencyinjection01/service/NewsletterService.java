package de.aclue.demodependencyinjection01.service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class NewsletterService {

	private final CustomerService customerService;
	
	public void sendNewsletter(Long customerId) {
		System.out.println("Newsletter: Hallo "+customerService.findCustomer(customerId));
	}
}
