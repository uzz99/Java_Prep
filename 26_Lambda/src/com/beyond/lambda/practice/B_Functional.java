package com.beyond.lambda.practice;

import com.beyond.lambda.practice.functional.A_FunctionalInterface;
import com.beyond.lambda.practice.functional.B_FunctionalInterface;
import com.beyond.lambda.practice.functional.C_FunctionalInterface;

public class B_Functional {

	int number = 100;
	
	public void method1() {
		A_FunctionalInterface fi;
		
		// 매개변수와 반환값이 없는 람다식
		fi = () -> {
			System.out.println("매개변수와 반환값이 없는 람다식 1");
		};
		fi.method();// fi는 메소드가 아니라 객체이므로 method를 호출해주어야 함
		
		// 실행문이 한 줄이라면 중괄호 생략 가능
		fi = () -> System.out.println("매개변수와 반환값이 없는 람다식 2");
		fi.method();
	}


	public void method2() {
		B_FunctionalInterface fi;
		
		// 1. 정석 람다식
		fi = (int a) -> {
			System.out.println(a * a);
		};
		fi.method(5);
		
		// 2. 축약 람다식
		fi = a -> System.out.println(a * 2);
		fi.method(10);
		
	}

	public void method3() {
		C_FunctionalInterface fi;
		
		// 1. 정석
		fi = (int a, int b) -> {
			return a + b;
//			return 'c';//문자는 가능(자동 형변환 가능하기 때문에)
		};
		int result = fi.method(10, 20);
		
		System.out.println("result : " + result);

		// 2. 축약형
		fi = (a, b) -> a + b;
		int result2 = fi.method(10, 20);
		
		System.out.println("result : " + result2);
	}

	// 람다식에서 필드와 지역 변수 사용하기
	public void method4(int arg) {
		int number = 200;
		A_FunctionalInterface fi;
		
		// 람다식에서 지역변수(매개변수)를 이용할 때는 final, effectively final이어야 한다
//			=> 지역변수는 람다식에서 읽는 것은 허용되지만, 람다식 내부에서 또는 외부에서 변경할 수 x
//			=> 초기화된 이후에 값이 한 번도 변경되지 않는 변수를 effectively final이라고 한다.
		
/*			각 지역변수 값은 메소드가 종료될 때 소멸되나, 람다식에서 지역변수를 사용할 때 해당 지역변수 값을 복사하여 저장하도록 함
 * 				-> 메소드가 종료되더라도 람다식에서 지역변수를 다른 객체에 전달될 수 있게끔
 * 			
 * 			만약 멀티 스레드 환경일 때,
 * 			여러 스레드가 객체를 참조할 수 있음
 * 			원래라면 동일한 값을 가지고 작업을 할 수 있는데, 지역변수를 복사해서 사용하게 되면 지역변수가 변경될 때 각각의 스레드가 같은 값을 갖지 못하게 됨
 * 			따라서, 지역변수의 값을 변경하지 못하도록 제한해주는 것
 */
		// 람다식에서 사용하는 지역변수는 변경할 수 없어야 함(위치 상관 없)
		
//		arg = 600;// 지역변수 변경 시 에러 
//		number = 300;
//		this.number = 500;
		
		fi = () -> {
			System.out.println(arg);
			System.out.println(number);
			System.out.println(this.number);
			// 이 때의 this는 람다식을 실행하는 클래스의 주소값(B_Fuctional)
			// 람다식에서 사용되는 this는 람다식을 실행하는 객체의 참조
		};
		
		fi.method();
		System.out.println();
		
		// 익명 구현 객체에서 사용되는 this는 익명 구현 객체의 참조이다.
		fi = new A_FunctionalInterface() {
//			private int number = 1000;
			@Override
			public void method() {
				System.out.println(arg);
				System.out.println(number);
//				System.out.println(this.number);
				// ↑ 익명 구현 객체를 생성할 때 new로 생성하므로 이때의 this는 B_Fuctional이 아닌 익명 구현 객체 본인을 가리킴
				// 익명 구현 객체 안에 number라는 필드가 없으므로 오류 발생
//				System.out.println(this);
			}
		};
		
		fi.method();
	}
}
