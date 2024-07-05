package com.beyond.dynamic.practice;

import java.util.HashMap;
import java.util.Map;

public class DynamicExample {
	private static Map<Long, Long> memo = new HashMap<>();

	
	// 1. 반복문으로 구현
//	public static int fibonacci(int n) {
//		
//		if(n <= 1) {
//			return n;
//		}
//		int[] values = new int[n + 1];
//		
//		values[0] = 0;
//		values[1] = 1;
//		b
//		for (int i = 2; i < values.length; i++) {
//			values[i] = values[i - 1] + values[i - 2];
//		}
//		
//		return values[n];
//		
//	}
	
//	// 2. 재귀 호출로 구현
//	public static int fibonacci(int n) {
//		if(n <= 1) {
//			return n;
//		}else {
//			return fibonacci(n-1) + fibonacci(n-2);
//		}
//	}



	public static long fibonacci(long n) {
		if(n <= 1) {
			return n;
		}else if(memo.containsKey(n)) {
			return memo.get(n);
		}else {
			long result = fibonacci(n - 1) + fibonacci(n - 2);
			memo.put(n, result);
			return result;
		}
	}
}
