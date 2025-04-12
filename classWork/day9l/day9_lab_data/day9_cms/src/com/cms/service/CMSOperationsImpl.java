package com.cms.service;

import java.nio.channels.IllegalChannelGroupException;
import java.time.LocalDate;

import com.cms.core.Customer;
import com.cms.core.ServicePlan;
import com.cms.custom_exceptions.CMSException;
import com.cms.validations.CMSValidations;
import static com.cms.validations.CMSValidations.parseAndValidatePlan;

public class CMSOperationsImpl implements CMSOperations {
	// state
	private Customer[] customers;
	private int counter;

	// add a ctor
	public CMSOperationsImpl(int size) {
		this.customers = new Customer[size];
	}

	@Override
	public String registerCustomer(String firstName, String lastName, 
			String email, String password, double regAmount,
			String dob, String plan) throws CMSException,
	IllegalArgumentException{
		//1. invoke validation rule
		ServicePlan myPlan = parseAndValidatePlan(plan, regAmount);
		//2. => success
		//parse DoB
		LocalDate date=LocalDate.parse(dob);
		Customer c=new Customer(firstName, lastName,
						email, password, regAmount, date, myPlan);
		customers[counter++]=c;		
		return "Customer reg successful , YOur ID "+c.getCustomerId();
	}

}
