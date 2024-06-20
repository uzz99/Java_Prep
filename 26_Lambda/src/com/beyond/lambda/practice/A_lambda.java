package com.beyond.lambda.practice;

public class A_lambda {
	
	
	public void method1() {
		Runnable runnable = new Runnable() {

			// 
			@Override
			public void run() {
				System.out.println("익명 구현 객체를 사용한 Thread 생성");
			}
			
		};
		
		// 1. 정석 람다식
		runnable = () -> {
			// Runnable 인터페이스를 구현한 익명구현 객체, 람다식을 통해서 익명구현 객체를 만드려면 run이라는 추상 메소드를 재정의하는 형태로 만들어야 함, 즉 run과 형태가 같아야 함
			// () => 매개값이 없음 | 리턴값이 없음
			System.out.println("람다식을 사용한 Thread 생성");
			
		};
		
		runnable = () -> System.out.println("람다식을 사용한 Thread 생성2"); // 2. 람다식 축약
		
		Thread thread = new Thread(runnable);
		
		thread.start();
	}
}
