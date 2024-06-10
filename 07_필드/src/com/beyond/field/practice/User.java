package com.beyond.field.practice;

public class User {
	//필드 선언
	public String id = "hong" ;
	private String password;// = "1234";
	
	String name = "홍길동";
//
//	public void test() {
//		password="5678";
//	}
	public void test(int number) {
//		int num;
//		System.out.println(num);
		// 지역 변수는 반드시 사용하기 전에 초기화 해야 함
	
		// 매개 변수는 메소드 호출 시 반드시 값이 전달외어 오기 때문에 출력 가능
//		System.out.println(number);
		
		//지역 변수에는 접근 제한자를 붙이지 않는다 => 붙일 시 에러
		
		//필드는 클래스 전역에서 사용 가능, 생성자 | 메소드 등에서 접근 가능
		// 미 초기화 시 JVM이 기본값으로 초기화 해줌
		System.out.println(password);// 필드 출력
		
		// 매개 변수도 지역변수로 메소드 영역에서 사용이 가능하다.
	}
	
	
	
}
