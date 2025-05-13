package com.cdac.dependent;

import com.cdac.dependency.Coach;
import com.cdac.dependency.Teacher;


public class PublicSchool implements School {	
	private Teacher subjectTeacher;//=new EnglishTeacher();
	private Coach sportsCoach;
	
	//constr based D.I
	public PublicSchool(Teacher myTeacher) {

		this.subjectTeacher=myTeacher;
		
		System.out.println("In constructor - " + getClass()+""+subjectTeacher+""+sportsCoach);
	}

	@Override
	//BL method
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
	//optional dependencies are injected - setter based D.I
	
	

	public Coach setSportsCoach(Coach SportsCoach) {
		
		this.sportsCoach=SportsCoach;
		
		return sportsCoach;
	}

	@Override
	public void organizeSportsEvent() {
		System.out.println("spend 30 min in strength trainging n cardio");
		System.out.println(sportsCoach.getDailyWorkout());
		
	
		
	}
	

	

}
