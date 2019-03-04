package com.sprphnx.crm.service;

import java.util.List;

import com.sprhpnx.crm.entity.Customer;
import com.sprphnx.crm.model.CustomerDTO;

public interface CustomerService {
	
	public Customer getCustomerById(long id);
	public List<Customer> getAllCustomer();
	public void addCustomer(CustomerDTO customerDTO);
	public void updateCustomer(Customer customer);
	public void deleteCustomer(long customerId);

}
