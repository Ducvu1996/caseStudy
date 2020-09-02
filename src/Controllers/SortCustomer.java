package controllers;

import java.util.Comparator;

import Models.Customer;

public class SortCustomer implements Comparator<Customer> {

	@Override
	public int compare(Customer customer_1, Customer customer_2) {
		int result=customer_1.getNameCustommer().compareTo(customer_2.getNameCustommer());
		if(result!=0) {
			return result;	
		}
		else {
			
			int year_1= Integer.parseInt(customer_1.getBirthday().substring(6));
			int year_2= Integer.parseInt(customer_2.getBirthday().substring(6));
			
			return year_2-year_1;
		}
	}
}
