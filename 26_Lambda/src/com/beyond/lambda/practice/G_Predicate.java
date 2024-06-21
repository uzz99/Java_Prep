package com.beyond.lambda.practice;

import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class G_Predicate {
	
	/*
	 * Predicate
	 * 	- Predicate 표준 함수적 인터페이스는 매개변수와 boolean 값을 리턴하는 test() 추상 메소드를 가지고 있다.
	 *  - test() 추상 메소드 매개값을 조사해서 t/f 를 리턴
	 *  
	 */
	public void method1() {
		Predicate<String> predicate = (s) -> {return s.equals("홍길동");};
		
		System.out.println(predicate.test("이몽룡"));
		System.out.println(predicate.test("홍길동"));
		
		BiPredicate<String, String> biPredicate = (s1, s2) -> s1.equals(s2);
		
		System.out.println(biPredicate.test("이몽룡", "홍길동"));
		
//		Arrays.asList(1,2,3,4,5,6).stream().filter(i -> i % 2 == 0));
	}
	

}
