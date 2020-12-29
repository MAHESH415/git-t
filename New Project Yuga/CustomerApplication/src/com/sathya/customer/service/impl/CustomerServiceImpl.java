package com.sathya.customer.service.impl;

import com.sathya.customer.dao.impl.CustomerDaoImpl;
import com.sathya.customer.daoo.CustomerDao;
import com.sathya.customer.model.CustomerDto;
import com.sathya.customer.service.CustomerService;

public class CustomerServiceImpl implements CustomerService {
	
	CustomerDao customerDao = new CustomerDaoImpl();
	@Override
    public void saveCustomerDetails(CustomerDto customerDto) {
		
		customerDao.saveCustomerDetails(customerDto);
	}

	@Override
	public void saveMultipleCustomers(CustomerDto customerDto) {
		customerDao.saveMultipleCustomers(customerDto);
	}
}
