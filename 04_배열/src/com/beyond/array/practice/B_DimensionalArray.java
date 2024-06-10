package com.beyond.array.practice;

import java.util.Random;

public class B_DimensionalArray {
	// 2차원 배열의 선언, 생성, 초기화(new 연산자 사용)
	public void method1() {
		int[][] iArray;
		//int[] iArray[] = new int[][];
		
		iArray = new int[3][5];
		/*
		 * 1 2 3 4 5 
		 * 6 7 8 9 10
		 * 11 12 13 14 15
		 */
		int value = 1;
		
		// 2차원 배열에 초기화
		for(int i=0; i<iArray.length;i++) {// 행
			for(int j=0; j<iArray[i].length;j++) {// 열
				iArray[i][j]=value++;
			}
		}
		// 2차원 배열에 출력
		for(int i=0; i<iArray.length;i++) {// 행
			for(int j=0; j<iArray[i].length;j++) {// 열
				System.out.printf("%2d ",iArray[i][j]);
			}
			System.out.println();
		}
	}

	// 2차원 배열의 선언, 생성, 초가화(값의 목록 사용)
	public void method2() {
		//String[][]sArray = new String[][] { {"사과"},	{"포도"},{"키위"}};
		String[][]sArray = new String[][] { 
			{"Linux","MariaDB"},
			{"Java", "Spring"},
			{"HTML5","CSS3","Vue.js"}
			
		};

		// 2차원 배열에 출력
		for(int i=0; i<sArray.length;i++) {// 행
			for(int j=0; j<sArray[i].length;j++) {// 열
				System.out.printf("%s\t ",sArray[i][j]);
			}
			System.out.println();
		}
		
		
	}
	/* 
	 * 실습 문제 1
	 * 1부터 10 사이의 랜덤 값을 3행 3열의 2차원 배열에 대입
	 * 
	 */
	public void practice1() {
		int[][] iArray = new int[3][3];
		for(int i=0; i<iArray.length;i++) {// 행
			for(int j=0; j<iArray[i].length;j++) {// 열
				iArray[i][j]=(int)(Math.random()*10 +1);
				System.out.printf("%d ",iArray[i][j]);
			}
			System.out.println();
		}
		
	}
}
