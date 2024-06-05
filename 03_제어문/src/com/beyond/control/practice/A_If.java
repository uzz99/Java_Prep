package com.beyond.control.practice;

import java.util.Scanner;

public class A_If {
	/*
	 * if문
	 * 	[표현법]
	 * 		if(조건식){
	 * 			실행 코드		
	 * }
	 */
	public void method1() {
		// 사용자에게 입력받은 정수값이 홀수인지 짝수인지
		Scanner sc=new Scanner(System.in);
		System.out.println("정수값 입력");
		int num=sc.nextInt();
			
		if(num%2==0) {
			System.out.printf("%d은(는) 짝수이다.\n",num);	
		}else {
			System.out.printf("%d은(는) 홀수이다.\n",num);	
		}
	}
	
	//사용자에게 이름을 입력받아 '홍길동'이 맞는지 확인하기
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 입력");
		String name = sc.next();

		System.out.println("홍길동"=="홍길동");	
		System.out.println("홍길동"==new String("홍길동"));	
		System.out.println("홍길동"==name);
		System.out.println("홍길동".equals("홍길동"));
		System.out.println("홍길동".equals(new String("홍길동")));
		System.out.println("홍길동".equals(name));
		
		if(name.equals("홍길동")) {

			System.out.printf("%s은(는) 홍길동 본인이다.",name);	
		}else {

			System.out.printf("%s은(는) 홍길동 본인이 아니다.",name);	
		}
	}
	
	public void method3() {
		//사용자에게 알파벳 하나를 입력받아 대문자인지 소문자인지 확인 후에 출력
		char alphabet = '\u0000';

		System.out.println("알파벳 입력 > ");
		Scanner sc = new Scanner(System.in);
		alphabet = sc.nextLine().charAt(0);
		
		if(alphabet>='A' && alphabet<='Z') {
			System.out.printf("%c은(는) 알파벳 대문자이다.",alphabet);
		}else if(alphabet>='a' && alphabet<='z') {
			System.out.printf("%c은(는) 알파벳 소문자이다.",alphabet);
		}else {
			System.out.printf("%c은(는) 알파벳이 아니다.",alphabet);
		}
	}

	public void practice() {
		Scanner sc=new Scanner(System.in);
		System.out.println("점수 > ");
		int score = 0;
		score = sc.nextInt();

		if(score>=90) {
			System.out.println("A 등급");
		}
		else if(score>=80) {
			System.out.println("B 등급");
		}
		else if(score>=70) {
			System.out.println("C 등급");
		}
		else if(score>=60) {
			System.out.println("D 등급");
		}
		else {
			System.out.println("F 등급");
		}
		
	}
}
