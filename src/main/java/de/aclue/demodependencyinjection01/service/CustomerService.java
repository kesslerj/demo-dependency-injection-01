package de.aclue.demodependencyinjection01.service;

import de.aclue.demodependencyinjection01.model.Customer;

public class CustomerService {

	public Customer findCustomer(Long id) {
		return new Customer("Kunde "+id);
	}
	
}
