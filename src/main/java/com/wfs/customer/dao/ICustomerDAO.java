package com.wfs.customer.dao;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.wfs.customer.model.Customer;

@Repository
public class ICustomerDAO implements CustomerDAO {

	@Override
	public ResponseEntity<?> getAllCustomer() {
		return null;
	}

	@Override
	public Customer getCustomerById(int id) {
		return null;
	}

}
