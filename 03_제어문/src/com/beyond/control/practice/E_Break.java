package com.beyond.control.practice;

public class E_Break {
	/*
	 * break 문
	 * [표현법]
	 * 		반복문/switch(조건식)
	 * 		...
	 * [break]
	 */
	
	/*
	 * 1부터 랜덤값까지의 합계를 반복문을 통해서 계속 출력한다.
	 * 단, 랜덤값이 숫자 5가 나오면 프로그램을 종료
	 */
	public void method1() {
		int sum = 0;
		int random = 0;
		
//		while(true) {
		for(;;) {
			sum = 0;
			random = (int)(Math.random()*10 +1);
			if(random==5) {
				break;
			}
			for(int i=1;i<=random;i++) {
				sum += i;
			}
			System.out.printf("1부터 %d까지의 합계 : %d\n",random, sum);
		}
		System.out.printf("랜덤값이 %d이므로 프로그램을 종료합니다.",random);
	}
}
