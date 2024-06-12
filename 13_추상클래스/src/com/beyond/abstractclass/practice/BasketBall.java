package com.beyond.abstractclass.practice;

public class BasketBall extends Sports{

	private int numberOfPlayers;
	
	public BasketBall(int numberOfPlayers) {
		//super()가 생략되어 있으면 기본 생성자를 통해서 객체 생성
		super(numberOfPlayers);
		//this.numberOfPlayers = numberOfPlayers;
	}
	
	@Override
	public void rule() {
		System.out.printf("BasketBall의 선수의 수는 %d명, 공을 던져서 링에 넣어야한다.",this.numberOfPlayers);
		System.out.println();
	}
}
