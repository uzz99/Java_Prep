package com.beyond.enumeration;

import java.util.Arrays;

import com.beyond.enumeration.practice.Week;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Week today=Week.FRIDAY;
		
		// 열거 상수에서 제공해 주는 메소드
		System.out.println(today.name());
		System.out.println(today.ordinal());
		System.out.println(today.equals(Week.SUNDAY));
		System.out.println(today.compareTo(Week.FRIDAY));//같기때문에 0, 인수를 기준으로 앞으로 -, 뒤로는 +
		System.out.println();
	
		System.out.println(Week.valueOf("MONDAY"));
		System.out.println(Arrays.toString(Week.values()));
		System.out.println();
	}

}
