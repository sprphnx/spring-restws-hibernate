package com.sprphnx.crm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sprhpnx.crm.entity.Customer;
import com.sprphnx.crm.service.CustomerService;

@RestController
@RequestMapping("/customers")
public class CRMRestController {

	@Autowired
	CustomerService customerService;
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello World!!!";
	}

	@GetMapping("/")
	public List<Customer> getCustomers(){
		return customerService.getAllCustomer();
	}
}
