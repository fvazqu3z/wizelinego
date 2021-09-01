package com.wizeline.wizelinego.web;

import java.util.List;

import com.wizeline.wizelinego.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wizeline.wizelinego.model.Customer;
import com.wizeline.wizelinego.repository.CustomerRepository;

/**
 * @Author: Frank
 * Last Modification: 31/08/2021
 * Service Implementation 
 */


@Component 
public class CustomerWebService implements ICustomerService {

	@Autowired
	private CustomerRepository customerRepository; 
	
	@Override
	public Customer saveCustomer(Customer customer) {
		try {
            return customerRepository.save(customer);
       } catch (Exception e) {
            return null;
       }     
	}
	
	@Override
	public Boolean updateCustomer(Customer customer) {
		try {
			Customer tmp = customerRepository.findByCustomerId(customer.getCustomerId());
            if(tmp != null) {
            	customerRepository.save(customer);
            	return true;
            }else {
            	return false;
            }
       } catch (Exception e) {
            return false;
       }     
	}
	
	@Override
	public Boolean deleteCustomer(Long customerId) {
		try {
			Customer customer = customerRepository.findByCustomerId(customerId);
			customer.setStatus(false);
			customerRepository.save(customer);
            customer = customerRepository.findByCustomerId(customerId);
            if(customer != null && customer.isStatus() == false) {
            	return true;
            }else {	
            	return true;
            }
       } catch (Exception e) {
            return false;
       }     
	}

	@Override
	public List<Customer> findAll() {
		return customerRepository.findAll();
	}

	@Override
	public Customer findByCustomerId(Long customerId) {
		return customerRepository.findByCustomerId(customerId);
	}
	
}
