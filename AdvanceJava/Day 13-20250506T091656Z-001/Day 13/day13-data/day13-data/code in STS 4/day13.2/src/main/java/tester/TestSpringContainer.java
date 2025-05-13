package tester;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringContainer {

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext ctx = 
				new ClassPathXmlApplicationContext("bean_config.xml")) {
			System.out.println("SC up n running !!!!!");
		} // JVM - ctx.close() -> SC invokes - destroy on singleton beans - marks GC
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
