/**
 * 
 */
package com.sathya.customer.model;

/**
 * @author SOMAPANGU MAHESH
 *
 */
public class CustomerDto {
	private String customerId;
	private String customerName;
	private String customerCode;
	private AddressDto customerAddress;
  
	public CustomerDto() {
		super();
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerCode() {
		return customerCode;
	}

	public void setCustomerCode(String customerCode) {
		this.customerCode = customerCode;
	}

	public AddressDto getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(AddressDto customerAddress) {
		this.customerAddress = customerAddress;
	}
}
