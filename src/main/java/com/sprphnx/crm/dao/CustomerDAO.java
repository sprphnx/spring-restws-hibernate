package com.sprphnx.crm.dao;

import java.util.List;

import com.sprhpnx.crm.entity.Customer;

public interface CustomerDAO {

	public Customer getCustomerById(long id);
	public List<Customer> getAllCustomer();
	public void addCustomer(Customer customer);
	public void updateCustomer(Customer customer);
	public void deleteCustomer(long customerId);
	
}
