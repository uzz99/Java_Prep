package com.beyond.method;

import com.beyond.method.practice.A_Method;
import com.beyond.method.practice.Member;

public class Application {

	public static void main(String[] args) {
		
		//1. 매개변수가 없고, 반환값도 없는 메소드 호출
		A_Method am = new A_Method();
		am.method1();
		System.out.println();

		//2. 매개변수가 없고, 반환값은 있는 메소드 호출
		String str = am.method2();
		System.out.println(str);
		System.out.println();
		
		//3. 매개변수가 있고, 반환값은 없는 메소드 호출
		am.method3(10,20);
		System.out.println();

		//4. 매개변수가 있고, 반환값도 있는 메소드 호출
		System.out.printf("10 X 20 = %d입니다.\n",am.method4(10, 20));
		System.out.println();
		
		//5. 매개변수로 객체를 전달받는 메소드 호출
		Member mem=new Member("홍길동",24);
		System.out.println(mem.information());
		am.method5(mem);//참조변수의 주소값을 넘겨줌, 참조변수를 만들어서 전달해줘야 함
		System.out.println(mem.information());
		
		// 6. 매개변수로 가변인자를 전달받는 메소드 호출
		// 1) 배열을 사용하는 메소드 호출
		System.out.println();
		
		int[] array= {1,2,3,4,5};
//		
//		System.out.println(am.method6(array));
//		System.out.println(new int[] {});
//		System.out.println(new int[] {1,2,3,4,5});
		
		System.out.println(am.method6(1,4,5));
		System.out.println(am.method6(1,2,3,4,5));
		System.out.println(am.method6());
//		System.out.println({1,2,3,4,5});// 배열을 선언과 동시에 초기화 할 때만 값의 목록만을 인자로 전달 할 수 있음, 이외는 x
		
		
	}

}
