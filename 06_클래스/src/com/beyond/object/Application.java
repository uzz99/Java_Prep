package com.beyond.object;

import com.beyond.object.practice.Person;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		Person lee = new Person();
		
		p.setName("홍길동");
		p.setAge(24);
		p.setPhone("애플","아이폰12 미니", "화이트");
		p.whoAreYou();
//		System.out.println(p);
//		
//		lee.setName("이몽룡");
//		lee.setAge(20);
//		lee.whoAreYou();
//		
	}

}
