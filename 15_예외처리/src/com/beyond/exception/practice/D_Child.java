package com.beyond.exception.practice;

import java.io.FileNotFoundException;
import java.io.IOException;

public class D_Child extends D_Parent {
//	
//	@Override
//	public void method() {
//		// 오버라이딩 시 throws 구문을 작성하지 않아도 됨
//		
//	}
//	
//	@Override
//	public void method() throws IOException{
//		// 부모 클래스의 메소드와 같은 예외를 throws 하는 것은 가능하다
//		
//	}
//	
	
	@Override
	public void method() throws FileNotFoundException{
		// 부모 클래스의 메소드보다 더 하위 타입의 예외를 throws 하는 것은 가능하다
		
	}
	
//	@Override
//	public void method() throws Exception{
//		// 부모 클래스의 메소드보다 더 상위 타입의 예외를 throws 하는 것은 불가능
//			
//	}
}
