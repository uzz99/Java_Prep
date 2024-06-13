package com.beyond.inter;

import com.beyond.inter.practice.Basic;
import com.beyond.inter.practice.Desktop;
import com.beyond.inter.practice.SmartPhone;
import com.beyond.inter.practice.Television;

public class Application {

	public static void main(String[] args) {
//		Basic.num;
//		Basic b = new Basic();//참조변수로는 사용 가능, 객체 생성은 x
		// 인터페이스를 구현하는 클래스를 통해서 객체를 생성해야 함
		
		//인터페이스는 참조 변수로 사용 가능
		// 다형성을 적용해서 인터페이스를 구현하는 객체를 생성해서 참조할 수 있다.
		Basic b = new Desktop("애플","a1111","아이맥 24인치",1500000,true);
		
		b.turnOn();
		b.turnOff();
		System.out.println();
		
		Basic[] array = new Basic[4];// Basic타입의 객체를 담는다는 느낌.. 그래서 만들 수 있는 것(직접적으로 생성하지 않기 때문)
		array[0] =  new Desktop("애플","a1111","아이맥 24인치",1500000,true);
		array[1] =  new Desktop("삼성","s1111","매직스테이션",2000000,false);
		array[2] =  new SmartPhone("애플","a2222","아이폰12 미니",1500000,"KT");
		array[3] =  new Television("엘지","l1111","스마트 TV",2000000,40);
		
		for(Basic product : array) {
			product.turnOn();
			product.turnOff();
		}
	}

}
