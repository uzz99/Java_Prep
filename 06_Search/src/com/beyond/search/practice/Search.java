package com.beyond.search.practice;

public class Search {
	
	
	public static int linearSearch(int[] numbers, int target) {
		
		// 벼열에서 특정 숫자의 인덱스를 찾는 메소드
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] == target) {
				return i;
			}
		}
		return -1;
	}
	
	// 문자열에서 특정 문자의 인덱스를 찾는 메소드
	
	public static int linearSearch(String str, char target) {

		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==(target)) {
				return i;
			}
		}
		return 1;
	}
	
	// 배열의 요소에서 가장 작은 값을 찾는 메소드
	public static int minVlue(int[] numbers) {
		int mn = 999999;
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i]<mn) {
				mn = numbers[i];
			}
		}
		return mn;
	}

	
	public static int binarySearch(int[] numbers, int target) {
		
		int left = 0;
		int right = numbers.length - 1;
		while(left <= right) {
			int mid = (left + right) / 2;
			
			if(numbers[mid] == target) {
				return mid;
			} else if (numbers[mid] < target) {
				left = mid + 1;
			}else {
				right = mid - 1;
			}
		}
		return -1;
	}

	
	// 배열에서 특정 숫자의 인덱스를 찾는 메소드(이진 탐색,  재귀호출 사용)
	public static int binarySearch(int[] numbers, int target, int left, int right) {
		
		if(left <= right) {
			int mid = left + (right - left) / 2;
			
			if (numbers[mid] == target) {
				return mid;
				
			}else if(numbers[mid] < target) {
				return binarySearch(numbers, target, mid + 1, right);
			}else {
				return binarySearch(numbers, target, left, mid - 1);
				
			}
		}
		return -1;
	}	

}
