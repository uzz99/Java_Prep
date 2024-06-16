package com.beyond.practice.model.vo.Animal;

public abstract class Animal {
	protected String name;
	protected String kinds;

	public abstract void speak();
	
	public Animal() {
		
	}
	
	public Animal(String name, String kinds) {
		this.name = name;
		this.kinds = kinds;
	}
	

	@Override
	public String toString() {
		return "저의 이름은 " + name + "이고, 종류는 " + kinds + "입니다.";
	}
	
	
	
}
