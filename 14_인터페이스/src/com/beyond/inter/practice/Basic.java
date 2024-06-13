package com.beyond.inter.practice;

public interface Basic {
	// 필드,메소드,생성자 x | 상수, 추상메소드 ㄱㄴ
	int num = 0;// 상수라 무조건 퍼블릭, 인터페이스에서 필드는 무조건 상수 필드
	
//	void turnOn();
	
//	public default void print() {//default: 인터페이스를 구현하는 클래스들이 공통적으로 구현해야 하는 매소드로 지정
//		
//	}
	// 인터페이스에서 메소드는 무조건 추상 메소드이다.
	/*public abstract*/abstract void turnOn();//private가 붙으면 재정의가 안되므로 default이상만 가능
	
	/*public abstract*/void turnOff();
	
}
