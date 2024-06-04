package com.beyond.variable;

import com.beyond.variable.practice.A_Variable;
import com.beyond.variable.practice.B_ConsoleOutput;
import com.beyond.variable.practice.C_keyboardInput;

/*
 *  주석
 *  - 소스코드와는 무관하고 코드로 인식되지 않는다.
 *  - 주로 코드에 대한 설명을 작성할 때
 */
// 한 줄 주석
// 추가로 주석 작성
// 자바 파일명과 클래스 명은 동일해야 함

public class Application {
	// main 메소드는 프로그램의 시작점으로
	// java.exe가 Applicaion.class를 실행시킬 때 제일 먼저 실행되는 메소드
	public static void main(String[] args) {
		// 1) 실행 할 메소드가 있는 클래스 생성
		// [표현법]
		//	클래스명 변수명 = new 클래스명
		
		// 1-1) 패키지 명을 기재
		/*
		com.beyond.variable.practice.A_Variable variable = 
				new com.beyond.variable.practice.A_Variable();
		*/
		// 1-2) import문을 사용해 클래스 생성
		A_Variable variable= new A_Variable();
		
		
		/*
		 * 생성한 클래스로 메소드 호출(실행)
		 * [표현법]
		 * 	변수명.메소드명();
		 */
		//variable.variableTest();
		//variable.autoCasting();
		//variable.casting();
		//variable.practice();
		
//		B_ConsoleOutput output = new B_ConsoleOutput();
//		output.valuePrint();
		
		C_keyboardInput input = new C_keyboardInput();
		input.inputByScanner();
	}
}
