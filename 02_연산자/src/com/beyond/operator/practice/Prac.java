package com.beyond.operator.practice;

import java.util.Scanner;

public class Prac {

	/*
	 * 실습 문제 1
	 * 
	 * 사용자한테 두 개의 정수값을 입력받아서
	 * 두 정수의 곱셈 결과 100보다 큰 경우 "결과가 100 이상입니다." 
	 * 아닌 경우 "결과가 100 보다 작습니다." 출력
	 */
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 한개를 입력하세요. > ");
		int num1 = sc.nextInt();
		System.out.println("정수 한개를 입력하세요. > ");
		int num2 = sc.nextInt();
		int mul = num1*num2;
		System.out.println((mul >= 100 ? "결과가 100 이상입니다." :"결과가 100 보다 작습니다."));
		System.out.println();
	}
	
	/*
	 * 실습 문제 2
	 * 
	 * 사용자한테 문자를 하나 입력받아서
	 * 입력한 문자가 대문자이면 "알파벳 대문자이다." 
	 * 아닌 경우 "알파벳 대문자가 아니다." 출력
	 */
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자 한개를 입력하세요. > ");
		char alphabet=sc.nextLine().charAt(0);//alt+shift+r
		System.out.println((alphabet>='A') && (alphabet<='Z') ? "알파벳 대문자이다." : "알파벳 대문자가 아니다." );
		System.out.println();
	}
	
	/*
	 * 실습 문제 3
	 * 
	 * 두 정수를 입력받고 + 또는 - 를 입력받아서 계산을 출력하라
	 * 단, + 또는 - 외의 문자를 입력하는 경우 "잘못 입력했습니다." 출력
	 * 
	 * 예시)
	 *   첫 번째 수 > 3
	 *   두 번째 수 > 4
	 *   연산자 입력(+ 또는 -) > +
	 *   
	 *   3 + 4 = 7
	 */
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 한개를 입력하세요. > ");
		int num1 = sc.nextInt();
		
		System.out.println("정수 한개를 입력하세요. > ");
		int num2 = sc.nextInt();

		sc.nextLine();
		
		System.out.println("연산자 입력(+ 또는 -) ");
		char c=sc.nextLine().charAt(0);
		
		boolean result=false;
		result=((c=='+')||(c=='-'));
		
		System.out.println(result ? (c=='+'? num1 + num2 : num1 - num2) : "잘못 입력했습니다.");
	}
}
