package com.sathya.customer.service;

import com.sathya.customer.model.CustomerDto;

public interface CustomerService {
	void saveCustomerDetails(CustomerDto customerDto);
    void saveMultipleCustomers(CustomerDto customerDto);
}
