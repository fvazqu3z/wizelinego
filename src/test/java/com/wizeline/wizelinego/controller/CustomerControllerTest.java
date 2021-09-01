package com.wizeline.wizelinego.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wizeline.wizelinego.model.Customer;
import com.wizeline.wizelinego.repository.CustomerRepository;


/**
 * @Author: Frank
 * Last Modification: 31/08/2021
 * Test Customer Controller CRUD
 */


@ExtendWith(SpringExtension.class)
@WebMvcTest(CustomerController.class)
@ComponentScan("com.wizeline")
class CustomerControllerTest {

	@Autowired
    private MockMvc mockMvc;
	
	@Autowired
	@MockBean
	private CustomerRepository customerRepository;

	@Autowired
	private ObjectMapper objectMapper;
	
	@Test
	public void findByIdTest() throws Exception {
		 //given
		Customer customer = new Customer(1L,"ana","garcia garcia","pau@hotmail.com","11111111","11111111","12345",1L,new Date(), true);

	     //when
		Mockito.when(customerRepository.findByCustomerId(1L)).thenReturn(customer);

	     //then
		String url = "/api/v1/customers/1";
		MvcResult mvcResult = mockMvc.perform(get(url)).andExpect(status().isOk()).andReturn();
		
		String actualJsonResponse = mvcResult.getResponse().getContentAsString();
		
		String expectedJsonResponse = objectMapper.writeValueAsString(customer);
		assertThat(actualJsonResponse).isEqualTo(expectedJsonResponse);		
	}	
	

	@Test
	void addCustomerTest() throws Exception {
		Customer newCustomer = new Customer(1L,"ana","garcia garcia","pau@hotmail.com","11111111","11111111","12345",1L,new Date(), true);
		Customer savedCustomer = new Customer(1L,"ana","garcia garcia","pau@hotmail.com","11111111","11111111","12345",1L,new Date(), true);
		
		Mockito.when(customerRepository.save(newCustomer)).thenReturn(savedCustomer);
		String url = "/api/v1/customers";
		mockMvc.perform(
				post(url)
		.contentType("application/json")
		.characterEncoding("UTF-8")
		.content(objectMapper.writeValueAsString(newCustomer)));
	}
	
	@Test
	void updateCustomerTest() throws Exception {
		Customer currentCustomer = new Customer(1L,"ana","garcia garcia","pau@hotmail.com","11111111","11111111","12345",1L,new Date(), true);
		Customer newCustomer = new Customer(1L,"pau","garcia garcia","pau@hotmail.com","11111111","11111111","12345",1L,new Date(), true);
		
		Mockito.when(customerRepository.save(currentCustomer)).thenReturn(newCustomer);
		String url = "/api/v1/customers";
		mockMvc.perform(
				put(url)
		.contentType("application/json")
		.characterEncoding("UTF-8")
		.content(objectMapper.writeValueAsString(newCustomer)))
		.andExpect(status().isOk());
		
	}
	
	@Test
	void deleteCustomerTest() throws Exception {
		Customer currentCustomer = new Customer(1L,"ana","garcia garcia","ana@hotmail.com","11111111","11111111","12345",1L,new Date(), true);
		Customer newCustomer = new Customer(1L,"ana","garcia garcia","ana@hotmail.com","11111111","11111111","12345",1L,new Date(), false);
		
		Mockito.when(customerRepository.save(currentCustomer)).thenReturn(newCustomer);
		
		String url = "/api/v1/customers/1";
		mockMvc.perform(
				delete(url))
			.andExpect(status().isOk());
	}

	@Test
	void findAllTest() throws Exception {
		
		Customer customerA = new Customer(1L,"ana","garcia","pau@hotmail.com","11111111","11111111","12345",1L,new Date(), true);
		Customer customerB = new Customer(2L,"blanca","garcia","pau@hotmail.com","11111111","11111111","12345",1L,new Date(), true);
		Customer customerC = new Customer(3L,"cecilia","garcia","pau@hotmail.com","11111111","11111111","12345",1L,new Date(), true);
		Customer customerD = new Customer(4L,"daniela","garcia","pau@hotmail.com","11111111","11111111","12345",1L,new Date(), true);
		Customer customerE = new Customer(5L,"erika","garcia","pau@hotmail.com","11111111","11111111","12345",1L,new Date(), true);

		List<Customer> customers = new ArrayList<Customer>();
		customers.add(customerA);
		customers.add(customerB);
		customers.add(customerC);
		customers.add(customerD);
		customers.add(customerE);

		Mockito.when(customerRepository.findAll()).thenReturn(customers);
		
		String url = "/api/v1/customers";
		MvcResult mvcResult = mockMvc.perform(get(url)).andExpect(status().isOk()).andReturn();
		String actualJsonResponse = mvcResult.getResponse().getContentAsString();
		
		String expectedJsonResponse = objectMapper.writeValueAsString(customers);
		assertThat(actualJsonResponse).isEqualTo(expectedJsonResponse);
		
	}

}
