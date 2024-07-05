package com.beyond.greedy.practice;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

public class GreedyExample {
    // 1. 거스름돈 문제
    //    - 가장 적은 수의 동전으로 거스름돈을 주는 문제이다.
    public static int minCoins(int amount, int[] coins) {
        int count = 0;

        Arrays.sort(coins);
//        System.out.println(Arrays.toString(coins));

        for(int i = coins.length - 1; i >= 0; i--) {
            int sum = 0;
            while(amount >= coins[i]) {
                amount = amount - coins[i];

                count++;
                sum++;
            }
            System.out.printf("%d원 동전은 %d개가 필요합니다.\n", coins[i], sum);
        }

        return count;
    }

    
    // 2. 활동 선택 문제
    // 	- 최대한 많은 활동을 선택할 수 있는 활동의 최대 개수를 구하는 문제
    public static int maxActivities(int[][] activities) {
    	
    	int count = 0;
    	
    	// 1. 활동을 종료 시간 기준으로 정렬
    	// 이차원 배열을 단순 정렬하면 에러//    	Arrays.sort(activities);
    	Arrays.sort(activities, Comparator.comparingInt(values-> values[1]));

//    	for (int i = 0; i < activities.length; i++) {
//			for (int j = 0; j < activities[i].length; j++) {
//				System.out.print(activities[i][j] + " ");
//			}System.out.println();
//		}
    	
    	// 2. 첫 번째 활동을 선택
    	int lastEndTime = activities[0][1];
    	
    	System.out.printf("활동 시작 시간 : %d,  활동 종료 시간 : %d\n", activities[0][0], activities[0][1]);

    	// 3. 현재 선택된 활동의 종료 시간 이후에 시작하는 활동이 없을 때까지 반복 수행
    	for (int i = 1; i < activities.length; i++) {
    		if(activities[i][0] >= lastEndTime) {
    			
    			count++;
    			
    			System.out.printf("활동 시작 시간 : %d,  활동 종료 시간 : %d\n", activities[i][0], activities[i][1]);

    			lastEndTime = activities[i][1];
    			
    		}
    		
		}
    	
    	return count;
    }
}