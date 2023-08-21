package com.digit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.digit.entity.Address;
import com.digit.service.AddressService;

@RestController
public class AddressController {

	@Autowired
	AddressService addressService;
	
	@GetMapping("/address/list")
	public List<Address> getAllAddress()
	{
		return addressService.getAllAddress();
	}
	
	@PostMapping("/address/create")
	public Address addAddress(@RequestBody Address address)
	{
		return addressService.addAddress(address);
	}
	
	@DeleteMapping("/address/delete/{id}")
	public Address deleteCustomer(@PathVariable int id)
	{
		return addressService.deleteAddress(id);
	}
	
	@PutMapping("/address/update/{addressId}")
	public Address updateAddress(@RequestBody Address address, @PathVariable int addressId)
	{
		return addressService.updateAddress(address, addressId);
	}
}
