package com.beyond.search;

import com.beyond.search.practice.Search;

public class Application {

	public static void main(String[] args) {

		int[] numbers = {3, 8, 5 ,4, 9, 2};
//		String str = "안녕하세요";
		String str = "Hello world";
		
		System.out.println(Search.linearSearch(numbers, 9));
		System.out.println(Search.linearSearch(str, 'e'));
		System.out.println(Search.minVlue(numbers));
		
		System.out.println();
		// 이진 탐색(정렬된 데이터가 있어야 함)
		numbers = new int[]{2, 3, 5, 9, 12, 15, 30};
		
		System.out.println(Search.binarySearch(numbers, 30));
		
		System.out.println(Search.binarySearch(numbers, 5, 0, numbers.length - 1));
		System.out.println();
	}

}
