package com.beyond.operator.practice;

public class C_Arithmetic {
	/*
	 * 산술 연산자(논리 제외 ㄱㄴ)
	 * + : 더하기
	 * - : 빼기
	 * * :곱하기
	 * / : 나누기
	 * % : 나머지
	 * 
	 */
	
	public void method1() {
		// 정수의 산술 연산
		int number1 = 10;
		int number2 = 3;
		System.out.printf("%d + %d = %d\n", number1, number2, (number1 + number2));
		System.out.printf("%d - %d = %d\n", number1, number2, (number1 - number2));
		System.out.printf("%d * %d = %d\n", number1, number2, (number1 * number2));
		System.out.printf("%d / %d = %d\n", number1, number2, (number1 / number2));
		System.out.printf("%d %% %d = %d\n", number1, number2, (number1 % number2));
		// %%로 쓰면 문자로 인식 됨
		//문자의 산술 연산
		System.out.println((char)('문'+1));
		System.out.println('a'+'b');
		System.out.println();
		
		//실수의 산술 연산
		double dNumber1=35.0;
		double dNumber2=10.0;
		
		System.out.printf("%.1f + %.1f = %.1f\n",dNumber1, dNumber2,(dNumber1+dNumber2));
		System.out.printf("%.1f - %.1f = %.1f\n",dNumber1, dNumber2,(dNumber1-dNumber2));
		System.out.printf("%.1f * %.1f = %.1f\n",dNumber1, dNumber2,(dNumber1*dNumber2));
		System.out.printf("%.1f / %.1f = %.1f\n",dNumber1, dNumber2,(dNumber1/dNumber2));
		System.out.printf("%.1f %% %.1f = %.1f\n",dNumber1, dNumber2,(dNumber1%dNumber2));
		
		
		// 0으로 나누면 에러 ArithmeticException
		//System.out.println(5/0);
		System.out.println(5 / 0.0);//Infinity
		System.out.println(5 % 0.0);//NaN(not a number)
		System.out.println((5 / 0.0)+2);//Infinity
		System.out.println((5 % 0.0)+2);//NaN(not a number)
		
		System.out.println(Double.isFinite(5 / 0.0));// T/F return
		System.out.println(Double.isNaN(5 % 0.0));
		
	}
	
	
}
