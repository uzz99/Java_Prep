package com.beyond.inherit.practice;

public class Circle extends Point{
	private int radius;
	
	public Circle() {
		// TODO Auto-generated constructor stub
	}
	
	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	} 
	
	@Override
	public void draw() {
		System.out.println("(x,y): "+ "(" + super.getX() + ", " + super.getY() + ")");
		System.out.println("면적 : " + String.format("%.1f",Math.PI * radius * radius));
		System.out.println("둘레 : " + String.format("%.1f",Math.PI * radius * 2 ));
	}
}
