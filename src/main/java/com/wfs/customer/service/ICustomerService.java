package com.wfs.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.wfs.customer.dao.ICustomerDAO;
import com.wfs.customer.model.Customer;

import java.util.List;

@Service
public class ICustomerService implements CustomerService {

	@Autowired
	ICustomerDAO daoObj;
	@Override
	public List<Customer> getAllCustomer() {
		return daoObj.getAllCustomer();
	}
	@Override
	public Customer getCustomerById(int id) {
		return daoObj.getCustomerById(id);
	}

}
