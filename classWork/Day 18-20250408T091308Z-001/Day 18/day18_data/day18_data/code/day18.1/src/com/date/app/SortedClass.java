package com.date.app;

import static java.lang.Thread.currentThread;
import com.app.core.*;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.IntStream;

public class SortedClass implements Runnable{
	private String fileName;
	private Map<String, Student> maps;
	private String City; 
	
	 public SortedClass(String fileName, Map<String, Student> maps) {
		super();
		this.fileName = fileName;
		this.maps = maps;
		this.City = City;
	
	
		System.out.println("in ctor of "+getClass() +"invoked by "+currentThread().getName());
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName());
		
		try(PrintWriter pw = new PrintWriter(new FileWriter(fileName))) {
			Comparator<Student> comp = (s1,s2)->
			{int retVal = s1.getSubject().name().compareTo(s2.getSubject().name());
			if (retVal == 0)
				return ((Double)s1.getGpa()).compareTo(s2.getGpa());
			return retVal;	
			};
			
			
			//s1.getDob().compareTo(s2.getDob())
					maps.values()//converting to collection
					.stream()
					.sorted(comp)
					.forEach(s->pw.println(s));
					
			
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName()+"get erroe"+e);
			
		}
		System.out.println(Thread.currentThread().getName()+"over");
		
		
		
		
		
	}
	
	
	

}
