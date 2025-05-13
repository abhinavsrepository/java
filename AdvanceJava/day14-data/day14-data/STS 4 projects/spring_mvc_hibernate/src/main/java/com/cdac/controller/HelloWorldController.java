package com.cdac.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller /*
			 * mandatory class level annotation to tell sc , following it is a request
			 * handking controller -spring bean
			 */


//singleton and eager
public class HelloWorldController {
	public HelloWorldController() {
		System.out.println("in ctor0"+getClass());
		
	}
	@RequestMapping("/")
	/*jf
	 * Method level annotation - mandatory
	 * to map incoming request (url -pattern to
	 * handler (reques handler controller )mmethdo 
	 * can intercept ANY(get|post|put)Http method
	 * equivalet toservice (rq,rs) in servlet	 * 
	 * Usage - spring container add the entry in Handler Mapping bean
	 * Key - /(value of the req mapping annotation
	 * Value -fq handler class name.methodName
	 * 
	 * 
	 * 
	 * */
	public String sayHello() {
		System.out.println("working say hello");
		return "index";
		
	}
	
	

}
