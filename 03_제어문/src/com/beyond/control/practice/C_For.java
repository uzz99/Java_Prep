package com.beyond.control.practice;

import java.util.Scanner;

public class C_For {
	/*
	 * for 문
	 * [표현법]
	 * 	for(int i=0; 조건식; 증감식){
	 * 		
	 * }
	 */
	//1~10 합계
	public void method1() {
		int result = 0;
		for(int i=1; i<=10; i++) {
			result+=i;
		}
		System.out.println("합계 : " + result);
	}
	//1부터 랜덤값(1~10)까지의 합계
	/*
	 * random()메소드를 사용해서 랜덤값을 발생시킬 수 있다.
	 * random() 매소드 호출 시 -> 0.0 ~ 0.9999... 사이의 랜덤값을 발생(0.0<=랜덤<=1.0)
	 */
	public void method2() {
		int result = 0;
		double rd=(int)(Math.random()*10+1);
		for(int i=1; i<=10; i++) {
			result+=i;
		}
		System.out.println("합계 : " + result);
		
	}
	

	public void method3() {
		// 2단 ~ 9단
		for(int i = 2;i<=9;i++) {
			for(int j = 1;j<=9;j++) {
				System.out.printf("%d X %d = %d\n",i,j,i*j);
			}
			System.out.println();
		}
	}
	
	public void practice1() {
		/*
		 * 실습 문제
		 * 1부터 사용자가 입력한 수까지의 합계
		 * 
		 * 
		 * 
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("정수 > ");
		int num=sc.nextInt();
		int result = 0;
		for(int i = 1; i<=num; i++) {
			result += i;
		}

		System.out.println("총 합계 : "+ result);
	}
	
	
	
	
	
	
	
}
