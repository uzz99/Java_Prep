package com.beyond.operator.practice;

import java.util.Scanner;

public class D_Comparison {
	/*
	 * 비교 연산자
	 * 	크기 비교(>, <, >=, <=)
	 *  동등 비교(==,!=)
	 * 
	 */
	public void method1() {
		int number1 = 10;
		int number2 = 25;
		boolean result = false;
//		result = number1 != number2;
//		result = number1 == number2;
//		result = number1 > number2;
//		result = number1 < number2;
		
//		result = 'A'== 65;
//		result = 3 == 3.0;
//		result = 3.0 == 3.0F;
		// 단 예외가 있다.
		// 부동 소수점 방식은 범위를 더 많이 표현할 수 있지만 오차가 생길 수 있음
		// 대부분 비교 연산에서는 정수 타입을 사용한다.
		result = 0.1 == 0.1F;// 소수점 오차때문에(부동소수점) false
		System.out.println("result : "+result);
	}

	public void method2() {
		/*
		 * 산술 연산 + 비교 연산
		 * 사용자에게 입력 받은 값이 짝수인지, 홀수인지 판단
		 *
		 */
		int number = 0;
		boolean result = false;
		Scanner scanner = new Scanner(System.in);
		System.out.println("임의의 정수를 입력해 주세요. > ");
		number = scanner.nextInt();
		result = ((number%12)==0);
		System.out.printf("%d는 짝수인가요? %b\n",number,result);
		
	}
}
