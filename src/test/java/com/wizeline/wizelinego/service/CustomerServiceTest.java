package com.wizeline.wizelinego.service;

import static org.junit.jupiter.api.Assertions.*;

import com.wizeline.wizelinego.web.CustomerWebService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;

import com.wizeline.wizelinego.model.Customer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringExtension;


import com.wizeline.wizelinego.repository.CustomerRepository;


@SpringBootTest
@ComponentScan("com.wizeline")
class CustomerServiceTest {

	@Autowired
	CustomerWebService customerWebService;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testSaveCustomer() {
		
	}

	@Test
	@DisplayName("Find an specific Customer by CustomerId")
	void testFindByCustomerId() {
		Customer customer = customerWebService.findByCustomerId(1L);
		assertEquals(customer.getCustomerId(), 1L);	
	}

}
