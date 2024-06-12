package com.beyond.abstractclass.practice;

public class FootBall extends Sports {
	private int numberOfPlayers;
	
	public FootBall(int numberOfPlayers) {
		super(numberOfPlayers);
//		this.numberOfPlayers = numberOfPlayers;
	}
	
	@Override
	public void rule() {
		System.out.printf("BasketBall의 선수의 수는 %d명, 손이 아닌 발로 공을 차야한다.\n",this.numberOfPlayers);
	}
}
