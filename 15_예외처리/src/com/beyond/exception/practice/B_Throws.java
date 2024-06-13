package com.beyond.exception.practice;

import java.io.IOException;

public class B_Throws {
	
	public void method1() throws ClassNotFoundException, IOException {
		System.out.println("method1() 호출");
		method2();
		System.out.println("method1() 종료");
	}
	
	private void method2() throws ClassNotFoundException, IOException {// 마찬가지로 예외를 던지고 싶으면 동일하게 선언해주기
		System.out.println("method2() 호출");
		method3();
		System.out.println("method2() 종료");
		
	}
	
	
	
	private void method3() throws IOException, ClassNotFoundException {
		// 예외를 호출한 쪽으로 예외를 전달하고자 하면 메소드 이름 옆에 throws [예외 이름1, 예외 이름2, ...]
		// 발생할 가능성이 있는 에러에 대해 다 선언해주어야 함
		System.out.println("method3() 호출");
		
		int random = (int)(Math.random()*3 + 1);
		if(random == 1) {
			throw new ClassNotFoundException();// 예외 객체를 선언하면 try-catch구문으로 감싸주는 예외처리를 진행해야 함(안하면 에러)
			
		}else if(random == 2) {
			throw new IOException();
		}
		System.out.println("method3() 종료");
	}
}
