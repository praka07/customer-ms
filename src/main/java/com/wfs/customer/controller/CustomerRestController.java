package com.wfs.customer.controller;

import com.wfs.customer.model.ClosedAccountProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.wfs.customer.model.Customer;
import com.wfs.customer.service.ICustomerService;

import java.util.List;


@RestController
public class CustomerRestController {
    @Autowired
    ICustomerService serviceObj;

    @GetMapping("/allcustomer")
    public List<ClosedAccountProduct> getAllCustomers() {
        return serviceObj.getAllCustomer();

    }

    @GetMapping("/customer/{id}")
    public ClosedAccountProduct getCustomerById(@PathVariable int id) {
        return serviceObj.getCustomerById(id);
    }

    @PostMapping("/addcustomer")
    public ResponseEntity<?> addCustomer(@RequestBody ClosedAccountProduct requestClosedAccountProduct) {
        return serviceObj.addCustomer(requestClosedAccountProduct);


    }


}
