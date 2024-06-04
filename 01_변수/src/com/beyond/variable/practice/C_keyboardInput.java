package com.beyond.variable.practice;

import java.util.Scanner;

public class C_keyboardInput {
	public void inputByScanner() {
		
		//Scanner 클래스는 사용자로부터 입력되는 정수, 실수, 문자열을 처리하는 클래스
		Scanner scanner = new Scanner(System.in);
		String name = null;
		int age = 0;
		float height = 0;
		char gender = '\u0000';

		System.out.println("당신의 이름은 무엇입니까?");
		name = scanner.nextLine();//문자열 반환


		System.out.println("당신의 나이는 몇 살입니까?");
		age = scanner.nextInt();
		
		System.out.println("당신의 키는 몇 입니까?(소수점 첫째 자리까지 입력하세요.)");
		height = scanner.nextFloat();
		
		System.out.println("당신의 성별은 무엇입니까?(남/여) ");
		//gender = scanner.nextLine().charAt(0);
		// nextXXX와 같은 기본 자료형 입력포맷은 개행문자를 버퍼에 남겨둔다.
		// 그러나 nextLine은 개행문자도 같이 app에 넘겨주기 때문에 이전에 남아있던 개행문자도 같이 전달되어 빈 문자열이 전달되게 됨
		// 따라서 오류 발생
		// 엔터값을 빼줘야 함
		
		// 버퍼에 남아있는 개행문자를 빼주기 위해서 scanner.nextLine() 메소드를 한 번 더 호출한다.
		scanner.nextLine();
		gender = scanner.nextLine().charAt(0);
		
		System.out.printf("당신의 이름은 %s이고 나이는 %d세, %.1fcm, 성별은 %c 입니다.",name,age,height,gender);
		
		
		
	}

}
