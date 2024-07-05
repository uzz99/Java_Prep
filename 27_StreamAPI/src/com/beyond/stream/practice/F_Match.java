package com.beyond.stream.practice;

import java.util.Arrays;
import java.util.List;

public class F_Match {
	/* 매치
	 *  - 최종 처리 단계에서 요소들이 특정 조건에 만족하는지 조사하는 역할
	 *  - allMathch(Predicate)
	 *  	모든 요소들이 매개값으로 주어진 Predicate의 조건을 만족하는지 조사
	 *  - anyMatch(Predicate)
	 *  	최소한 한 개의 요소가 매개값으로 주어진 Predicate의 조건을 만족하는지 조사
	 *  - noneMatch(Predicate)
	 *  	모든 요소들이 매개값으로 주어진 Predicate 조건을 만족하지 않는지 조사
	 */

	public void method1() {
		boolean result = false;
		int[] numbers = {2, 4, 6};

		result = Arrays.stream(numbers).allMatch(value -> value % 2 == 0);//모든 요소 만족
		System.out.println(result);

		result = Arrays.stream(numbers).anyMatch(value -> value % 3 == 0);//하나라도 만족 
		System.out.println(result);
		
		result = Arrays.stream(numbers).noneMatch(value -> value % 5 == 0);//모든 요소가 조건 불만족
		System.out.println(result);
		
	}
	
	public void method2() {
		
		boolean result = false; 
		
		List<Student> students = Arrays.asList(
			new Student("홍길동", 24, "남자", 80, 50),
			new Student("성춘향", 20, "여자", 80, 80),
			new Student("이몽룡", 26, "남자", 80, 80),
			new Student("김영희", 19, "여자", 90, 90)
		);
		
		// 나이가 20살 이상인 학생들이 모두 남자인지 확인
		result = students.stream().filter(s -> s.getAge() >= 20)
//					.peek(s -> System.out.println(s))
					.allMatch(s -> s.getGender().equals("남자"));
		
		System.out.println("20살 이상인 학생들은 모두 남자입니까? " + result);
		
		
		
		/// 남학생들 중에 평균이 80점 이상인 학생이 한 명이라도 존재하는지 확인
		students.stream()
				.filter(s -> s.getGender().equals("남자"))
				.anyMatch(s -> (s.getEnglish()  + s.getMath()) / 2 >= 80);
		
		System.out.println("20살 이상인 학생들은 모두 남자입니까? " + result);
		
//				.mapToInt(Student :: getMath)
//				.average();
//				.peek(s -> System.out.println(s));
//		
		
	}
}
