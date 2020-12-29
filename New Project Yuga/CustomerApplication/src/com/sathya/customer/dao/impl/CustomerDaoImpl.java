package com.sathya.customer.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.sathya.customer.daoo.CustomerDao;
import com.sathya.customer.model.AddressDto;
import com.sathya.customer.model.CustomerDto;

public class CustomerDaoImpl implements CustomerDao {
	@Override
	public void saveCustomerDetails(CustomerDto customerDto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root",
					"mahesh");
			
			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into customertab values(?,?,?,?)");
			AddressDto addressDto = customerDto.getCustomerAddress();
			String address = addressDto.getHouseNo() + "," + addressDto.getStreetName() + ","
					+ addressDto.getCountryName() + "," + addressDto.getPinCode();
			preparedStatement.setString(1, customerDto.getCustomerId());
			preparedStatement.setString(2, customerDto.getCustomerName());
			preparedStatement.setString(3, customerDto.getCustomerCode());
			preparedStatement.setString(4, address);
			int customerCount = preparedStatement.executeUpdate();
			System.out.println(customerCount);
			if (customerCount > 0) {
				System.out.println("customer details inserted sucess fully");
			} else {
				System.out.println("customer details inserted failed");
			}
			connection.close();
		} catch (Exception exception) {
			exception.printStackTrace();
		}

	}
	@Override
	public void saveMultipleCustomers(List<CustomerDto> customerDto) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/customer", "root",
					"mahesh");
			for(int i=0;i<)
			PreparedStatement preparedStatement = connection
					.prepareStatement("insert into customertab values(?,?,?,?)");
			AddressDto addressDto= customerDto.getCustomerAddress();
			String address= addressDto.getHouseNo()+","+addressDto.getStreetName()+","+addressDto.getCountryName()+","+addressDto.getPinCode();
			preparedStatement.setString(1, customerDto.getCustomerId());
			preparedStatement.setString(2, customerDto.getCustomerName());
			preparedStatement.setString(3, customerDto.getCustomerCode());
			preparedStatement.setString(4, address);
			preparedStatement.executeBatch();
			System.out.println("details inserted sucessfully");
			connection.close();
		} catch (Exception exception) {
			exception.printStackTrace();
		}
	}
}