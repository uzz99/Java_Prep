package com.beyond.object.practice;

//접근 제한자 생략 시 defalut 접근 제한 적용
class Phone {
	//필드 정의
	private String brand;
	private String name;
	private String color;
	
	// 생성자 정의
	public void Phone() {
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	
	// 메소드 정의

}
