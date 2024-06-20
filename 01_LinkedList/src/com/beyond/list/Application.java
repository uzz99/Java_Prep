package com.beyond.list;

import com.beyond.list.practice.List;
import com.beyond.list.practice.SinglyLinkedList;

public class Application {

	public static void main(String[] args) {
		
//		new SinglyLinkedList<String>().new Node<String>();
		
//		new SinglyLinkedList.Node<T>()//static이면 해당 하는 노드 클래스 호출 ㄱㄴ
		
		// SinglyLinkedList 테스트
		List<String> list = new SinglyLinkedList<>();
		
		list.addFirst("사과");
		list.addFirst("딸기");
		
		System.out.println(list);
		System.out.println("size : " + list.size());
		System.out.println();
		
		list.addLast("포도");
		list.addLast("키위");
		
		System.out.println(list);
		System.out.println("size : " + list.size());
		System.out.println();
		
		list.add(0, "수박");
		list.add(5, "바나나");
		
		System.out.println(list);
		System.out.println("size : " + list.size());
		System.out.println();
				
//		list.add(2, "복숭아");
		list.add(5, "복숭아");
		
		System.out.println(list);
		System.out.println("size : " + list.size());
		System.out.println();		
		
		// get(), contains()
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(3));
		System.out.println(list.get(5));

		System.out.println(list.contains("딸기"));
		System.out.println(list.contains("두리안"));
		System.out.println(list.contains("바나나"));
		System.out.println(list.contains("참외"));
		System.out.println();
		
		// remove() 테스트
		list.removeFirst();
		
		System.out.println(list);
		System.out.println("size : " + list.size());
		System.out.println();
		
		list.removeLast();
//		list.removeLast();
//		list.removeLast();
//		list.removeLast();
//		list.removeLast();
//		list.removeLast();
		
		System.out.println(list);
		System.out.println("size : " + list.size());
		System.out.println();
		
//		list.remove(0);
//		list.remove(4);
//		list.remove(3);
		
//		System.out.println(list);
//		System.out.println("size : " + list.size());
//		System.out.println();
//		
		list.remove("포도");
		list.remove("복숭아");
		list.remove("두리안");
		
		System.out.println(list);
		System.out.println("size : " + list.size());
		System.out.println();
		

		
		
		
/*************************************************/
//		// 자바에서 제공하는 LinkedList 테스트
//		List<String> list = new LinkedList<>();
//		
//		// addFirst() 메소드 테스트(Java 21부터 지원)
//		list.addFirst("사과");
//		list.addFirst("딸기");
//		
//		// addLast() 메소드 테스트(Java 21부터 지원)
//		list.addLast("포도");
//		list.addLast("키위");
//		System.out.println(list);
//		System.out.println();
//		
//		// add() 메소드 테스트
//		list.add(1, "수박");// 1번 인덱스에 데이터 넣겠다
//		System.out.println(list);
//		System.out.println(list.size());
//		System.out.println();
//		
//		// get(), contains() 테스트
//		System.out.println(list.get(0));
//		System.out.println(list.contains("딸기"));
//		System.out.println(list.contains("바나나"));
//		System.out.println();
//		
//		// removeFirst 테스트
//		list.removeFirst();
//		
//		System.out.println(list);
//		System.out.println();
//		
//		// removeLast 테스트
//		list.removeLast();
//		
//		System.out.println(list);
//		System.out.println();
//		
//		// remove 테스트
//		list.remove(0);
//		
//		System.out.println(list);
//		System.out.println();
//
//		list.remove("포도");
//		
//		System.out.println(list);
//		System.out.println();
		
	}

}
