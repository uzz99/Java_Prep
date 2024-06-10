package com.beyond.field;
import com.beyond.field.practice.User;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user = new User();
		user.id="Kim123";//public 직접 접근 가능 	
		System.out.println(user.id);
		
		//private 클래스 내에서만 직접 접근 가능
	}

}
