package com.sprphnx.crm.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sprhpnx.crm.entity.Customer;
import com.sprphnx.crm.dao.CustomerDAO;
import com.sprphnx.crm.model.CustomerDTO;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerDAO customerDAO;
	
	@Override
	@Transactional
	public Customer getCustomerById(long id) {
		return customerDAO.getCustomerById(id);
	}

	@Override
	@Transactional
	public List<Customer> getAllCustomer() {
		return customerDAO.getAllCustomer();
	}

	@Override
	@Transactional
	public void addCustomer(CustomerDTO customerDTO) {
		Customer customer = new Customer(customerDTO.getFirstName(),customerDTO.getLastName(),customerDTO.getEmail());
		customerDAO.addCustomer(customer);
		
	}

	@Override
	@Transactional
	public void updateCustomer(Customer customer) {
		customerDAO.updateCustomer(customer);
		
	}

	@Override
	@Transactional
	public void deleteCustomer(long customerId) {
		customerDAO.deleteCustomer(customerId);
		
	}

}
