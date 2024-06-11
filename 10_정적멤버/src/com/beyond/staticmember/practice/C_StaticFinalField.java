package com.beyond.staticmember.practice;

public class C_StaticFinalField {
	
	// final 필드를 초기화 하는 방법
	// 1) 선언 시 명시적으로 지정하는 방법
	//private final String gender="남자";// 객체가 생성될 때 만들어짐(new), 초기화가 되지 않으면 에러 발생
	
	// 2) 생성자를 통해서 지정하는 방법
	private final String gender;
	
	public static final int MAX_LEVEL = 30;
	
	public C_StaticFinalField(String gender) {
		this.gender=gender;
	}
	
	public String getGender() {
		return this.gender;// 초기값이 이미 지정된 상태이기때문에 변경할 수 x
	}
//	
//	public void setGender(String gender) {
//		this.gender=gender;// 초기값이 이미 지정된 상태이기때문에 변경할 수 x
//	}
//	
	
	
}
