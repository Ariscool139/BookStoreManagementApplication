package com.digit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digit.entity.Customer;
import com.digit.repository.CustomerRepository;

@Service
public class CustomerService {

	@Autowired
	CustomerRepository customerRepository;
	
	public List<Customer> getAllCustomer()
	{
		return customerRepository.findAll();
	}
	
	public Customer createCustomer(Customer customer)
	{
		return customerRepository.save(customer);
	}
	
	public Customer deleteCustomer(int id)
	{
		Customer customer = customerRepository.findById(id).get();
		customerRepository.delete(customer);
		return customer;
	}
	
	public Customer updateCustomer(Customer customer,int customerId)
	{
		Customer cus = customerRepository.findById(customerId).get();
		cus.setCustomerId(customer.getCustomerId());
		cus.setAddress(customer.getAddress());
		cus.setCustomerEmail(customer.getCustomerEmail());
		cus.setCustomerPassword(customer.getCustomerPassword());
		cus.setCustomerPhoneNumber(customer.getCustomerPhoneNumber());
		cus.setRegisterOn(customer.getRegisterOn());
		customerRepository.save(cus);
		return cus;
		
	}
	
	public Customer getById(int id)
	{
		return customerRepository.findById(id).get();
	}
}
