package com.digit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digit.entity.Address;
import com.digit.entity.Customer;
import com.digit.repository.AddressRepository;

@Service
public class AddressService {

	@Autowired
	AddressRepository addressRepository;
	
	public List<Address> getAllAddress()
	{
		return addressRepository.findAll();
	}
	
	public Address addAddress(Address address)
	{
		return addressRepository.save(address);
	}
	
	public Address deleteAddress(int id)
	{
		Address address = addressRepository.findById(id).get();
		addressRepository.delete(address);
		return address;
	}

	
	public Address updateAddress(Address address, int addressId) {
		// TODO Auto-generated method stub
		Address add = addressRepository.findById(addressId).get();
		add.setAddress(address.getAddress());
		add.setAddressId(address.getAddressId());
		add.setCity(address.getCity());
		add.setCountry(address.getCountry());
		add.setPincode(address.getPincode());
		addressRepository.save(add);
		return add;
	}
}
