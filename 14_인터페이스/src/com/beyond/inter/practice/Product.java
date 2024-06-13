package com.beyond.inter.practice;

public abstract class Product implements Basic{// 객체 생성x
	// 추상클래스이므로 추상메소드를 가질 수 있음
	// 추상클래스이므로 메소드를 구현해주지 않아도 됨
	// 단, 본 클래스를 상속 받는 클래스에서 메소드를 구현해주지 않으면 에러 발생
	protected String brand;
	protected String code;
	protected String name;
	protected int price;

	public Product() {
	}

	public Product(String brand, String code, String name, int price) {
		this.brand = brand;
		this.code = code;
		this.name = name;
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
// 
//	@Override
//	public String toString() {
//		return "Product [brand=" + brand + ", code=" + code + ", name=" + name + ", price=" + price + "]";
//	}
	

	
	
}
