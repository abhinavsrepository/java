package com.cdac.dependent;

import com.cdac.dependency.Teacher;


public class PublicSchool implements School {	
	private Teacher subjectTeacher;//=new EnglishTeacher();
	
	//constr based D.I
	public PublicSchool(Teacher myTeacher) {
		System.out.println("In constructor - " + getClass());
		this.subjectTeacher=myTeacher;
	}

	@Override
	public void manageAcademics() {
		System.out.println("Managing academics here -");
		subjectTeacher.teach();
	}
	//init method
	public void anyInit() {
		System.out.println("in init of "+getClass());
	}
	//destroy method
	public void anyDestroy() {
		System.out.println("in destroy of "+getClass());
	}

	

}
