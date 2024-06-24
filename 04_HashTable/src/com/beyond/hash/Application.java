package com.beyond.hash;

import com.beyond.hash.practice.HashTable;

public class Application {

	public static void main(String[] args) {
		
		HashTable<String, String> hashTable = new HashTable<>(3);
		System.out.println("isempty: " + hashTable.isempty());
		System.out.println();
		
		
		// put() test
		hashTable.put("strawberry", "딸기");
		hashTable.put("apple", "사과");
		hashTable.put("grape", "포도");

		hashTable.put("banana", "바나나");//키가 중복되는 경우
		hashTable.put("banana", "몽키바나나");
//		hashTable.put("melon", "멜론");
		
		System.out.println(hashTable);
		System.out.println();
		
		// get() test
		System.out.println(hashTable.get("banana"));
		System.out.println(hashTable.get("melon"));
		System.out.println();
		
		//remove() test
		System.out.println(hashTable.remove("banana"));//몽키바나나
		System.out.println(hashTable.remove("strawberry"));//딸기
		System.out.println(hashTable.remove("melon"));//null
		
		System.out.println(hashTable);
		System.out.println();
		
		// contains() test
		System.out.println(hashTable.contains("strawberry"));
		System.out.println(hashTable.contains("apple"));
		System.out.println();
		
		hashTable.put("peach", "복숭아");
		hashTable.put("orange", "오렌지");
		
		// size() test
		// 실제 저장된 데이터의 갯수
		System.out.println("size : " + hashTable.size());
		System.out.println();
		
		// isempty() test
		System.out.println("isempty: " + hashTable.isempty());
		System.out.println();
	}

}
