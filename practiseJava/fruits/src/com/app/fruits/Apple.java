package com.app.fruits;

public class Apple extends Fruit{
	

	public Apple(String color,double weight) {
		super ("Apple",color,weight)
		// TODO Auto-generated constructor stub
	}
	@Override
	public String taste() {
		return "sweet and sour";
		
		
	}
	public void jam() {
		System.out.println("Making jam with" +getName()+"!")
	}

}
