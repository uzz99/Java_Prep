
package com.beyond.exception;
import java.io.IOException;

import com.beyond.exception.practice.C_RuntimeException;

public class Application {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		//java.exe가 실행될 때 JVM에서 에러를 자동으로 처리
		System.out.println("프로그램 실행");
		
//		new A_TryCatch().method1();
		// 1) 
//		try {
//			new B_Throws().method1();
//		} catch (ClassNotFoundException e) {
//			System.out.println("ClassNotFoundException 예외 발생");
//		} catch (IOException e) {
//			System.out.println("IOException 예외 발생");
//		}
//		
//		new B_Throws().method1();
		
		new C_RuntimeException().method1();
		System.out.println("프로그램 종료");
	}

}
