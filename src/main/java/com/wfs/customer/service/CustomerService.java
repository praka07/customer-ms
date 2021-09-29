package com.wfs.customer.service;

import org.springframework.http.ResponseEntity;

import com.wfs.customer.model.Customer;

public interface CustomerService {

	ResponseEntity<?> getAllCustomer();

	Customer getCustomerById(int id);

}
