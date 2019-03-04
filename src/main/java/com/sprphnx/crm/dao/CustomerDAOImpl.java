package com.sprphnx.crm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sprhpnx.crm.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public Customer getCustomerById(long id) {
		Session session = sessionFactory.getCurrentSession();
		Customer customer = session.get(Customer.class, id);
		
		return customer;
	}

	@Override
	public List<Customer> getAllCustomer() {
		Session session = sessionFactory.getCurrentSession();
		List<Customer> customers = session.createQuery("from Customer").getResultList();
		
		return customers;
	}

	@Override
	public void addCustomer(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		session.save(customer);
	}

	@Override
	public void updateCustomer(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		session.merge(customer);
		
	}

	@Override
	public void deleteCustomer(long customerId) {
		Session session = sessionFactory.getCurrentSession();
		Query query = session.createQuery("delete Customer c where c.id = :id");
		query.setParameter("id", customerId);
		query.executeUpdate();
	}

	
	
}
