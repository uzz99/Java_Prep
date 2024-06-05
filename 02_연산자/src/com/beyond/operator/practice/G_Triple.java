package com.beyond.operator.practice;

import java.util.Scanner;

public class G_Triple {
	/*
	 * 삼항 연산자
	 * 	[표현법]
	 * 		조건식 ? 식1 : 식2(값, 변수, 다른 연산식 등)
	 */		
	/*
	 * 사용자에게 입력받은 정수가 양수인지, 음수인지 판별 후 출력
	 * 
	 * 예)
	 * 정수값 입력 > 2
	 * 2은(는) 양수이다.
	 * 
	 * 정수값 입력 > -3
	 * -3은(는) 음수이다.
	 * 
	 * 정수값 입력 > 0
	 * 0은(는) 0이다.
	 * 
	 * 
	 * 
	 */
	public void method1() {
		int number = 0;
		String result="";
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수값 입력 > ");
		number=scanner.nextInt();
		//result=(number>0) ? "양수이다." : "음수이다.";
		result=(number>0) ? "양수이다." :(number==0) ? "0입니다." : "음수이다.";//삼항 연산자 중첩 사용 가능
		System.out.printf("%d은(는) %s",number,result);
		
	}

	
}
