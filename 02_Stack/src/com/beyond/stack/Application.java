package com.beyond.stack;

import com.beyond.stack.practice.LinkedListStack;
import com.beyond.stack.practice.Stack;

public class Application {

	public static void main(String[] args) {

//		new LinkedListStack().new Node<>();
		//  4) LinkedListStack 구현 및 테스트
		Stack<String> stack = new LinkedListStack<>();
		
		System.out.println(stack);
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println();
		
//		// push() 테스트
		stack.push("딸기");
		stack.push("포도");
		
		System.out.println(stack);
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println();
		
//		// pop() 테스트
		System.out.println(stack.pop());
		System.out.println(stack);
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println();
		
		//contains() test
		System.out.println(stack.contains("딸기"));
		System.out.println(stack.contains("포도"));
		System.out.println();
	
//		stack.push("바나나");
		// peek() test
//		stack.pop();
		
		System.out.println(stack.peek());	
		System.out.println(stack);
		System.out.println(stack.size());
		System.out.println(stack.isEmpty());
		System.out.println();
		
		
/**********************************************************************************************************/
//		// 3) ArrayListStack 구현 및 테스트
//		Stack<String> stack = new ArrayListStack<>(5);
//
//		System.out.println(stack);
//		System.out.println(stack.size());
//		System.out.println(stack.isEmpty());
//		System.out.println();
//		
//		// push() test
//		stack.push("딸기");
//		stack.push("포도");
//		stack.push("바나나");
//		stack.push("복숭아");
//		stack.push("메론");
////		stack.push("오렌지");
//
//		System.out.println(stack);
//		System.out.println(stack.size());
//		System.out.println(stack.isEmpty());
//		System.out.println();
//		
//		// pop() test
//		System.out.println(stack.pop());
//		System.out.println(stack);
//		System.out.println(stack.size());
//		System.out.println(stack.isEmpty());
//		System.out.println();
//		
//		//contains() test
//		System.out.println(stack.contains("딸기"));
//		System.out.println(stack.contains("포도"));
//		System.out.println();
//	
////		// peek() test
//		System.out.println(stack.peek());	
//		System.out.println(stack);
//		System.out.println(stack.size());
//		System.out.println(stack.isEmpty());
//		System.out.println();
		

/**********************************************************************************************************/
//		2) Stack 구현 및 테스트
////		Stack<String> stack = new ArrayStack<String>(String.class,3);
//		Stack<String> stack = new ArrayStack<String>(5);
//		
//		System.out.println(stack);
//		System.out.println(stack.size());
//		System.out.println(stack.isEmpty());
//		System.out.println();
//
//		// push() test
//		stack.push("딸기");
//		stack.push("포도");
//		
//		System.out.println(stack);
//		System.out.println(stack.size());
//		System.out.println(stack.isEmpty());
//		System.out.println();
//
//
//		// pop() test
//		System.out.println(stack.pop());
//		System.out.println(stack);
//		System.out.println(stack.size());
//		System.out.println(stack.isEmpty());
//		System.out.println();
//		
//		//contains() test
//		System.out.println(stack.contains("딸기"));
//		System.out.println(stack.contains("포도"));
//		System.out.println();
//		
//		// peek() test
//		System.out.println(stack.peek());
//		System.out.println(stack);
//		System.out.println(stack.size());
//		System.out.println(stack.isEmpty());
//		System.out.println();
		
		
/**********************************************************************************************************/		
//		// 1) 자바에서 제공하는 스택 테스트
//		Stack<String> stack = new Stack<>();
//		
//		System.out.println(stack);
//		System.out.println(stack.size());
//		System.out.println(stack.isEmpty());
//		System.out.println();
//		
//		// push() test
//		stack.push("딸기");
//		stack.push("포도");
//		
//		System.out.println(stack);
//		System.out.println(stack.size());
//		System.out.println(stack.isEmpty());
//		System.out.println();
//
//		// pop() test
//		System.out.println(stack.pop());
//		System.out.println(stack);
//		System.out.println(stack.size());
//		System.out.println(stack.isEmpty());
//		System.out.println();
//
//		//contains() test
//		System.out.println(stack.contains("딸기"));
//		System.out.println(stack.contains("포도"));
//		System.out.println();
//
//		// peek() test
//		System.out.println(stack.peek());
//		System.out.println(stack);
//		System.out.println();
	
	}
}
