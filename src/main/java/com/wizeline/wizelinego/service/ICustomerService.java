package com.wizeline.wizelinego.service;

import java.util.List;
import org.springframework.stereotype.Service;
import com.wizeline.wizelinego.model.Customer;

/**
 * @Author: Frank
 * Last Modification: 31/08/2021
 * Service
 */


@Service
public interface ICustomerService {
	public Customer saveCustomer(Customer customer);
	public Boolean updateCustomer(Customer customer);
	public Boolean deleteCustomer(Long customerId);
	public List<Customer> findAll();
	public Customer findByCustomerId(Long customerId);
}
