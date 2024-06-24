package com.beyond.stream;

import com.beyond.stream.practice.A_Create;
import com.beyond.stream.practice.B_Filtering;
import com.beyond.stream.practice.C_Sorted;

public class Application {
	
	/*
	 *	Stream API
	 *		- 스트림은 자바 8부터 추가된 기능(람다처럼), 컬렉션(배열)에 저장된 요소들을 하나씩 참조해서
	 *		  람다식으로 처리할 수 있도록 해주는 반복자
	 *		- 스트림은 람다식으로 요소를 처리할 수 있는 코드를 제공할 수 있고, 내부 반복자를 사용해서 
	 *		  병렬 처리, 중간 처리, 최종 처리 작업을 수행할 수 있다.
	 *		  - 중간 처리에는 반복, 매핑(타입 변환), 필터링, 정렬 등을 수행
	 *		  - 최종 처리에는 반복, 카운팅, 평균 총합 등의 집계 처리를 수행 
	 *	*외부 반복자 => 내가 반복문을 기재
	 *	*내부 반복자 => 실행 시킬 코드만 기재하면 내부에서 반복문을 처리해주는
	 *
	 *	- 중간 처리 메소드와 치종 처리 메소드를 구분하는 방법 리턴 타입을 보면 구분이 가능
	 *		- 리턴 타입이 Stream이면 중간 처리 메소드이다.
	 *		- 리턴 타입이 기본타입이거나, Optional 객체라면 최종 처리 메소드이다.
	 *		
	 */
	
	public static void main(String[] args) {
// 		스트림 생성
//		new A_Create().method1();
//		new A_Create().method2();
//		new A_Create().method3();
		
// 		중간 처리 메소드
		// 필터링
//		new B_Filtering().method1();
//		new B_Filtering().method2();
		
		// 정렬
//		new C_Sorted().method1();
		new C_Sorted().method2();
		
	}

}
