package com.beyond.operator;

import com.beyond.operator.practice.Prac;

public class Application {

	public static void main(String[] args) {
		
		//new A_LogicalNegation().method1();//리턴되는 주소값에서 메소드 호출(생성과 동시), 한번만 호출할 때 유용
		//new B_InDecrease().method1();
		//new B_InDecrease().method2();
		//new C_Arithmetic().method1();
		//new D_Comparison().method2();
		//new F_Assignment().method1();
		//new G_Triple().method1();
		System.out.println("----------------------------실습 문제1----------------------------");
		new Prac().practice1();
		System.out.println("----------------------------실습 문제2----------------------------");
		new Prac().practice2();
		System.out.println("----------------------------실습 문제3----------------------------");
		new Prac().practice3();
	}

}
