package com.beyond.stream.practice;

import java.util.Arrays;
import java.util.List;

public class B_Filtering {
	/*
	 * 	필터링
	 * 	  - 필터링은 중간 처리 기능으로 요소를 걸러내는 역할을 한다.
	 * 	  - distinct() 요소의 중복을 제거하는 메소드
	 * 	  	- equals() 재정의 필요(+ hashcode()도)
	 * 	  - filter(Predicate) : 매개값으로 전달되는 Predicate가 false를 리턴하는 요소를 제거
	 */
	
	public void method1() {
		
		List<Student> students = Arrays.asList(
			new Student("홍길동", 24, "남자", 80, 50),
			new Student("김철수", 20, "남자", 50, 50),
			new Student("김영희", 20, "여자", 90, 90),
			new Student("홍길동", 24, "남자", 80, 50),
			new Student("이몽룡", 26, "남자", 80, 80)
		);
		
//		System.out.println(students);
//		students.stream().forEach(student -> System.out.println(student));//foreach는 consumer이므로 매개값만 존재(리턴값x)
		students.stream().distinct().forEach(student -> System.out.println(student));//중간 처리 메소드
		
		
	}
	
	public void method2() {
		
		List<Student> students = Arrays.asList(
			new Student("홍길동", 24, "남자", 80, 50),
			new Student("김철수", 20, "남자", 50, 50),
			new Student("김영희", 20, "여자", 90, 90),
			new Student("홍길동", 24, "남자", 80, 50),
			new Student("이몽룡", 26, "남자", 80, 80)
		);
		
		// 성별이 여자인 학생만 출력
		//매개값이 Predicate => t/f 리턴하도록 조사
//		students.stream()
//				.filter(student -> student.getGender().equals("여자"))
//				.forEach(student -> System.out.println(student));

		
		// 수학, 영어 점수가 모두 60점 이상인 학생만 출력
		students.stream()
			.filter(student -> student.getMath() >= 60 && student.getEnglish() >= 60)
			.forEach(student -> System.out.println(student));
		
	}
}
