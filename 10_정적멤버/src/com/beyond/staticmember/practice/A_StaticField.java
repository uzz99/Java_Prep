package com.beyond.staticmember.practice;

public class A_StaticField {
	
	//static 필드
	// 프로그램 실행(클래스 로드)과 동시에 메모리에 생성되고, 객체들이 공유하면서 사용할 목적으로 선언
	// 정적 필드는 프로그램이 실행될 때 해당 클래스가 로드되면서 생성
	// 정적 필드는 프로그램이 종료될 때 소멸된다.
	// 기존 객체는 객체가 생성될 때 생성,사용되지 않을 때 소멸
	public static int number = 2;
	
	private static String message="A_StaticField에 선언된 정적 필드입니다.";

	
	//Static 필드에 대한 Getter와 Setter 메소드 또한 static 키워드가 붙어야 한다.
	public static String getMessage() {
		return message;
	}

	public static void setMessage(String message) {
		A_StaticField.message = message;
	}
	
	
	
	
	

}
