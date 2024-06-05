package com.beyond.control.practice;

import java.util.Scanner;

public class G_LoopPractice {
	Scanner sc=new Scanner(System.in);
	
	/*
	 * 실습 문제 1
	 * 사용자가 입력한 단을 출력하시오. 
	 * 
	 * 예시 1)
	 *    단 수(2 ~ 9)를 입력해 주세요. > 3
	 *    3 X 1 = 3
	 *    ...
	 *    3 X 9 = 27
	 *    
	 * 예시 2)
	 *    단 수(2 ~ 9)를 입력해 주세요. > 12
	 *    2 ~ 9 사이의 양수를 입력하여야 합니다.
	 */
	public void practice1() {
		System.out.println("단 수(2 ~ 9)를 입력해 주세요. > ");
		int num = sc.nextInt();
		if(num<=9 && num>=2) {
			for(int i=1;i<=9;i++) {
				System.out.printf("%d X %d = %d",num,i,num*i);
			}
		}else {
			System.out.println("2 ~ 9 사이의 양수를 입력하여야 합니다.");
		}
		
		
	}
	
	/*
	 * 실습 문제 2
	 * 아래와 같이 출력 되도록 중첩 for 문을 작성하시오.
	 * 
	 * 예시)
	 *   1***
	 *   *2**
	 *   **3*
	 *   ***4
	 */
	public void practice2() {
		for(int i=1;i<=4; i++) {
			for(int j=1;j<=4; j++) {
				if(i==j) {
					System.out.print(i);
				}else {

                    System.out.print("*");
				}
			}
			System.out.println("");
		}
	}
	
	/*
	 * 실습 문제 3
	 * 아래와 같이 출력 되도록 중첩 for 문을 작성하시오.
	 * 
	 * 예시)
	 *   *
	 *   **
	 *   ***
	 *   ****
	 *   *****
	 */
	public void practice3() {
		for(int i=1; i<=5; i++) {
			for(int j=0; j<i; j++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}
	
	/*
	 * 실습 문제 4
	 * 
	 * 반복적으로 두 정수를 입력받고 연산자 기호(+, -, *, /)를 입력 받아서 계산을 출력하라
	 * 단, 연산자 기호를 잘못 입력하는 경우 "연산자를 잘못 입력하셨습니다." 출력하고 프로그램을 종료한다.
	 * 
	 * 예시)
	 *   첫 번째 수 > 3
	 *   두 번째 수 > 4
	 *   연산자 입력(+, -, *, /) > +
	 *   
	 *   3 + 4 = 7
	 *   
	 *   첫 번째 수 > 3
	 *   두 번째 수 > 4
	 *   연산자 입력(+, -, *, /) > a
	 *   
	 *   연산자를 잘못 입력하셨습니다.
	 */
	public void practice4() {
		System.out.println("첫 번째 수 > ");
		int num1 = sc.nextInt();
		System.out.println("두 번째 수 > ");
		int num2 = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("연산자 입력(+, -, *, /) > ");
		char oper = sc.nextLine().charAt(0);
		
		int result = 0;

		switch(oper) {	
			case '+':
				result=num1+num2;
				System.out.printf("%d %c %d = %d",num1,oper,num2,result);
				break;
			case '-':
				result=num1+-num2;
				System.out.printf("%d %c %d = %d",num1,oper,num2,result);
				break;
			case '*':
				result=num1*num2;
				System.out.printf("%d %c %d = %d",num1,oper,num2,result);
				break;
			case '/':
				result=num1/num2;
				System.out.printf("%d %c %d = %d",num1,oper,num2,result);
				break;
			default:
				System.out.println("연산자를 잘못 입력하셨습니다.");
				break;
		}
	}

	
	/*
	 * 실습 문제 5
	 * 사용자가 "안녕하세요."라고 입력을 하면 아래와 같이 출력 되도록 코드를 작성하라.
	 * '안'
	 * '녕'
	 * '하'
	 * '세'
	 * '요'
	 * '.'
	 */
	public void practice5() {
		String str = "안녕하세요.";
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
		}
	}
}