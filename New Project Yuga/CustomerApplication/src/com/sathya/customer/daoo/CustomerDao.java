package com.sathya.customer.daoo;

import com.sathya.customer.model.CustomerDto;

public interface CustomerDao {
	void saveCustomerDetails(CustomerDto customerDto);
    void saveMultipleCustomers(CustomerDto customerDto);
}
