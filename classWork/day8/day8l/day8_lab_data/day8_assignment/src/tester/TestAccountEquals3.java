package tester;

import java.util.Scanner;

import com.banking.BankAccount;

public class TestAccountEquals3 {

	public static void main(String[] args) {
		try (Scanner sc=new Scanner(System.in)) {
			System.out.println("Enter a/c details - acctNo, "
					+ " firstName,  lastName, "
					+ " balance,  acctType");
			Object a1=new BankAccount(sc.next(), sc.next(), 
					sc.next(), sc.nextDouble(), sc.next());
			System.out.println("Enter another a/c details - acctNo, "
					+ " firstName,  lastName, "
					+ " balance,  acctType");
			Object a2=new BankAccount(sc.next(), sc.next(), 
					sc.next(), sc.nextDouble(), sc.next());
			System.out.println(a1.equals(a2));
			
		} 

	}

}
