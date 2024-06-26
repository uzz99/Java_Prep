package com.beyond.stream.practice;

import java.util.Arrays;
import java.util.List;

public class D_Mapping {
	
	/*
	 * 매핑
	 * 	- 중간 처리 기능으로 스트림의 요소를 다른 요소로 대체하는 역할
	 */
	
	public void method1() {
		List<Student> students = Arrays.asList(
			new Student("홍길동", 24, "남자", 80, 50),
			new Student("성춘향", 20, "남자", 80, 80),
			new Student("이몽룡", 26, "남자", 80, 80),
			new Student("김영희", 19, "여자", 90, 90)
		);
		
		
		// 이름만 요소로 가지고 있는 스트림 생성
		students.stream()
				.map(Student :: getName)
				.forEach(System.out::println);
//				.map(student-> student.getName())
//				.forEach(name -> System.out.println(name));
	
		System.out.println();
		
		//학생들의 수학점수 평균
		double avg = students.stream()
				.mapToInt(Student :: getMath)
				.average()
				.getAsDouble();//실수형태로 데이터 뽑아오기
				
		System.out.println("수학 점수의 평균 : " + avg);
		System.out.println();
	
		List<String> list = Arrays.asList("Java21 Lambda", "StreamAPI Filtering Mapping");
		
		list.stream().forEach(System.out::println);
		
		System.out.println();
		
		// 문자열 쪼개서 새로운 스트림 생성
		list.stream().flatMap(str -> Arrays.stream(str.split(" ")))
			.forEach(System.out::println);
	}
	
	
	
	public void method2() {
		int[] iArray = {1, 2, 3, 4, 5};
		
		Arrays.stream(iArray)
				.asDoubleStream()
				//기본int를 더블로 반환, double이 범위가 가장 넓기 때문에 as해도 아무것도x(롱은 더블로 ㄱㄴ)
//				.boxed()
				.forEach(System.out::println);
				
				
	}
	
	
	
	
	
	
}
