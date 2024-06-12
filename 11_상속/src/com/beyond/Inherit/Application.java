package com.beyond.Inherit;

import com.beyond.Inherit.practice.Book;
import com.beyond.Inherit.practice.Desktop;
import com.beyond.Inherit.practice.SmartPhone;
import com.beyond.Inherit.practice.Television;

public class Application {
	public static void main(String[] args) {

//		Desktop desktop = new Desktop();
		Desktop desktop = new Desktop("애플","a1111","아이맥 24인치",1800000,true);
		System.out.println(desktop.information());//부모 클래스의 메소드 호출(allinone은 출력되지 않는

		SmartPhone sp = new SmartPhone("애플","a2222","아이폰12 미니",1000000,"KT");
		System.out.println(sp.information());

		Television tv = new Television("엘지","l3333","벽걸이 TV",2000000,60);
		System.out.println(tv.information());
	
		
		// object 클래스에 메소드 오버라이딩 테스트
		Book b1= new Book("자바의 정석","남궁성",30000);
		Book b2= new Book("자바의 정석","남궁성",30000);
		Book b3= new Book("혼자 공부하는 자바","신용권",28000);
		
//		// 1. toString() 테스트
//		System.out.println(b1.toString());
//		System.out.println(b2.toString());
//		System.out.println(b3.toString());
//		System.out.println();
		
		// information()을 호출안해도 자동으로 toString()처리해 줌
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println();
		
		// 2. equals() 테스트
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
		System.out.println(b1.equals(b3));
		System.out.println();
		
		// 3. hashCode() 테스트
		System.out.println(b1.hashCode());// 원래는 객체의 주소값으로 만들기 때문에 서로 다름
		System.out.println(b2.hashCode());// 재정의 한 후 같은 값을 나타냄
		System.out.println(b3.hashCode());		
//		System.out.println("Hello".hashCode());// 문자열이 같으면 동일한 해시코드
//		System.out.println(new String("Hello").hashCode());
		System.out.println();
	}
}
