package com.wizeline.wizelinego.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wizeline.wizelinego.model.Customer;

/**
 * @Author: Frank
 * Last Modification: 31/08/2021
 * Customer Repository
 */


@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer>{

	public List<Customer> findAll();
	public Customer findByCustomerId(Long customerId);
	
}

	
