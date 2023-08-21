package com.digit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.digit.entity.Address;
import com.digit.entity.Customer;
import com.digit.entity.CustomerFormData;
import com.digit.service.AddressService;
import com.digit.service.CustomerService;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	@Autowired
	AddressService addressService;
	
	@GetMapping("/")
	public ModelAndView getAllCustomer()
	{
		List<Customer> clist=customerService.getAllCustomer();
		ModelAndView mv = new ModelAndView("customer-index");
		mv.addObject("customer",clist);
		return mv;
	}
	
	@GetMapping("/create-customer")
	public ModelAndView createCustomer()
	{
		ModelAndView mv = new ModelAndView("add-customer");
		mv.addObject("customerformdata", new CustomerFormData());
		return mv;
	}
	
	@PostMapping("/save-cus")
	public String addCustomer(@ModelAttribute CustomerFormData customerformdata) {
		
		Customer customer = new Customer();
		Address address = new Address();
		
		address.setAddressId(customerformdata.getAddressId());
		address.setAddress(customerformdata.getAddress());
		address.setCity(customerformdata.getCity());
		address.setCountry(customerformdata.getCountry());
		address.setPincode(customerformdata.getPincode());
		addressService.addAddress(address);
		customer.setCustomerId(customerformdata.getCustomerId());
		customer.setCustomerEmail(customerformdata.getCustomerEmail());
		customer.setCustomerPassword(customerformdata.getCustomerPassword());
		customer.setCustomerPhoneNumber(customerformdata.getCustomerPhoneNumber());
		customer.setAddress(address);
		customer.setRegisterOn(customerformdata.getRegisterOn());
		customerService.createCustomer(customer);
		
		
		return "redirect:/";
	}
	
	@GetMapping("/delete-customer/{id}")
	public String deleteCustomer(@PathVariable("id")Integer id)
	{
		customerService.deleteCustomer(id);
		
		return "redirect:/";
	}
	
	@GetMapping("/update-customer/{id}")
	public ModelAndView updateCustomer( @PathVariable("id")Integer id)
	{
		ModelAndView mv = new ModelAndView("update-customer");
		CustomerFormData cus = new CustomerFormData();
		mv.addObject("customerformdata",cus);
		return mv;
	}
	
	@PostMapping("/customer-update")
	public String updateCustomer(@ModelAttribute CustomerFormData customerformdata)
	{
		Customer customer = new Customer();
		Address address = new Address();
		
		address.setAddressId(customerformdata.getAddressId());
		address.setAddress(customerformdata.getAddress());
		address.setCity(customerformdata.getCity());
		address.setCountry(customerformdata.getCountry());
		address.setPincode(customerformdata.getPincode());
		addressService.updateAddress(address,address.getAddressId());
		customer.setCustomerId(customerformdata.getCustomerId());
		customer.setCustomerEmail(customerformdata.getCustomerEmail());
		customer.setCustomerPassword(customerformdata.getCustomerPassword());
		customer.setCustomerPhoneNumber(customerformdata.getCustomerPhoneNumber());
		customer.setAddress(address);
		customer.setRegisterOn(customerformdata.getRegisterOn());
		customerService.updateCustomer(customer,customer.getCustomerId());
		
		return "redirect:/";
	}
}
