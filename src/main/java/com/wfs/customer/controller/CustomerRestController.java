package com.wfs.customer.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.wfs.customer.model.Customer;
import com.wfs.customer.service.ICustomerService;


@RestController
public class CustomerRestController {
	@Autowired
	ICustomerService serviceObj;
	
	@GetMapping("/allcustomer")
	public ResponseEntity<?> getAllCustomers(){
		return serviceObj.getAllCustomer();
		
	}
	@GetMapping("/customer/{id}")
	public Customer getCustomerById(@PathVariable int id) {
		return serviceObj.getCustomerById(id);
	}

}
