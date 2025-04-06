package com.app.fruits;

public class Fruit {
	private String color;
	private double weight;
	private String name ;
	private boolean isFresh;
	
	public Fruit (String name, String color,double weight) {
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.isFresh =true;
		
	}

	public String getColor() {
		return color;
		
	}
	public double getWeight() {
		return weight;
	}
	public String getName() {
		return name;
	}
	public boolean isFresh() {
		return isFresh;
	}
	public void setFresh(boolean isFresh) {
		this.isFresh= isFresh;
	}
	@Override
	public String toString() {
		return "Name:" +name+",Color:"+color +"weight:" +weight;
	}
	public String taste() {
		return "unknown Taste";
	}
}
