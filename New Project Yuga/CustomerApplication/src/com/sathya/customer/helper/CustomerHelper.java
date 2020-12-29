package com.sathya.customer.helper;

import java.util.Scanner;

import com.sathya.customer.facade.impl.CustomerFacadeImpl;
import com.sathya.customer.facadee.CustomerFacade;

public class CustomerHelper {
	public void customerDetails() {
		CustomerFacade customerFacade = new CustomerFacadeImpl();
		Scanner scanner = new Scanner(System.in);
		System.out.print("enter your choise");
		int choice = scanner.nextInt();
		switch (choice) {
		case 1:
			customerFacade.saveCustomerDetails();
			break;
		case 2:
			customerFacade.saveMultipleCustomers();
			break;
		default:
			System.out.println("invalid choise");
			break;
		}
	}
}
