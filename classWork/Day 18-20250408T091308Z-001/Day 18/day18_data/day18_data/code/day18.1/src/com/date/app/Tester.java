package com.date.app;
import java.util.Scanner;


import threads5.EvenPrinterTask;
public class Tester {
public static void main(String []args)
try(Scanner sc = new Scanner(System.in))
System.out.println("Enter the sorted date");
		
		int sortedate= sc.nextInt();
		int unsortedate= sc.nextInt();
		
		Thread t1=new Thread(new SortedClass(sortedate, unsortedate), "even");
		
				
}
