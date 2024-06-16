package com.beyond.inherit.practice;

public class Person {
	private String name;
	private int age;
	private double height;
	private double weight;
	
	public Person() {
		
	}

	public Person(int age, double height, double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String information() {
		return "이름: "+ name +", 나이: " + "키: "+height + ", 몸무게: " + weight;
		
	}
	
}
