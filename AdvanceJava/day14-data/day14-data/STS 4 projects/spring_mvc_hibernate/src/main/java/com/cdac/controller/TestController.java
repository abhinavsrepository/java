package com.cdac.controller;

import java.time.LocalDateTime;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test") //class level optional but recommended annotation
public class TestController {

	public TestController () {
		System.out.println("in ctor"+getClass());
	//add req handling method to ret dynamic result using modek and view
	}
		@GetMapping("/test1")//=@RequestMapping (Method =Get):doGet
		public ModelAndView testModelAndView() {
			System.out.println("in test view");
			/*
			 * 
			 * ctor of osws modelandview(String lvn,
			 * String modelAttrName,ObjectAttribute

*/
			
			return new ModelAndView("test/display","server_time",LocalDateTime.now());
		}
	}


