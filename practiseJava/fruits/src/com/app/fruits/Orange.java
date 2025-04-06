package com.app.fruits;

public class Orange extends Fruit {

	public Orange(String color, double weight) {
		super ("Orange",color ,weight);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String taste() {
		return "sour";
	}
	public  void juice() {
		
		System.out.println("Extracting juice from"+getName()+",weight"+getWeight()+"!");
		
		
	}

}
