package com.beyond.operator.practice;

import java.util.Scanner;

public class E_Logical {
	/*
	 * 논리 연산자
	 * 	&&(and, 논리 곱)
	 * 	- 피연산자 모두 true인 경우 true
	 * 	||(or, 논리합)
	 * 	- 피연산자 중에 하나라도 t이면 t
	 */
	
	public void method1() {
		// 사용자가 입력한 정수값이 1~100 사이의 값인지
		int number = 0;
		boolean result = false;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("임의의 정수를 입력해주세요. > ");
		number = scanner.nextInt();
		
		result = (number>=1) && (number <= 100);
		System.out.printf("%d은(는) 1부터 100사이의 값인가요? %b\n",number, result);
	}
	
	public void method2() {
		//short cut 연산 테스트(단락 회로 평가)
		int number = 10;
		boolean result = false;
		
		System.out.println("&& 연산 전의 number의 값 : "+ number);
		
		result = (number < 5) && (++number > 0);//shortcut 동작: 하나가 false면 전체 연산 결과도 f이므로 뒷 연산은 수행하지 않는다.
//		result = (number < 5) & (++number > 0);//shortcut 동작X
		
		System.out.println("&& 연산 후의 number의 값 : "+ number);

		
		System.out.println("|| 연산 전의 number의 값 : "+ number);
		
		result = (number < 5) || (++number > 0);//shortcut 동작:or 연산자를 기준으로 앞이 이미 t, 굳이 뒤쪽의 연산을 수행x
//		result = (number < 5) | (++number > 0);//shortcut 동작X
		
		System.out.println("|| 연산 후의 number의 값 : "+ number);
		
		
	}
	
	/*
	 * 실습 문제
	 * 사용자가 입력한 문자 값이 알파벳 대문자인지 확인하기
	 * 
	 * 예시)
	 * 문자 하나 입력 > f
	 * 사용자가 입력한 값이 대문자입니까? :false
	 */
	public void practice() {
		char c;
		boolean result=false;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("임의의 문자를 입력해주세요. > ");
		c = scanner.nextLine().charAt(0);
		result=((int)c>=65) && ((int)c<=90);
		System.out.printf("사용자가 입력한 값이 대문자입니까? %b",result);
		
		
		
	}
}
