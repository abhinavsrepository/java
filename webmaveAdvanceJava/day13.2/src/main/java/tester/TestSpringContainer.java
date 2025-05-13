package tester;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cdac.dependent.PublicSchool;

public class TestSpringContainer {

	public static void main(String[] args) {
		/*
		 * org.springframework.context.support.ClassPathXmlApplication
		 * => it a class implements application interface
		 * represnrts -sc (spring container started using xml based instruction
		 * loaded from the classpath 
		 * 
		 * 
		 * 
		 * */
		
		
		try (ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("bean_config.xml")) {
			System.out.println("SC up n running !!!!!");
			
			//invoke BL of the public school spring bean
			//how to get ready to use spring bean(class loading ,inst ,constructor,DI,init method  
			
			//API of the  org.spring.beans.factory.BeanFactory if 
			//public <T> T getBean(String beanId ,Class<T> beanCLass)
			//throws BeansExp:un checked exectopn
			//T - type of Spring bean 
			PublicSchool school = ctx.getBean("public_school",PublicSchool.class);
			school.organizeSportsEvent();
			school.manageAcademics();
			PublicSchool school2 = ctx.getBean("public_school",PublicSchool.class);
			System.out.println(school==school2);//t
			//spring container will not call the protortype for the destruction method;
			
			
			
		} // JVM - ctx.close() -> SC invokes - destroy on singleton beans - marks GC
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
