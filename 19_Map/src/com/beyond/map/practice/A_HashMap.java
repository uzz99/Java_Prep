package com.beyond.map.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class A_HashMap {
	
	
	public void method1() {
//		Map<String, Snack> map = new HashMap<>();
		Map<String, Snack> map = new TreeMap<>();//정렬이 됨
		
		System.out.println(map.isEmpty());
		System.out.println();
		
		map.put("다이제", new Snack("다이제","초코맛",1000));
		map.put("칸쵸", new Snack("칸쵸","초코맛",250));
		map.put("프링글스", new Snack("프링글스","어니언맛",500));
		map.put("프링글스", new Snack("프링글스","짠맛",400));
		map.put("먹태깡", new Snack("먹태깡","청양마요",300));
		map.put("초코파이", new Snack("초코파이","오리지널",200));
		map.put("초코파이", new Snack("초코파이","바나나",200));//동일한 키 값이면 마지막에 입력된 것이 추가
		
		System.out.println(map.isEmpty());
		System.out.println(map);
		System.out.println();
		
		//key에 해당하는 value를 얻어오는 메소드
		Snack snack = map.get("다이제");

		System.out.println(snack);
		System.out.println();
		
		System.out.println(map.size());
		System.out.println();

		// 키 값에 해당하는 entry 객체를 삭제하는 메소드
		map.remove("먹태깡");
		System.out.println(map);
		System.out.println(map.size());
		System.out.println();
		
		// 모든 entry 객체를 삭제하는 메소드
		map.clear();

		System.out.println(map);
		System.out.println(map.size());
		System.out.println(map.isEmpty());
		System.out.println();
		
		
	}

	public void method2() {
		Map<String, Snack> map = new HashMap<>();
		
		map.put("다이제", new Snack("다이제","초코맛",1000));
		map.put("칸쵸", new Snack("칸쵸","초코맛",250));
		map.put("프링글스", new Snack("프링글스","어니언맛",500));
		map.put("프링글스", new Snack("프링글스","짠맛",400));
		map.put("먹태깡", new Snack("먹태깡","청양마요",300));
		map.put("초코파이", new Snack("초코파이","오리지널",200));
		map.put("초코파이", new Snack("초코파이","바나나",200));//동일한 키 값이면 마지막에 입력된 것이 추가
/*
 1. Map은 인덱스의 개념이 없어서 반복문을 사용할 수 없다.
		for(int i = 0; i < map.size();i++) {
		}

 2. Map은 iterable 인터페이스를 구현하지 않아서 향상된 for문을 사용할 수 x
		for (Entry<String, Snack> snac: map) {
			
		}
	
맵은 컬렉션 객체를 구현하지 않기 때문에 arraylist도 불가능
 List와 map은 구조가 달라서 arrayList에 담아서 사용 x
		new ArrayList<>(map);
*/
		
		
		
		
		
		
		
		
		
		
		
		// 1. keySet() 메소드 이용
		//		- Map 컬렉션에 있는 키 값들만 Set에 담아서 반환
		Set<String> set = map.keySet();
		
		for (String key : set) {
			System.out.printf("key : %s, values : %s\n",key, map.get(key));
		}
		System.out.println();
		
		// 2. entrySet() 메소드를 이용하는 방법
		// 		- Map 컬렉션에 있는 Entry 객체(Key, value 쌍으로 이루어진)를 Set 컬렉션에 담아서 반환
		Set<Entry<String, Snack>> entrySet = map.entrySet();
		
		for (Entry<String, Snack> entry : entrySet) {
			System.out.printf("key : %s, values : %s\n",entry.getKey(), entry.getValue());
		}
		System.out.println();
		
	}
}
