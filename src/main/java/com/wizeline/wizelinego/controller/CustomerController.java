package com.wizeline.wizelinego.controller;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wizeline.wizelinego.exception.ErrorMessage;
import com.wizeline.wizelinego.model.Customer;
import com.wizeline.wizelinego.web.CustomerWebService;

/**
 * @Author: Frank
 * Last Modification: 31/08/2021
 * Customer Controller CRUD 
 */


@RestController
@RequestMapping(path="/api/")
public class CustomerController {

	@Autowired
	private CustomerWebService customerWebService;
	
	
	@PostMapping(value="v1/customers")
	public ResponseEntity<?> saveCustomer(@RequestBody Customer customer){
		customer = customerWebService.saveCustomer(customer);
		if(customer == null) {
			return new ResponseEntity<>(new ErrorMessage(500, new Date(),"Error adding new customer","We couldn't add new customer"),HttpStatus.BAD_REQUEST);
		}else {
			return new ResponseEntity<Customer>(customerWebService.saveCustomer(customer),HttpStatus.OK);
		}
		
	}
	
	@PutMapping(value="v1/customers")
	public Boolean updateCustomer(@Valid @RequestBody Customer customer){
        return customerWebService.updateCustomer(customer);
	}	
	
	@GetMapping(value="v1/customers")
	public List<Customer> findAll(){
        return customerWebService.findAll();
	}
	
	@DeleteMapping(value="v1/customers/{customerId}")
	public Boolean deleteCustomer(@PathVariable Long customerId){
        return customerWebService.deleteCustomer(customerId);
	}
	

	@GetMapping(value="v1/customers/{customerId}")
	public ResponseEntity<?> findByCustomerId(@PathVariable Long customerId){
		Customer customer  = customerWebService.findByCustomerId(customerId);
		if(customer == null) {
			return new ResponseEntity<>(new ErrorMessage(500, new Date(),"Invalid Customer Id","Customer do not exist in Database"),HttpStatus.BAD_REQUEST);
		}else {
			return new ResponseEntity<Customer>(customer,HttpStatus.OK);
		}
	}	

}
