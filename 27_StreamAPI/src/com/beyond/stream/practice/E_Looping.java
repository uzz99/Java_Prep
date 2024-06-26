package com.beyond.stream.practice;

import java.util.Arrays;

public class E_Looping {	
	/* 
	 * 반복
	 * 	- 요소 전체를 반복하는 역할을 한다.
	 * 	- peek() 
	 * 		-> 중간처리 단계에서 전체 요소를 반복하면서 추가적인 작업을 하기위해서 사용
	 * 		-> 중간처리는 스트림이기때문에 다른 메소드 사용 ㄱㄴ
	 * 	- forEach() -> 최종처리 단계에서 전체 요소를 반복하면서 추가적인 작업을 하기위해서 사용
	 */
	public void method1() {
		int[] numbers = {1, 2, 3, 4, 5};
		int sum = 0;
		
		// 최종처리 메소드를 호출한 이후에는 다른 최종 처리 메소드를 호출할 수 x -> peek 사용 이유
		sum = Arrays.stream(numbers)
					.filter(number -> number % 2 == 0)
					.peek(number -> System.out.print(number + " "))
//					.forEach(number -> System.out.println(number));
					.sum();
		
		System.out.println("sum : " + sum);
		System.out.println();
		
		// 중간처리 단계에서 끝내기 -> 불가능
		// 중간처리 메소드는 최종처리 메소드가 호출되어야 동작
		Arrays.stream(numbers)
		.filter(number -> number % 2 == 0)
		.forEach(number -> System.out.print(number + " "));
//		.peek(number -> System.out.print(number + " "));// 최종처리 메소드가 실행되어야 동작함
	}
}
