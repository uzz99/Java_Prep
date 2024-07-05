package com.beyond.stream.practice;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class G_Aggreagate {
	/*
	 * 집계
	 * 	- 최종 처리 기능으로 요소들의 개수, 합계, 평균갑스 최대값 최소값 등과 같이 하나의 값으로 산출하는 역할을 한다
	 * 		- count()
	 * 		- sum()
	 * 		- average()
	 * 
	 *		- max()
	 *		- min()
	 *		- findFirst()
	 *
	 *	 OptionalDouble 클래스
	 *		- 스트림의 최종 결과 값을 저장하는 객체
	 *		- 단순히 값만 저장하는 것이 아니라, 값의 존재 여부를 확인하고 값이 존재하지 않을 경우 디폴트 값을
	 *			설정할 수 있는 객체
	 */
	
	public void method1() {
		int[] numbers = { 1,2,3,4,5,6};
//		int[] numbers = {1, 3, 5};// 2의 배수가 없는 경우 평균을 구하려고 하면 에러 -> 옵셔널 객체로 기본 값을 지정해 줄 수 있다.

		// 2의 배수의 개수
		long count = Arrays.stream(numbers).filter(value -> value % 2 == 0).count();
		System.out.println("2의 배수의 개수 : " + count);
		
		// 2의 배수의 합계
		int sum = Arrays.stream(numbers).filter(value -> value % 2 == 0).sum();
		System.out.println("2의 배수의 합 : " + sum);

		// 2의 배수의 평균
		OptionalDouble average = Arrays.stream(numbers).filter(value -> value % 2 == 0).average();
//		System.out.println("2의 배수의 평균 : " + average.getAsDouble());
//		System.out.println("2의 배수의 평균 : " + average);
		
		// 값의 존재 여부를 확인하고 optional 객체에서 값을 가져온다.
//		if(average.isPresent())// 값이 있는지 확인 있으면 t
//		{
//			System.out.println("2의 배수의 평균 : "  + average.getAsDouble());
//		}else {
//			System.out.println("2의 배수의 평균 : 0" );
//		}

		// 집계 값을 처리하는 consumer를 등록한다(값이 존재해야 실행)
		average.ifPresent((double d) -> System.out.println(d));		
		
		
		//get() 메소드와 동일하게 저장되어 있는 값을 얻어오는 메소드, 값이 저장되어 있지 않을 경우 디폴트 값 지정
		System.out.println("2의 배수의 평균 : "  + average.orElse(0.0));// 값이 없으면 지정한 값으로 처리 가능
		
		// 2의 배수의 최솟값
		OptionalInt min = Arrays.stream(numbers).filter(value -> value % 2 == 0).min();
		System.out.println("2의 배수의 최솟값 : " + min.orElse(0));//없으면 0, 있으면 해당 값
		
		
		// 2의 배수의 최댓값
		OptionalInt max = Arrays.stream(numbers).filter(value -> value % 2 == 0).max();
		System.out.println("2의 배수의 최댓값 : " + max.orElse(0));//없으면 0, 있으면 해당 값
		
		// 2의 배수의 첫 번째 요소
		OptionalInt first = Arrays.stream(numbers).filter(value -> value % 2 == 0).findFirst();// 첫번째 값을 보장
		System.out.println("2의 배수의 첫 번째 요소: " + first.orElse(0));//없으면 0, 있으면 해당 값
		
		
		// 2의 배수의 곱
		Arrays.stream(numbers).filter(value -> value % 2 == 0)
				.reduce((left, right) -> left * right)
				.ifPresent(result -> System.out.println("2의 배수의 곱 : " + result));// optional 객체 바로 소비
		
	}
	
}
