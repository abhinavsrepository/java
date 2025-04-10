package com.cms.io;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.cms.*;
import java.io.OutputStreamWriter;
import java.util.*;
import com.cms.core.Customer;

public interface IoUtils {
	
	static void storeCustomerDetails(Map<String,Customer>customer,String fileName)
	{
		//chain of stream 
		//java app ==> oos :serial(object to binary)
		try(ObjectOutputStream out = new ObjectOutputStream 
				(new FileOutputStream(fileName) )){
			out.writeObject(customer);
		}
	catch (Exception e) {
		// TODO: handle exception
	}
		
		//add a static method to restore customer details from the serialized bin file
		//in the map
	}
	
	
	static Map<String,Customer> restoreCustomerDetails(Map<String,Customer> customers,String fileName) {
		//app -->oos deserial (bin -->object) -- FIS(bin file)
		try ( ObjectInputStream in = new ObjectInputStream (new FileInputStream(fileName)))	{
			
			return (HashMap<String,Customer>)in.readObject();
			
			
		}
		catch (Exception e) {
			System.out.println(e);
			return new HashMap<>();
		}

}
}

