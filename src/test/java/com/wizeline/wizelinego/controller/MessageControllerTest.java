package com.wizeline.wizelinego.controller;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

/**
 * @Author: Frank
 * Last Modification: 31/08/2021
 * Test Hello World Message
 */


@ExtendWith(SpringExtension.class)
@WebMvcTest(MessageController.class)
class MessageControllerTest {
	
	@Autowired
    private MockMvc mockMvc;


	@AfterEach
	void tearDown() throws Exception {
	}
	
	@Test
	public void checkMessage2() throws Exception{
		mockMvc.perform(get("/api/v1/messages"))
		.andExpect(content().string("Hello World Golang !!! :)"));
	}	

	@Test
	public void checkMessage() throws Exception{
		
		RequestBuilder request = MockMvcRequestBuilders.get("/api/v1/messages");
		MvcResult result = mockMvc.perform(request).andReturn();
		assertEquals("Hello World Golang !!! :)", result.getResponse().getContentAsString());
	}


}
