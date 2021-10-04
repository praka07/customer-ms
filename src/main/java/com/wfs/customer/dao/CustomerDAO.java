package com.wfs.customer.dao;

import org.springframework.http.ResponseEntity;

import com.wfs.customer.model.Customer;

import java.util.List;

public interface CustomerDAO {
	List<Customer> getAllCustomer();

	Customer getCustomerById(int id);

}
