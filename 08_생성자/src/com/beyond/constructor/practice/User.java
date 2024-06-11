package com.beyond.constructor.practice;

public class User {
	private String id;
	private String password;
	private String name;
	private int age;
	private char gender;
	/*
	 * 기본 생성자
	 * 
	 * 객체 생성만으로 목적으로 사용된다.
	 * 기본 생성자를 생략하는 경우 자동으로 만들어준다.
	 */
	
	/*
	 * 생성자를 private로 선언하면 외부에서 절대로 객체를 생성할 수 없다
	 * 클래스 내부에서만 생성자를 호출할 수 있고 객체를 생성x
	 */
//	private User() {
//	System.out.println("기본 생성자 호출");
//}
	
	public User() {
		System.out.println("기본 생성자 호출");
	}
	
	// 매개변수가 있는 생성자(아이디, 패스워드, 이름)
	// 객체 생성과 동시에 전달된 값들로 필드를 초기화하는 목적으로 사용
	public User(String id, String password, String name) {
		
		this.id=id;
		this.password=password;
		this.name=name;
		
		
	}
	
	// 매개변수가 있는 생성자(5개의 값을 생성자로 전달)
	public User(String id, String password, String name, int age, char gender) {
		this(id,password,name);// 클래스 내에서 문자열 매개변수 3개를 가지는 생성자를 호출한다.
		
		this.age=age;
		this.gender=gender;
	}
		
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String information() {
		//객체 내부에서 참조하고 있는 this와 같
//		System.out.println(this);
		//this(id,password,name);// 메소드 내부에서는 this를 사용해서 생성자를 호출할 수 없.
		return String.format("%s, %s, %s, %d, %c",this.id,this.password,this.name, age, gender);
		
	}
	
}
