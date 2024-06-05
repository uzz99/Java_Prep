package com.beyond.operator.practice;

import java.util.Scanner;

public class H_OperatorPractice {
	/*
	 * 실습 문제 1
	 * 
	 * 키보드로 입력받은 하나의 정수가 짝수이면 "짝수이다."
	 * 짝수가 아니면 "홀수이다"를 출력하세요.
	 */
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println((num%2==0) ? "짝수이다." : "홀수이다." );
	}
	/*
	 * 실습 문제 2
	 * 모든 사람이 사탕을 골고루 나눠가지려고 한다.
	 * 인원 수와 사탕 개수를 키보드로 입력받고 1인당 동일하게 나눠가진
	 * 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
	 */

	public void practice2() {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int candy = sc.nextInt();
		
	}
	/*
	 * 실습 문제 3
	 * 국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력받고
	 * 세 과목에 대한 합계(국어 + 영어 + 수학)와 평균(합계 / 3.0)을 구하세요.
	 */
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		int kr = sc.nextInt();
		int en = sc.nextInt();
		int math = sc.nextInt();
		double sum = kr + en + math;
		double avg= sum / 3.0;
		System.out.println(sum+' '+avg);
		System.out.printf("합계: %d점 평균: %d점",sum, avg);
		
	}
	/*
	 * 실습 문제 4
	 * 주민 번호를 입력받아 남자인지 여자인지 구분하여 출력하세요.
	 */
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		char no = sc.nextLine().charAt(6);
		System.out.println(no==1);
	}

	/*
	 * 실습 문제 5
	 * 3개의 정수를 키보드로 입력받아 
	 * 입력받은 정수가 모두 같으면 true, 아니면 false를 출력하세요
	 */
	public void practice5() {
	}
}