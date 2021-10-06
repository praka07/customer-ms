package com.wfs.customer.dao;

import com.wfs.customer.model.ClosedAccountProduct;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;

import com.wfs.customer.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerDAO extends CrudRepository<ClosedAccountProduct, Integer> {


}
