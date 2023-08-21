package com.digit.entity;

public class CustomerFormData {

	private int customerId;
	private String customerEmail;
	private String customerPassword;
	private String customerPhoneNumber;
	private int addressId;
	private String address;
	private String city;
	private String country;
	private String pincode;
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
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getRegisterOn() {
		return registerOn;
	}
	public void setRegisterOn(String registerOn) {
		this.registerOn = registerOn;
	}
	@Override
	public String toString() {
		return "CustomerFormData [customerId=" + customerId + ", customerEmail=" + customerEmail + ", customerPassword="
				+ customerPassword + ", customerPhoneNumber=" + customerPhoneNumber + ", addressId=" + addressId
				+ ", address=" + address + ", city=" + city + ", country=" + country + ", pincode=" + pincode
				+ ", registerOn=" + registerOn + "]";
	}
	public CustomerFormData(int customerId, String customerEmail, String customerPassword, String customerPhoneNumber,
			int addressId, String address, String city, String country, String pincode, String registerOn) {
		super();
		this.customerId = customerId;
		this.customerEmail = customerEmail;
		this.customerPassword = customerPassword;
		this.customerPhoneNumber = customerPhoneNumber;
		this.addressId = addressId;
		this.address = address;
		this.city = city;
		this.country = country;
		this.pincode = pincode;
		this.registerOn = registerOn;
	}
	public CustomerFormData() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
