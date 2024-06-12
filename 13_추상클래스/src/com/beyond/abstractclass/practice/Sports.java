package com.beyond.abstractclass.practice;

public abstract class Sports { // 추상 클래스
	// 단독으로 객체를 만들 수 없
	protected int numberOfPlayers;

	public Sports(int numberOfPlayers) {
		this.numberOfPlayers = numberOfPlayers;
	}
	
	// 추상 메소드
	// 각각 스포츠마다 그에 따른 룰을 반드시 재정의해야 한다.
	public abstract void rule();// 몸체가 x, {}사용하면 에러
	
}
