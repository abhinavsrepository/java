package com.app.fruits;

public class Alphonso extends Mango{
	

	public Alphonso(String color ,double weight) {
		
		super (color,weight);
		
		// TODO Auto-generated constructor stub
	}
	@Override 
	public String taste() {
		return "very very sweet";
	}
	public void pulp() {
		System.out.println("Creating pulp from "+getName+"color:"+getColor)
	}

}
