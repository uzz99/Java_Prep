package com.beyond.exception.practice;

import java.util.Scanner;

public class C_RuntimeException {
	
	public void method1() {
		// ArrayIndexOutOfBoundsException
		// NegativeArraySizeException
		Scanner sc = new Scanner(System.in);
		int size = 0;
		int[] numbers = null;
		
		System.out.println("배열의 길이 > ");
		size = sc.nextInt();
		
		if (size<=0) {
			System.out.println("0보다 큰 값을 입력해주세요.");
			
			return; // 메소드 종료
		}
		
		numbers = new int[size];
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]+ " ");
		}System.out.println();
	}
}
