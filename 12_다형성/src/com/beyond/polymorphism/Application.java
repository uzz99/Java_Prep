package com.beyond.polymorphism;

import com.beyond.polymorphism.practice.Desktop;
import com.beyond.polymorphism.practice.Product;
import com.beyond.polymorphism.practice.SmartPhone;
import com.beyond.polymorphism.practice.Television;

public class Application {
	public static void main(String[] args) {
		// 1. 부모 타입의 참조 변수로 부모 인스턴스를 다루는 경우
		Product pr = new Product();
		
		// product 참조 변수로 Product 클래스의 멤버만 접그 ㄴ가능
		System.out.println(pr);
		System.out.println();
		
		// 2. 자식 타입의 참조 변수로 자식 인스턴스를 다루는 경우
		Desktop desktop = new Desktop();
		
		// desktop 참조 변수로 Product, Desk 클래스의 멤버에 접근 가능
		System.out.println(desktop);
		System.out.println(desktop.isAllInOne());
		System.out.println();
		
		// 3. 부모 타입의 참조 변수로 자식 인스턴스를 다루는 경우
		Product televison = new Television(); // 업캐스팅(자동 형변환)
		// 참조변수로 Product 클래스의 멤버만 접근 가능
		System.out.println(televison);
		// 텔레비전 클래스 멤버에 접근하고 싶으면 형 변환을 해야함
		System.out.println(((Television) televison).getInch());
		
		// 4. 배열과 다형성
		// 1) 다형성을 적용하기 전
		Desktop[] array1 = new Desktop[2];
		
		array1[0] = new Desktop();
		array1[0] = new Desktop();
		
		SmartPhone[] array2= {
			new SmartPhone(),
			new SmartPhone()
		};
		
		// 2) 다형성을 적용한 후
		Product[] array3 =  new Product[4];
		
		array3[0] =  new Desktop("애플","a1111","아이맥 24인치",1500000,true);
		array3[1] =  new Desktop("삼성","s1111","매직스테이션",2000000,false);
		array3[2] =  new SmartPhone("애플","a2222","아이폰12 미니",1000000,"KT");
		array3[3] =  new Television("엘지","l1111","벽걸이 TV",2000000,60);
		
		for(Product p : array3) {
			System.out.println(p);
			if(p instanceof Desktop) {
				System.out.println("isAllInOne : " + ((Desktop)p).isAllInOne());
			}
			else if(p instanceof SmartPhone) {
				System.out.println("mobileAgency : " + ((SmartPhone)p).getMobileAgency());
			}
			else if(p instanceof Television) {
				System.out.println("inch : " + ((Television)p).getInch());
			}
			
		}
		productInfo(new Desktop());
		productInfo(new Television());
		productInfo(new SmartPhone());
		
	}
	public static void productInfo(Desktop d) {
		System.out.println(d);
	}
	public static void productInfo(Television t) {
		System.out.println(t);
	}
	public static void productInfo(SmartPhone s) {
		System.out.println(s);
	}
}
