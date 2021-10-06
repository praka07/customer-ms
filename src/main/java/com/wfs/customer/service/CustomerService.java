package com.wfs.customer.service;

import com.wfs.customer.model.ClosedAccountProduct;
import org.springframework.http.ResponseEntity;

import com.wfs.customer.model.Customer;

import java.util.List;

public interface CustomerService {

	List<ClosedAccountProduct> getAllCustomer();

	ClosedAccountProduct getCustomerById(int id);

	ResponseEntity<?> addCustomer(ClosedAccountProduct requestClosedAccountProduct);
}
