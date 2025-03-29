package com.cms.ui;

import java.util.Scanner;

import com.cms.service.CMSOperations;
import com.cms.service.CMSOperationsImpl;

public class CustomerManagementSystem {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter size");
			// 1 create service layer - service imple class instance
			CMSOperations ops = new CMSOperationsImpl(sc.nextInt());
			boolean exit = false;
			while (!exit) {
				System.out.println("Options 1 . Register Customer 0. Exit");
				System.out.println("Enter option");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter customer details - firstName, lastName,\r\n"
								+ "						email, password, regAmount, date, plan");
						System.out.println(ops.registerCustomer(sc.next(), sc.next(),
								sc.next(), sc.next(), sc.nextDouble(), sc.next(),sc.next()));
						break;

					case 0:
						exit = true;
						break;
					}
				} catch (Exception e) {
					System.out.println(e);
					System.out.println("Pls retry ...");
					sc.nextLine();// ??????????????????
				}
			}

		}

	}

}
