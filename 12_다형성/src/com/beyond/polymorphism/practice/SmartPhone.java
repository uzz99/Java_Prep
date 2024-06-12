package com.beyond.polymorphism.practice;

public class SmartPhone extends Product{
	
	private String mobileAgency;//통신사
	public SmartPhone() {
		
	}
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
	public String toString() {
		return "SmartPhone [mobileAgency=" + mobileAgency + ", brand=" + brand + ", code=" + code + ", name=" + name
				+ ", price=" + price + "]";
	}	
	

	
}
