package com.beyond.inherit.practice;

public class Rectangle extends Point{
	private int width;
	private int height;
	
	public Rectangle() {
		
	}

	public Rectangle(int x, int y, int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}

	@Override
	public void draw() {
		System.out.println("(x,y): "+ "(" + super.getX() + ", " + super.getY() + ")");
		System.out.println("면적 : " + width * height);
		System.out.println("둘레 : " + 2 * (width + height));
	}
	
	
}
