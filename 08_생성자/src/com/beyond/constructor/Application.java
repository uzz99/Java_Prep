package com.beyond.constructor;

import com.beyond.constructor.practice.User;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u3 = new User("hong","1234","홍길동");
		User u5 = new User("hong","1234","홍길동",20,'M');

//		System.out.println(u3.information());
		System.out.println(u5.information());
	}

}
