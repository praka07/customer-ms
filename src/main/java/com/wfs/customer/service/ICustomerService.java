package com.wfs.customer.service;

import com.wfs.customer.dao.CustomerDAO;
import com.wfs.customer.model.ClosedAccountProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.wfs.customer.model.Customer;

import java.util.List;
import java.util.Optional;

@Service
public class ICustomerService implements CustomerService {

    @Autowired
    CustomerDAO daoObj;

    @Override
    public List<ClosedAccountProduct> getAllCustomer() {

        return (List<ClosedAccountProduct>) daoObj.findAll();
    }

    @Override
    public ClosedAccountProduct getCustomerById(int id) {
        Optional<ClosedAccountProduct> closedAccountProduct = daoObj.findById(id);
        return closedAccountProduct.get();
    }

    @Override
    public ResponseEntity<?> addCustomer(ClosedAccountProduct requestClosedAccountProduct) {
        try {
            daoObj.save(requestClosedAccountProduct);
            return ResponseEntity.status(HttpStatus.OK).body("{\"message\":\"added successfully\"}");
        }catch (Exception e){

            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());

        }
    }

}
