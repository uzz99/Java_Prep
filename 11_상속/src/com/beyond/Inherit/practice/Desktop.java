package com.beyond.Inherit.practice;

public class Desktop extends Product{
	private boolean allInOne;//일체 여부
	//부모의 private변수는 자식이 접근 할 수 x
	
	public Desktop() {
		//super();는 맨 첫줄에 와야 에러가 발생하지x
		System.out.println("자식 클래스의 기본 생성자 호출");
		
		
	}
	
	public Desktop(String brand, String code, String name, int price, boolean allInOne) {
		super(brand, code, name, price);// 부모 클래스에 해당하는 참조
		// 부모 필드에 직접 접근해서 초기화(protected이기 때문에 가능한)
		this.brand = brand;
		this.code = code;
		super.name=name;
		super.price=price;
		this.allInOne = allInOne;
		
		//부모의 setter 메소드 호출, 초기화
//		this.setBrand(brand);
//		super.setCode(code);
//		setName(name);
//		super.setPrice(price);
		
		
	}

	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

	@Override
	public String information() {// 선언부가 부모와 동일해야함
		return String.format("%s, allInOne: %b\n", super.information(),this.allInOne);// 부모의 information 호출
//		return "Desktop 클래스에서 재정의한 infomation() 호출";
	}
	
	
	
}
