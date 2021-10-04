package com.wfs.customer.dao;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;

import com.wfs.customer.model.Customer;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ICustomerDAO implements CustomerDAO {

	@Override
	public List<Customer> getAllCustomer() {
		List<Customer> customerList= new ArrayList<Customer>();
		Customer object1= new Customer();
		object1.setCustomerId(1);
		object1.setFirstName("Poc");
		object1.setLastName("User");
		customerList.add(object1);
		return customerList;
	}

	@Override
	public Customer getCustomerById(int id) {
		return null;
	}

}
