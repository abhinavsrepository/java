package com.app.core;

import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try(Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the name of the class or"
					+ " interface to find out internal details");
			
			
			/**
			 * how to load specified class in the memory are(meta space)
			 * method of java.lang.class<T>
			 * public static CLass<?>forName(String fully QualifieddClassName)
			 * 
			 * throws ClassNotFoundException
			 * loads the specified class in the method are , jvm creates
			 * the instance of class <T> in heap n rets this refernce to the caller
			 * 
			 * -- trigger for class loading
			 * creating class instance 
			 * accessing static members 
			 * class.forName(name)
			 *nameofclass.class
			 * 
			 * 
			 */
//			Class<?> anyCLass = Class.forName(sc.next());
//			
//			if (anyCLass.isInterface()) {
//				System.out.println(anyCLass.getName()+"is an i/f");
//				System.out.println("Direct super interface");
//				System.out.println(Arrays.toString(anyCLass.getGenericInterfaces()));
//				
//			} else {
//				System.out.println(anyCLass.getName()+"is an class");
//				System.out.println("Super Class");
//				System.out.println(anyCLass.getSuperclass());
//				System.out.println("implement is the interface");
//				System.out.println();
//				Arrays.stream(anyCLass.getInterfaces())
//				.forEach(System.out::println);//equivalent lambda express i ->sop(i)
				
				
				//can you find claas modifient using reflection
				//yes
			Class<?> anyCLass = Class.forName(sc.next());
				
				int modifiers = anyCLass.getModifiers();
				System.out.println(Modifier.isAbstract(modifiers)?"Abstract":"not the abstract");
		
				
			
		
			Class <Emp> empClass=Emp.class;//loading the emp class
			
			System.out.println("enter all fields"+empClass.getName());
			Arrays.stream(empClass.getDeclaredFields())
					.forEach(System.out::println);
			System.out.println("all constructor");
			Arrays.stream(empClass.getConstructors())
			.forEach(System.out::println);
			Arrays.stream(empClass.getDeclaredMethods())
			.forEach(System.out::println);
			
			
	}catch (Exception e)
		{
		System.out.println(e);
		}
			
			
		}
	}




