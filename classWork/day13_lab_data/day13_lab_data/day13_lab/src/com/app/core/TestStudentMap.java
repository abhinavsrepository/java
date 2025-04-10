package com.app.core;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeMap;

public class TestStudentMap {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// create empty HashMap to store student details - init capa =128
			HashMap<String, Student> students = new HashMap<>(128);
			System.out.println(students);// {}
			// populate the map
			System.out.println("rets " + students.put("dac-0009", new Student("dac-0009", "Rama", 80)));
			System.out.println("rets " + students.put("dac-0009", new Student("dac-0009", "Mihir", 70)));
			System.out.println("rets " + students.put("dac-0031", new Student("dac-0031", "Kiran", 85)));
			System.out.println("rets " + students.put("dac-0015", new Student("dac-0015", "Souma", 76)));
			System.out.println("rets " + students.put("dac-0024", new Student("dac-0024", "Samay", 72)));
			System.out.println("rets " + students.putIfAbsent("dac-0009", new Student("dac-0009", "Riya", 71)));
			// System.out.println(students);
			// display student details - on separate lines
			System.out.println("All students - ");
			for (Student s : students.values())// Collection<Student>
				System.out.println(s);
			System.out.println("Enter roll no -");
			String rollNo = sc.next();
			Student student = students.get(rollNo);
			if (student == null)
				System.out.println("Invalid roll no !!!!!!!");
			else
				System.out.println(student);
			System.out.println("Enter roll no to cancel admission");
			rollNo = sc.next();
			student = students.remove(rollNo);
			if (student == null)
				System.out.println("Can't cancel admission : Invalid roll no !!!!!!!");
			else
				System.out.println("student - " + student.getName() + " admission cancelled !");
			System.out.println("All students after remove -  ");
			for (Student s : students.values())// Collection<Student>
				System.out.println(s);
			/*
			 * 6. Update student's marks
				i/p - roll no , new marks Hint - get , setter for  marks
			 * 
			 * 
			 */
			System.out.println("Enter roll no n new marks");
			student=students.get(sc.next());
			int newMarks=sc.nextInt();
			if(student == null)
				System.out.println("Can't update marks  : Invalid roll no !!!!!!!");
			else {
				student.setMarks(newMarks);
				System.out.println("marks updated !");
			}
			System.out.println("All students after update -  ");
			for (Student s : students.values())// Collection<Student>
				System.out.println(s);
			/*
			 * 7. Display names of all  students , having marks > specified marks
			 * Hint - since it involves searching using value based criteria
			 * convert Map -> Collection (using values)
			 * Collection<V> values() 
			 * then simply iterate n filter 
			 */
			System.out.println("Enter min marks");
			int marks=sc.nextInt();
			System.out.println("Students securing marks > "+marks);
			for(Student s : students.values()) {
				if(s.getMarks()>marks)
				{
					System.out.println(s.getName());
				}
			}
			/*
			 * Sort student details as per roll no(asc)

			 */
			TreeMap<String,Student> sortedStudentsMap=new TreeMap<>(students);
			System.out.println("Student details sorted as per roll no ");
			for(Student s : sortedStudentsMap.values())
				System.out.println(s);
			
		

		}

	}

}
