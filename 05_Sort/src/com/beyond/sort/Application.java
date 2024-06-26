package com.beyond.sort;

import java.util.Arrays;

import com.beyond.sort.practice.ArraySort;

public class Application {

	public static void main(String[] args) {
		// 삽입 정렬
//		int[] array = {3, 1, 5, 4, 9, 2};
		
//		System.out.println(Arrays.toString(array));
//		
//		ArraySort.insertionSort(array);
//		System.out.println(Arrays.toString(array));
//		System.out.println();

//		ArraySort.bubbleSort(array);
//		System.out.println(Arrays.toString(array));
//		System.out.println();


//		// 병합 정렬
//		ArraySort.mergeSort(array, 0, array.length - 1);
//		System.out.println(Arrays.toString(array));
//		System.out.println();

		int[] array = {3, 1, 5, 2, 9, 4};
		System.out.println(Arrays.toString(array));

		// 퀵 정렬
		ArraySort.quickSort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));
		System.out.println();
	}

}
