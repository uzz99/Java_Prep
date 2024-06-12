package com.beyond.Inherit.practice;

public class SmartPhone extends Product{
	
	private String mobileAgency;//통신사

	public SmartPhone(String brand, String code, String name, int price, String mobileAgency) {
		super(brand, code, name, price);
		
		this.brand = brand;
		this.code = code;
		super.name=name;
		super.price=price;
		this.mobileAgency = mobileAgency;
	}

	public String getMobileAgency() {
		return mobileAgency;
	}

	public void setMobileAgency(String mobileAgency) {
		this.mobileAgency = mobileAgency;
	}	
	
	@Override
	public String information() {// 선언부가 부모와 동일해야함
		return String.format("%s, mobileAgency: %s\n", super.information(),this.mobileAgency);// 부모의 information 호출
	}

	
}
