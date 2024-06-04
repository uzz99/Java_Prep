package com.beyond.variable.practice;

public class A_Variable {
	/*
	 * 변수의 선언 및 초기화
	 * 	[표현법]
	 * 		자료형 변수명;
	 */
	public void variableTest() {
		// 논리형 변수
		boolean isTrue;
		
		// 정수형
		byte bNum;
		short sNum;
		int iNum;
		long lNum;
		
		// 실수형
		float fNum;
		double dNum;
		
		// 문자형
		char ch1 = 'A';
		char ch2 = 0;
		char ch3 = '\u0000';//유니코드
		//char ch=90;

		System.out.println("ch : "+ch1);
		
		// 문자열
		//String name;// 문자열을 가리킬 수 있는 참조 변수를 선언
		//name="";//빈 문자열로 초기화
		//name="이유진";
		//String name=new String("이유진");
		String name=null;//참조변수는 null값을 가질 수 있
		System.out.println("name : "+name);
		System.out.println();
		
		
		
		// 지역 변수 생성 후 초기화를 하지 않은 경우 에러 발생
		//		System.out.println(isTrue);
		
		isTrue=true;
		//		isTrue=1; // 에러 발생
		System.out.println("isTrue: " + isTrue);
		System.out.println();

		bNum=127;//128 => error
		sNum=32000;//70000;
		iNum=234567991;
		//정수형 리터럴은 기본적으로 int
		lNum=922337203685477580L;//롱타입의 리터럴은 숫자 뒤에 L 또는 l 입력
		System.out.println("bNum : "+bNum);
		System.out.println("sNum : "+sNum);
		System.out.println("iNum : "+iNum);
		System.out.println("lNum : "+lNum);
		System.out.println();
		
		fNum = 3.141592F;// 실수형은 기본적으로 double타입, float 타입의 리터럴에서 숫자 뒤에 F 또는 f 입력
		dNum = 3.14;// double의 d는 생략 가능
		
		System.out.println("fNum : "+fNum);
		System.out.println("dNum : "+dNum);
		System.out.println();
		
		//변수의 명명 규칙
		// 1) 대소문자 구분
		int number;
		int NUMBER; //서로 다른 변수
		//String number;//단 자료형이 달라도 변수명이 같으면 에러
		
		// 2) 숫자로 시작하면 안 된다.
		//int 1age;
		
		// 3) 특수문자는 _, $만 가능
		int _age;
		int a_g$e;
		
		// 4) 예약어 사용 불가
		//int double; //등등
		
		
	}


	/*
	 * 자동 형 변환
	 * - 데이터 표현 범위가 작은 자료형을 큰 자료형으로 변환한다.
	 */
	
	public void autoCasting() {
		byte bNum=10;
		short sNum=12;
		int iNum=sNum;//short -> int 자동 형 변환
		long lNum =iNum;//int -> long 자동 형 변환
		float fNum=lNum;
		// float 타입이 long 타입보다 표현 가능한 수의 범위가 더 크기 때문에
		// 자동 형 변환이 ㄱㄴ
		double dNum=fNum;//자동 형 변환
//		iNum=dNum;//=> error
		System.out.println("bNum : "+bNum);
		System.out.println("sNum : "+sNum);
		System.out.println("iNum : "+iNum);
		System.out.println("lNum : "+lNum);
		System.out.println("fNum : "+fNum);
		System.out.println("dNum : "+dNum);
		
		char ch='홍';
		iNum = ch;
		
		
		System.out.println("ch : "+ch);
		System.out.println("iNum : "+iNum);
		
		double result= 12 + 3.3;
		System.out.println("result : "+result);
		
		int result2 = bNum + sNum; // short, byte 두개가 연산이 될 때는 int로 간주 => int로 변경
		System.out.println("result2 : "+result2);
		
		long result3 = 30 + 30; // 30+30 = 60, 60을 long타입으로 변환 후 대입(60L)
		long result4 = 30 + 30L; // 30+30 = 60, 60을 long타입으로 변환 후 대입(60L)
		System.out.println("result3 : "+result3);
		System.out.println("result4 : "+result4);
		
	}
	/*
	 * 강제 형 변환
	 * 	[표현법]
	 * 		(자료형) 데이터; 
	 * 데이터 손실이 발생할 수 있다.
	 */
	
	public void casting() {
		double dNum = 4.23456789345678;
		float fNum = (float)dNum;
		int iNum= (int)fNum;
		
		System.out.println("dNum : "+dNum);
		System.out.println("fNum : "+fNum);
		System.out.println("iNum : "+iNum);
		System.out.println((byte)290);
		System.out.println();
		System.out.println();
		
		int sum = (int)(iNum + dNum);
		System.out.println("sum : "+sum);

	}
	public void practice() {
		/*
		 * 실습 문제
		 * 홍길동 국어 점수 60점, 영어점수 70점, 수학 점수 66점
		 * 이 학생의 총점과 평균을 출력
		 * 
		 * ex) 국어 점수 : 60점
		 * 영어 점수: 70점
		 * 수학 점수 : 66점
		 * 
		 * 총점: 196점
		 * 평균:
		 */
		final int ko=60;// final => 한번 초기화 된 후에는 변경할 수 x, 변경하면 에러 발생
		int en=70;
		int mat=66;
		int sum=(ko+en+mat);
		
		System.out.println("국어 점수 : "+ko+"점");
		System.out.println("영어 점수 : "+en+"점");
		System.out.println("수학 점수 : "+mat+"점");
		System.out.println();
		
		System.out.println("총점 : "+sum+"점");
		System.out.println("평균 : "+(double)(sum/3.0)+"점");
		
	}
	
}
