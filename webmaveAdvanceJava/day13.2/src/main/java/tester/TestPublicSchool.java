package tester;

import com.cdac.dependency.Coach;
import com.cdac.dependency.FootballCoach;
import com.cdac.dependency.MathsTeacher;
import com.cdac.dependency.ScienceTeacher;
import com.cdac.dependent.PublicSchool;

public class TestPublicSchool {
/*
 * Instead of progs - creating dependent obj , 
 * creating dependencies 
 * n wiring - delegate all of above to SC
 */
	public static void main(String[] args) {
		PublicSchool school=new PublicSchool(new ScienceTeacher() ,new FootballCoach());
		
		school.manageAcademics();

	}

}
