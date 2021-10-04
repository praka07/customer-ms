package com.wfs.customer.service;

import org.springframework.http.ResponseEntity;

import com.wfs.customer.model.Customer;

import java.util.List;

public interface CustomerService {

	List<Customer> getAllCustomer();

	Customer getCustomerById(int id);

}
