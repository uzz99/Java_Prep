package com.beyond.field.practice;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		user.id="Kim123";//public 직접 접근 가능 	
		System.out.println(user.id);
		
		//default 같은 패키지 내에서만 직접 접근 가능
		user.name="김철수";
		System.out.println(user.name);
		
		//private 클래스 내에서만 직접 접근 가능
//		System.out.println(user.password);
		
		// 변수 구분 테스트
		user.test(10);
	}

}
