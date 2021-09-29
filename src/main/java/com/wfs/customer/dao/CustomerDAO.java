package com.wfs.customer.dao;

import org.springframework.http.ResponseEntity;

import com.wfs.customer.model.Customer;

public interface CustomerDAO {
	public ResponseEntity<?> getAllCustomer();

	Customer getCustomerById(int id);

}
