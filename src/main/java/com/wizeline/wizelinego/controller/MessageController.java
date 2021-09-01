package com.wizeline.wizelinego.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Author: Frank
 * Last Modification: 31/08/2021
 * Hello World Message Controller 
 */


@RestController
@RequestMapping(path="/api/")
public class MessageController {

	@GetMapping(value="v1/messages")
	public ResponseEntity<?> showHelloWorldMessage(){
		return new ResponseEntity<String>("Hello World Golang !!! :)",HttpStatus.OK);
	}	
	
}
