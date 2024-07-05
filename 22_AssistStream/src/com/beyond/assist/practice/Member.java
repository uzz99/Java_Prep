package com.beyond.assist.practice;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

//@NoArgsConstructor
@AllArgsConstructor
//@Data
@ToString
public class Member implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4795058672379803983L;
	// 직렬화하고 역직렬화 할 때 필드값을 담아줘야 하는데 그러려면 직렬화 클래스와 역직렬화 클래스가 같아야함, 이를 식별해주는 상수
	
	@Getter
	private String id;
	
	private transient String password;
	// 역직렬화 시 비밀번호를 안보이게 하는 방법
	// 1. static 필드는 직렬화가 되지 않음
	// 2. transient 키워드를 사용하면 직렬화에서 제외 => read 시 null로 읽어 옴(이 방법 사용)
	private String name;
	private int age;
	private char gender;
	private double point;
	
	
}
