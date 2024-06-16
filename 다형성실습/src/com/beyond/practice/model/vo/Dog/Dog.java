package com.beyond.practice.model.vo.Dog;

import com.beyond.practice.model.vo.Animal.Animal;

public class Dog extends Animal{
	public String PLACE = "애견카페";
	private int weight;
	
	public Dog() {
		
	}

	public Dog(String name,String kinds, int weight) {
		super.name = name;
		super.kinds = kinds;
		this.weight = weight;
	}

	public String getPLACE() {
		return PLACE;
	}

	public void setPLACE(String pLACE) {
		PLACE = pLACE;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	@Override
	public void speak() {
		System.out.println(super.toString() +" 몸무게는"+ weight + "kg 입니다.");
	}
}
