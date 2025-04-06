package com.ValidationRuleImp.app;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;

import com.bank.models.AccountTypes;

public class ValidateAccDetails {
	
	public static double MIN;
	public static int MINAGE;
	
	static {
		MIN =5000;
		MINAGE=18;
	}

	public static void checkMinBal(double bal) throws BankCustomException{
		
		if(bal<MIN) {
			throw new BankCustomException("min accoubt balance should be 50000");
			
		}

	}

	public static LocalDate checkValidAge(String dob)throws BankCustomException,DateTimeParseException{
		
		LocalDate dateofbirth =  LocalDate.parse(dob);
		Period temp = Period.between(dateofbirth,LocalDate.now());
		if(temp.getYears()<MINAGE) {
			throw new BankCustomException("for creating acc your age must be 18+");
		}
		return dateofbirth;		
	}
	
	public static AccountTypes validateAccType(String type) throws IllegalArgumentException{
		AccountTypes acc = AccountTypes.valueOf(type.toUpperCase());
		return acc;
		
		
		
		
	}
	
}
