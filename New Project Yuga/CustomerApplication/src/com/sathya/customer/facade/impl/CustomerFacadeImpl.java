/**
 * 
 */
package com.sathya.customer.facade.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sathya.customer.facadee.CustomerFacade;
import com.sathya.customer.model.AddressDto;
import com.sathya.customer.model.CustomerDto;
import com.sathya.customer.service.CustomerService;
import com.sathya.customer.service.impl.CustomerServiceImpl;

/**
 * @author SOMAPANGU MAHESH
 *
 */
public class CustomerFacadeImpl implements CustomerFacade {

	CustomerService customerService = new CustomerServiceImpl();
	Scanner scanner = new Scanner(System.in);
	@Override
	public void saveCustomerDetails() {
		CustomerDto customerDto = new CustomerDto();
		System.out.println("Enter customer Id");
		System.out.println("Enter customer name");
		System.out.println("Enter customer code");

		AddressDto addressDto=new AddressDto();
		System.out.println("Enter house no");
		System.out.println("enter street name");
		System.out.println("enter country name");
		System.out.println("enter pincode number");
		addressDto.setHouseNo(scanner.next());
		addressDto.setStreetName(scanner.next());
		addressDto.setCountryName(scanner.next());
		addressDto.setPinCode(scanner.nextLong());

		customerDto.setCustomerId(scanner.next());
		customerDto.setCustomerName(scanner.next());
		customerDto.setCustomerCode(scanner.next());
		customerDto.setCustomerAddress(addressDto);
		customerService.saveCustomerDetails(customerDto);
	}

	@Override
	public void saveMultipleCustomers() {
		System.out.println("enter customer number ");
		int customerNumber=scanner.nextInt();
		List<CustomerDto> customerBatch=new ArrayList<>();
		for(int i=1;i<=customerNumber;i++) {



			@SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);
			CustomerDto customerDto = new CustomerDto();
			System.out.println("Enter customer Id");
			System.out.println("Enter customer name");
			System.out.println("Enter customer code");


			AddressDto addressDto=new AddressDto();
			System.out.println("Enter house no");
			System.out.println("enter street name");
			System.out.println("enter country name");
			System.out.println("enter pincode number");
			addressDto.setHouseNo(scanner.next());
			addressDto.setStreetName(scanner.next());
			addressDto.setCountryName(scanner.next());
			addressDto.setPinCode(scanner.nextLong());

			customerDto.setCustomerId(scanner.next());
			customerDto.setCustomerName(scanner.next());
			customerDto.setCustomerCode(scanner.next());
			customerDto.setCustomerAddress(addressDto);
			customerBatch.add(customerDto);
			customerService.saveMultipleCustomers(customerDto);
		}

	}
}
