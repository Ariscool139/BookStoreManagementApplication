package com.digit.entity;

import java.text.NumberFormat.Style;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Cascade;
import org.springframework.beans.factory.annotation.Autowired;


@Entity
public class Customer {
	
	@Id
	private int customerId;
	private String customerEmail;
	private String customerPassword;
	private String customerPhoneNumber;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="addressId" , referencedColumnName = "addressId")
	private Address address;
	private String registerOn;
	
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerPassword() {
		return customerPassword;
	}
	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getRegisterOn() {
		return registerOn;
	}
	public void setRegisterOn(String registerOn) {
		this.registerOn = registerOn;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerEmail=" + customerEmail + ", customerPassword="
				+ customerPassword + ", customerPhoneNumber=" + customerPhoneNumber + ", address=" + address
				+ ", registerOn=" + registerOn + "]";
	}
	public Customer(int customerId, String customerEmail, String customerPassword, String customerPhoneNumber,
			Address address, String registerOn) {
		super();
		this.customerId = customerId;
		this.customerEmail = customerEmail;
		this.customerPassword = customerPassword;
		this.customerPhoneNumber = customerPhoneNumber;
		this.address = address;
		this.registerOn = registerOn;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//	@JoinColumn(name="addressId" , referencedColumnName = "addressId")
	

	
}
