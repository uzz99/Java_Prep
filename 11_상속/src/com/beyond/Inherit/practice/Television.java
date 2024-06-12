package com.beyond.Inherit.practice;

public class Television extends Product{
	
	private int inch;//인치

	public Television(String brand, String code, String name, int price, int inch) {
		super(brand, code, name, price);
		
		this.brand = brand;
		this.code = code;
		super.name=name;
		super.price=price;
		
		this.inch = inch;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}
	@Override
	public String information() {// 선언부가 부모와 동일해야함
		return String.format("%s, inch: %d\n", super.information(),this.inch);// 부모의 information 호출
	}

}
