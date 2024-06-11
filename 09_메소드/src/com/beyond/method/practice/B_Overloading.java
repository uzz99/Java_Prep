package com.beyond.method.practice;

public class B_Overloading {
	// 호출 시점에 구분이 되냐 안되냐
	public void test() {
		
	}

	public void test(int a) {
		
	}

	public void test(int a, String s) {
		
		
	}
	public void test(String a, int s) {
		
		
	}
	
	public void test(int a, int b) {
		
	}
	
	/*
	 * 매개변수의 이름만 다른 것은 오버로딩이 적용되지 x
	 * 이름과 상관없이 자료형의 개수와 순서가 같아서 에러 발생
	 */
//	public void test(int c, int d) {}

	// 접근제한자가 다르다고 해서 오버로딩이 적용되지 않는다
	// 자료형의 개수와 순서가 같아서 에러 발생
	// void test(int a, int b) {}

	// 반환 자료형이 다른 것은 오버로딩 적용x
	// 반환형과 상관없이 자료형의 개수와 순서가 같아서 에러 발생
	//public void test(int a, int b) {}
	
}
